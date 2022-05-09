package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.MedicalCard;
import com.zhongshan.entity.Registered;
import com.zhongshan.mapper.personBase_mapper.MedicalCardMapper;
import com.zhongshan.service.personBase.MedicalCardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class MedicalCardServiceImpl extends ServiceImpl<MedicalCardMapper,MedicalCard>
        implements MedicalCardService {
    @Resource
    private MedicalCardMapper medicalCardMapper;
    @Override
    public boolean updateState(String personsNo) {
        MedicalCard medicalCard=new MedicalCard();
        medicalCard.setState("挂失");
        QueryWrapper<MedicalCard> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("persons_no",personsNo);
        int rows=medicalCardMapper.update(medicalCard,queryWrapper);
        return rows>0?true:false;
    }

    @Override
    public boolean addMedicalCard(MedicalCard medicalCard) {
        int rows=medicalCardMapper.insert(medicalCard);
        return rows>0?true:false;
    }
}

