package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.MedicalCard;
import com.zhongshan.entity.Registered;
import com.zhongshan.entity.vo.PrescriptionsVo;
import com.zhongshan.mapper.personBase_mapper.MedicalCardMapper;
import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<MedicalCard> selectAllMedicalCard() {
        List<MedicalCard> list=medicalCardMapper.selectList(null);
        return list;
    }

    @Override
    public List<MedicalCard> selectmedicalCard(String personsNo) {
        QueryWrapper<MedicalCard> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("persons_no",personsNo);
        List<MedicalCard> list=medicalCardMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean addGetPrice(PrescriptionsVo prescriptionsVo) {

        return false;
    }
}

