package com.zhongshan.service.inpatient.impl;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.zhongshan.entity.inpatient.Uh04DayCureExpense;
import com.zhongshan.entity.inpatient.vo.WardUseVo;
import com.zhongshan.mapper.Uh04CrueInfoExpenseMapper;
import com.zhongshan.mapper.inpatient.WardUseMapper;
import com.zhongshan.service.inpatient.PatientBaseService;
import com.zhongshan.service.inpatient.Uh04DayCureExpenseService;
import com.zhongshan.mapper.Uh04DayCureExpenseMapper;
import com.zhongshan.service.inpatient.WardUseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh04_day_cure_expense】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
@Slf4j
public class Uh04DayCureExpenseServiceImpl extends ServiceImpl<Uh04DayCureExpenseMapper, Uh04DayCureExpense>
    implements Uh04DayCureExpenseService{
    @Resource
    private WardUseService wardUseService;
    @Resource
    private WardUseMapper wardUseMapper;
    @Resource
    private Uh04CrueInfoExpenseMapper uh04CrueInfoExpenseMapper;
    @Resource
    private PatientBaseService patientBaseService;

    //汇总产生当日分户各项医疗费用日结记录
    @Scheduled(cron = "0 0 0 * * ?")
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public void scheduledTask(){
        //自动写入“分户医疗费用日结表”。统计过程中自动将自费或劳保病人当日费用开支填入“自费病人资金使用情况表”
        //汇总产生当日住院部各项医疗费用帐目，并自动写入“总帐”及明细帐。
        List<WardUseVo> wardUseVos = wardUseMapper.totalWardUse();
        //拿到所有住院数据,进行处理
        for (WardUseVo wardUseVo : wardUseVos) {
            String patientNo = wardUseVo.getPatientNo();
            if (patientNo !=null){
                int count=1;
                //今日总支出
                double ownExpense = 0;
                //床位费
                if (wardUseVo.getPrice()!=null) {
                    ownExpense += wardUseVo.getPrice();
                }
                String subjectCode = count++ +"、床位费:"+ wardUseVo.getPrice();
                QueryWrapper<Uh04CrueInfoExpense> wrapper = new QueryWrapper<>();
                wrapper.le("to_days(CURDATE()) - to_days(recipe_date)",2).eq("patient_no",patientNo);
                List<Uh04CrueInfoExpense> uh04CrueInfoExpenses = uh04CrueInfoExpenseMapper.selectList(wrapper);
                //
                PatientBase patientBase = patientBaseService.getById(patientNo);
                Uh04CrueInfoExpense crueInfoExpense = new Uh04CrueInfoExpense(patientBase);
                crueInfoExpense.setExponse(wardUseVo.getPrice());
                crueInfoExpense.setSectionCode(wardUseVo.getSection());
                crueInfoExpense.setUnitPrice(wardUseVo.getPrice());
                uh04CrueInfoExpenseMapper.insert(crueInfoExpense);
                for (Uh04CrueInfoExpense uh04CrueInfoExpense : uh04CrueInfoExpenses) {
                    //分户医疗费用明细
                    if (uh04CrueInfoExpense.getExponse()!=null) {
                        ownExpense += uh04CrueInfoExpense.getExponse();
                    }
                    subjectCode += count++ +"、"+ uh04CrueInfoExpense.getCureType()+":"+ uh04CrueInfoExpense.getExponse();
                }
                Uh04DayCureExpense expense = new Uh04DayCureExpense(patientNo, DateUtil.yesterday(),subjectCode,ownExpense,"F");
                baseMapper.insert(expense);
                log.info(DateUtil.yesterday()+":"+subjectCode);
            }

        }
    }
}




