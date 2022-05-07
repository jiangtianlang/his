package com.zhongshan.service;

import com.zhongshan.entity.Sp05DiseaseCode;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【sp05_disease_code】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Sp05DiseaseCodeService extends IService<Sp05DiseaseCode> {

    R insertDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode);

    R updateDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode);

    R deleteDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode);

    R queryDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode);
}
