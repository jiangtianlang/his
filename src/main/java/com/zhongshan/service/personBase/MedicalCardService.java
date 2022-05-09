package com.zhongshan.service.personBase;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.MedicalCard;


public interface MedicalCardService extends IService<MedicalCard> {
    boolean updateState(String personsNo);

    boolean addMedicalCard(MedicalCard medicalCard);
}
