package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.uuid.Generators;
import com.zhongshan.entity.*;
import com.zhongshan.entity.vo.GetPrescription;
import com.zhongshan.entity.vo.PrescriptionVo;
import com.zhongshan.entity.vo.PrescriptionsVo;
import com.zhongshan.mapper.DoctorMapper;
import com.zhongshan.mapper.Uh03PriceCDbfMapper;
import com.zhongshan.mapper.Uh03StoreOutCMapper;
import com.zhongshan.service.PrescriptionService;
import com.zhongshan.mapper.PrescriptionMapper;
import com.zhongshan.service.Uh03OnStoreCService;
import com.zhongshan.service.Uh03PriceCDbfService;
import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.service.personBase.RegisteredService;
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
    private Uh03PriceCDbfMapper uh03PriceCDbfMapper;
    @Resource
    private Uh03OnStoreCService uh03OnStoreCService;
    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private Uh03StoreOutCMapper uh03StoreOutCMapper;
    @Resource
    private RegisteredService registeredService;
     @Override
     public List<Prescription> selectGetPrice(Prescription prescription) {
         QueryWrapper<Prescription> queryWrapper=new QueryWrapper<>();
         if(StringUtils.isNotBlank(prescription.getName())){
             queryWrapper.like("name",prescription.getName());
         }
         if(prescription.getMediName()!=null) {
             queryWrapper.like("medi_name" ,prescription.getMediName());
         }
         if(prescription.getPersonsNo()!=null){
             queryWrapper.eq("persons_no",prescription.getPersonsNo());
         }
         List<Prescription> list=prescriptionMapper.selectList(queryWrapper);
            return list;
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public R addGetPrice(GetPrescription getPrescription) {
        String personsNo=getPrescription.getPersonsNo();
        //查询就诊卡号是否存在
        List<MedicalCard> list=medicalCardService.selectmedicalCard(personsNo);
        if(list.size()==0){
            return R.ok().message("还没有该医疗卡信息，请重新输入");
        }
        List<Registered> list2=registeredService.selectByPersonsNo(getPrescription.getPersonsNo());
        if(list2.size()==0){
            return R.ok().message("您还没有挂号哦");
        }
        List<Uh03OnStoreC> list1=uh03OnStoreCService.selectQuantity(getPrescription.getMediNo());
        if(getPrescription.getQuantity()>list1.get(0).getQuantity()||list1.get(0).getQuantity()<1){
            return R.ok().message("库存不足");
        }
        //修改在库药品数量（out_no	 出库单号，medi_no	 药品代码，specification	 规格，unit	 单位，unit_price	 单价，quantity	 数量
        //out_date	 出库日期，department	 部门）
        UpdateWrapper<Uh03OnStoreC> updateWrapper=new UpdateWrapper<>();
        System.out.println(getPrescription.getMediNo());
        updateWrapper.eq("medi_no",getPrescription.getMediNo());
        //updateWrapper.set("medi_no",uh03PriceCDbf.getMediNo());
        updateWrapper.set("quantity",list1.get(0).getQuantity()-getPrescription.getQuantity());
        Uh03PriceCDbf uh03PriceCDbf=uh03PriceCDbfService.getById(getPrescription.getMediNo());
        boolean b=uh03OnStoreCService.update(updateWrapper);
        //添加出库药品信息
            Uh03StoreOutC uh03StoreOutC=new Uh03StoreOutC();
            uh03StoreOutC.setOutNo(Generators.timeBasedGenerator().generate().toString());
            //出库单号
         System.out.println(uh03StoreOutC.getOutNo());
            uh03StoreOutC.setMediNo(getPrescription.getMediNo());
            //药品ID
        System.out.println(uh03StoreOutC.getMediNo());
            uh03StoreOutC.setSpecification(uh03PriceCDbf.getSpecification());

        System.out.println(uh03StoreOutC.getSpecification());
            uh03StoreOutC.setUnit(uh03PriceCDbf.getUnit());
        System.out.println(uh03StoreOutC.getUnit());
            uh03StoreOutC.setUnitPrice(uh03PriceCDbf.getUnitPrice());
        System.out.println(uh03StoreOutC.getUnitPrice());
            uh03StoreOutC.setQuantity(getPrescription.getQuantity());
            QueryWrapper<Doctor> queryWrapper1=new QueryWrapper<>();
            queryWrapper1.eq("doctor_no",getPrescription.getDoctorNo());
            uh03StoreOutC.setDepartment(doctorMapper.selectOne(queryWrapper1).getSubjectName());
            Prescription prescription=new Prescription();
            prescription.setDoctorName(doctorMapper.selectById(getPrescription.getDoctorNo()).getDoctorName());
            prescription.setMediName(uh03PriceCDbfMapper.selectById(getPrescription.getMediNo()).getMediName());
            prescription.setPersonsNo(getPrescription.getPersonsNo());
            prescription.setQuantity(getPrescription.getQuantity());
            prescription.setSubjectNo(doctorMapper.selectOne(queryWrapper1).getSubjectName());
            prescription.setName(getPrescription.getName());
            int rowss=prescriptionMapper.insert(prescription);
            int rows=uh03StoreOutCMapper.insert(uh03StoreOutC);
            if(rows>0){
                return R.ok().message("新增成功");
            }else{
                return R.error().message("新增失败");
            }
//        Doctor doctor=doctorMapper.selectOne(queryWrapper1);
//        uh03StoreOutC.setDepartment(doctorMapper.selectOne(queryWrapper1).getSubjectName());
//        uh03StoreOutC.setQuantity(prescription.getQuantity());
//         int rows=uh03StoreOutCMapper.insert(uh03StoreOutC);
//        if(rows>){}
//        return rows>0?true:false;
    }

    @Override
//    @Transactional(
//            rollbackFor = {Exception.class}
//    )
    public boolean updateGetPrice(Prescription prescription) {
         int rows=prescriptionMapper.updateById(prescription);
        //修改在库药品数量（out_no	 出库单号，medi_no	 药品代码，specification	 规格，unit	 单位，unit_price	 单价，quantity	 数量
        //out_date	 出库日期，department	 部门）
        //先根据药品名称查到药品Id
//        Uh03PriceCDbf uh03PriceCDbf=uh03PriceCDbfService.selectQuantity(prescription.getMedi_name());
//        List<Uh03OnStoreC> list1=uh03OnStoreCService.selectQuantity(uh03PriceCDbf.getMediNo());
//        UpdateWrapper<Uh03OnStoreC> updateWrapper=new UpdateWrapper<>();
//        updateWrapper.set("medi_no",uh03PriceCDbf.getMediNo());
//        updateWrapper.set("quantity",list1.get(0).getQuantity()-prescription.getQuantity()-prescription.getQuantity());
        return rows>0?true:false;
    }

    @Override
    public List<Prescription> selectAll(Prescription prescription) {
         List<Prescription> list=prescriptionMapper.selectList(null);
        return list;
    }


}




