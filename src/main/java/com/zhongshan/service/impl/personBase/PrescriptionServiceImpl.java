package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Prescription;
import com.zhongshan.entity.vo.PrescriptionVo;
import com.zhongshan.entity.vo.PrescriptionsVo;
import com.zhongshan.service.PrescriptionService;
import com.zhongshan.mapper.PrescriptionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【prescription】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionMapper, Prescription>
    implements PrescriptionService{
     @Resource
     private PrescriptionMapper prescriptionMapper;
     @Override
     public List<PrescriptionsVo> selectGetPrice(PrescriptionVo prescriptionVo) {
//         QueryWrapper<PrescriptionVo> queryWrapper=new QueryWrapper<>();
//         if(StringUtils.isNotBlank(prescriptionVo.getName())){
//             queryWrapper.like("name",prescriptionVo.getName());
//         }
//         if(prescriptionVo.getStartTodayDate()!=null
//                 && prescriptionVo.getEndTodayDate()!=null){
//             queryWrapper.between("today_date",
//                     prescriptionVo.getStartTodayDate(),
//                     prescriptionVo.getEndTodayDate());
//         }
//         if(prescriptionVo.getPersonsNo()!=null){
//             queryWrapper.like("personsNo",prescriptionVo.getPersonsNo());
//         }
//         if(prescriptionVo.getMediNo()!=null){
//             queryWrapper.like("mediNo",prescriptionVo.getMediNo());
//         }
//         System.out.println(queryWrapper);
         List<PrescriptionsVo> list=prescriptionMapper.selectGetPrice(prescriptionVo);
        return list;
    }

    @Override
    public boolean addGetPrice(Prescription prescription) {
         int rows=prescriptionMapper.insert(prescription);
        return rows>0?true:false;
    }

    @Override
    public boolean updateGetPrice(Prescription prescription) {
         int rows=prescriptionMapper.updateById(prescription);
        return rows>0?true:false;
    }


}




