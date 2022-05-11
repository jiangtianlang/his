package com.zhongshan.service.personBase;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.MedicalCard;
import com.zhongshan.entity.vo.PrescriptionsVo;

import java.util.List;


public interface MedicalCardService extends IService<MedicalCard> {
    boolean updateState(String personsNo);

    boolean addMedicalCard(MedicalCard medicalCard);

    List<MedicalCard> selectAllMedicalCard();

    List<MedicalCard> selectmedicalCard(String personsNo);


    List<MedicalCard> selectMedicalCardById(String personsNo);

    List<MedicalCard> selectMedicalCardByName(String personsNo);
}
