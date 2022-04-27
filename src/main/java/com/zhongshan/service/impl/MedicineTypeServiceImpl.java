package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.MedicineType;
import com.zhongshan.service.MedicineTypeService;
import com.zhongshan.mapper.MedicineTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【medicine_type】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class MedicineTypeServiceImpl extends ServiceImpl<MedicineTypeMapper, MedicineType>
    implements MedicineTypeService{

}




