package com.zhongshan.service.inpatient.impl;

import cn.hutool.core.util.IdcardUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.*;
import com.zhongshan.mapper.PayMoneyMapper;
import com.zhongshan.service.inpatient.*;
import com.zhongshan.mapper.PatientBaseMapper;
import com.zhongshan.utils.ValidatorUtil;
import com.zhongshan.utils.result.ResultCodeEnum;
import com.zhongshan.utils.result.ResultData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;

/**
* @author 13427
* @description 针对表【patient_base】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PatientBaseServiceImpl extends ServiceImpl<PatientBaseMapper, PatientBase>
    implements PatientBaseService{
    @Resource
    private PatientBaseMapper patientBaseMapper;
    @Resource
    private PayMoneyService payMoneyService;
    @Resource
    private WardUseService wardUseService;
    @Resource
    private WardService wardService;
    @Resource
    private Uh04OwnExpenseService ownExpenseService;

    @Transactional(
            rollbackFor = {Exception.class}
    )
    public ResultData savePatientBase(PatientBase patientBase) {
        String patientNo = patientBase.getPatientNo();
        PatientBase selectById = patientBaseMapper.selectById(patientNo);
        if (selectById!=null) {
            return ResultData.error().message("重复录入").data("data",selectById);
        }
        //数据校验
        if (!IdcardUtil.isValidCard(patientBase.getCapacityNo())) {
            //身份证不合法
            return ResultData.error(ResultCodeEnum.PARAM_ERROR).message("身份证不合法");
        }
        try {
            patientBase.setBirthDate(new SimpleDateFormat("yyyyMMdd").parse(IdcardUtil.getBirthByIdCard(patientBase.getCapacityNo())));
        } catch (ParseException e) {
            e.printStackTrace();
            return ResultData.error(ResultCodeEnum.PARAM_ERROR).message("身份证获取生日失败");
        }
        if (!ValidatorUtil.isMobile(patientBase.getHeTel())){
            return ResultData.error(ResultCodeEnum.PARAM_ERROR).message("手机号格式不对!");
        }
        //而对于第一次住院病人则自动为其产生住院号码，
        if (StringUtils.isEmpty(patientNo)){
            return ResultData.error(ResultCodeEnum.PARAM_ERROR).message("住院号有误!");
        }
        PayMoney payMoney;

        //当病人基本资料确认无误后，即写入“病人基本资料表”中。
        payMoney = new PayMoney(patientBase);
        //并将交款资料自动填入“病人预交款情况登记表”及
        payMoneyService.save(payMoney);
        //累加填入“自费病人资金使用情况表”，
        Uh04OwnExpense ownExpense = new Uh04OwnExpense(patientBase);
        ownExpenseService.save(ownExpense);
        //更新床位使用表
        WardUse wardUse = new WardUse(patientBase);
        wardUseService.save(wardUse);
        Ward ward = new Ward(wardUse,0);
        wardService.updateById(ward);

        if (!super.save(patientBase)) {
            return ResultData.error().message("录入失败!!请稍后重试");
        } else {
            //同时自动打印交款单据。
            return ResultData.ok().data("交款单据",payMoney);
        }
    }

}




