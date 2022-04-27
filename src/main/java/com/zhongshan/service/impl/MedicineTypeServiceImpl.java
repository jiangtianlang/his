package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.MedicineTypeDao;
import com.zhongshan.entity.MedicineType;
import com.zhongshan.service.MedicineTypeService;
import org.springframework.stereotype.Service;

/**
 * (MedicineType)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("medicineTypeService")
public class MedicineTypeServiceImpl extends ServiceImpl<MedicineTypeDao, MedicineType> implements MedicineTypeService {

}
