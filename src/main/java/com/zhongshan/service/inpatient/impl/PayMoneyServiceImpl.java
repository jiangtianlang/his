package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.entity.inpatient.PayMoney;
import com.zhongshan.service.inpatient.PatientBaseService;
import com.zhongshan.service.inpatient.PayMoneyService;
import com.zhongshan.mapper.PayMoneyMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
* @author 13427
* @description 针对表【pay_money】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PayMoneyServiceImpl extends ServiceImpl<PayMoneyMapper, PayMoney>
    implements PayMoneyService{
    @Resource
    private PatientBaseService patientBaseService;
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public boolean updateById(PayMoney entity) {
        PatientBase patientBase = new PatientBase();
        patientBase.setPatientNo(entity.getPatientNo());
        patientBase.setPayMoney(entity.getMoney());
        if (patientBaseService.updateById(patientBase) && super.updateById(entity)) {
            return true;
        } else {
            return false;
        }
    }
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
            List<PayMoney> payMonies = baseMapper.selectBatchIds(idList);
            for (PayMoney payMoney : payMonies) {
                PatientBase patientBase = new PatientBase();
                patientBase.setPatientNo(payMoney.getPatientNo());
                patientBase.setPayMoney(0.0);
                patientBaseService.updateById(patientBase);
            }
            return super.removeByIds(idList);
    }
}




