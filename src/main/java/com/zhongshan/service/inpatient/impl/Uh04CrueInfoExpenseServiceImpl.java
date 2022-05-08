package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.Subject;
import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.zhongshan.entity.vo.Income;
import com.zhongshan.mapper.inpatient.SubjectMapper;
import com.zhongshan.service.inpatient.Uh04CrueInfoExpenseService;
import com.zhongshan.mapper.Uh04CrueInfoExpenseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh04_crue_info_expense】的数据库操作Service实现
* @createDate 2022-05-04 20:07:41
*/
@Service
public class Uh04CrueInfoExpenseServiceImpl extends ServiceImpl<Uh04CrueInfoExpenseMapper, Uh04CrueInfoExpense>
    implements Uh04CrueInfoExpenseService{

    @Resource
    private SubjectMapper subjectMapper;
    @Override
    public HashMap<String, Double> selectByDate(Integer year, Integer month) {
        List<Income> incomes = baseMapper.selectByDate(year, month);
        List<Subject> subjects = subjectMapper.selectList(null);
        HashMap<String, Double> map = new HashMap<>();
        for (Subject subject : subjects) {
            map.put(subject.getSubjectName(),0.0);
        }
        for (Income income : incomes) {
            map.replace(income.getSubjectName(),income.getExponse());
        }
        return map;
    }
}




