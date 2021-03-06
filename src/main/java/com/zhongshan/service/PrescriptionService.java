package com.zhongshan.service;

import com.zhongshan.entity.Prescription;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.vo.GetPrescription;
import com.zhongshan.entity.vo.PrescriptionVo;
import com.zhongshan.entity.vo.PrescriptionsVo;
import com.zhongshan.utils.result.R;

import java.util.List;

/**
* @author 13427
* @description 针对表【prescription】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface PrescriptionService extends IService<Prescription> {

    List<Prescription> selectGetPrice(Prescription prescription);

    R addGetPrice(GetPrescription getPrescription);

    boolean updateGetPrice(Prescription prescription);

    List<Prescription> selectAll(Prescription prescription);
}
