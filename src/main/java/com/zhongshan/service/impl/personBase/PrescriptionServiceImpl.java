package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.uuid.Generators;
import com.zhongshan.entity.*;
import com.zhongshan.entity.vo.PrescriptionVo;
import com.zhongshan.entity.vo.PrescriptionsVo;
import com.zhongshan.mapper.DoctorMapper;
import com.zhongshan.mapper.Uh03StoreOutCMapper;
import com.zhongshan.service.PrescriptionService;
import com.zhongshan.mapper.PrescriptionMapper;
import com.zhongshan.service.Uh03OnStoreCService;
import com.zhongshan.service.Uh03PriceCDbfService;
import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Resource
    private MedicalCardService medicalCardService;
    @Resource
    private Uh03PriceCDbfService uh03PriceCDbfService;
    @Resource
    private Uh03OnStoreCService uh03OnStoreCService;
    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private Uh03StoreOutCMapper uh03StoreOutCMapper;
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
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public R addGetPrice(Prescription prescription) {
        String personsNo=prescription.getPersonsNo();
        //查询就诊卡号是否存在
        List<MedicalCard> list=medicalCardService.selectmedicalCard(personsNo);
        System.out.println("------1--------");
        if(list.size()==0){
            return R.ok().message("还没有该医疗卡信息，请重新输入");
        }
        //查询药品价格表（medi_no	 药品代码，specification	 规格，unit	 单位，unit_price	 单价，medi_name	 药品名，quality	 性质，store_limit	 库存下限）
        Uh03PriceCDbf uh03PriceCDbf=uh03PriceCDbfService.selectQuantity(prescription.getMedi_name());
        System.out.println(uh03PriceCDbf.getMediNo());
        System.out.println("66666666666");
        List<Uh03OnStoreC> list1=uh03OnStoreCService.selectQuantity(uh03PriceCDbf.getMediNo());
        System.out.println("22222222222222");
        if(prescription.getQuantity()>list1.get(0).getQuantity()||list1.get(0).getQuantity()<1){
            return R.ok().message("库存不足");
        }
        //修改在库药品数量（out_no	 出库单号，medi_no	 药品代码，specification	 规格，unit	 单位，unit_price	 单价，quantity	 数量
        //out_date	 出库日期，department	 部门）
        UpdateWrapper<Uh03OnStoreC> updateWrapper=new UpdateWrapper<>();
        updateWrapper.set("medi_no",uh03PriceCDbf.getMediNo());
        updateWrapper.set("quantity",list1.get(0).getQuantity()-prescription.getQuantity());
        System.out.println("33333333333333");
        boolean b=uh03OnStoreCService.update(updateWrapper);
        //添加出库药品信息
        Uh03StoreOutC uh03StoreOutC=new Uh03StoreOutC();
        uh03StoreOutC.setOutNo(Generators.timeBasedGenerator().generate().toString());
        uh03StoreOutC.setMediNo(uh03PriceCDbf.getMediNo());
        uh03StoreOutC.setSpecification(uh03PriceCDbf.getSpecification());
        uh03StoreOutC.setUnit(uh03PriceCDbf.getUnit());
        uh03StoreOutC.setUnitPrice(uh03PriceCDbf.getUnitPrice());
        QueryWrapper<Doctor> queryWrapper1=new QueryWrapper<>();
        queryWrapper1.eq("doctor_name",prescription.getDoctor_name());
        Doctor doctor=doctorMapper.selectOne(queryWrapper1);
        uh03StoreOutC.setDepartment(doctorMapper.selectOne(queryWrapper1).getSubjectName());
        uh03StoreOutC.setQuantity(prescription.getQuantity());
        System.out.println("444444444444");
         int rows=uh03StoreOutCMapper.insert(uh03StoreOutC);
         if(rows>0){
             return R.ok().message("新增成功");
         }else{
             return R.error().message("新增失败");
        }
//        if(rows>){}
//        return rows>0?true:false;
    }

    @Override
    public boolean updateGetPrice(Prescription prescription) {
         int rows=prescriptionMapper.updateById(prescription);
        return rows>0?true:false;
    }


}




