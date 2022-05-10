package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh03MonthBalanceC;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03StoreOutC;
import com.zhongshan.entity.vo.Uh03StoreInCVo;
import com.zhongshan.entity.vo.Uh03StoreOutVo;
import com.zhongshan.mapper.Uh03MonthBalanceCMapper;
import com.zhongshan.mapper.Uh03OnStoreCMapper;
import com.zhongshan.mapper.Uh03StoreWMapper;
import com.zhongshan.service.Uh03StoreOutCService;
import com.zhongshan.mapper.Uh03StoreOutCMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_store_out_c】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh03StoreOutCServiceImpl extends ServiceImpl<Uh03StoreOutCMapper, Uh03StoreOutC>
    implements Uh03StoreOutCService{
@Resource
Uh03StoreOutCMapper uh03StoreOutCMapper;
@Resource
    Uh03OnStoreCMapper uh03OnStoreCMapper;
@Resource
    Uh03MonthBalanceCMapper uh03MonthBalanceCMapper;
@Resource
    Uh03StoreWMapper uh03StoreWMapper;
    Calendar calendar = Calendar.getInstance();
    //记得要+1
    int month = calendar.get(Calendar.MONTH) + 1;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int insertBatch(List<Uh03StoreOutC> uh03StoreOutCS) {
        if (CollectionUtils.isEmpty(uh03StoreOutCS)) {
            return 0;
        }
        if (uh03StoreOutCS.size()==1){
            if (uh03OnStoreCMapper.selectByCount(uh03StoreOutCS.get(0).getMediNo(),uh03StoreOutCS.get(0).getQuantity()).size()>0){
                return -2;
            }
            if (uh03OnStoreCMapper.selectById(uh03StoreOutCS.get(0).getMediNo()) == null){
               return -1;
            }else {
                Uh03StoreOutC uh03StoreOutC=new Uh03StoreOutC(uh03StoreOutCS.get(0).getUnitPrice(),uh03StoreOutCS.get(0).getMediNo(),uh03StoreOutCS.get(0).getOutNo(),uh03StoreOutCS.get(0).getSpecification(),uh03StoreOutCS.get(0).getUnit(),uh03StoreOutCS.get(0).getQuantity(),uh03StoreOutCS.get(0).getDepartment());
                String specification=uh03OnStoreCMapper.findSpe(uh03StoreOutCS.get(0).getMediNo());
               uh03StoreOutC.setSpecification(specification);
                //System.out.println("22222222222222222222222"+specification);
                String unit=uh03OnStoreCMapper.findUnit(uh03StoreOutCS.get(0).getMediNo());
                uh03StoreOutC.setUnit(unit);
                 uh03StoreOutCMapper.insert(uh03StoreOutC);

                uh03OnStoreCMapper.updateBybyOutno(uh03StoreOutCS.get(0).getMediNo(), uh03StoreOutCS.get(0).getQuantity());
            }
            if (uh03MonthBalanceCMapper.selectById(uh03StoreOutCS.get(0).getMediNo())==null){
                Uh03MonthBalanceC uh03MonthBalanceC=new Uh03MonthBalanceC(uh03StoreOutCS.get(0).getMediNo(),uh03StoreOutCS.get(0).getUnitPrice(),uh03StoreOutCS.get(0).getUnit(),uh03StoreOutCS.get(0).getSpecification(),uh03StoreOutCS.get(0).getQuantity());
                uh03MonthBalanceC.setMonth(month);
                Double uh03MonthBalanceC1= uh03MonthBalanceCMapper.findprice(month,uh03MonthBalanceC.getMediNo());
                uh03MonthBalanceC.setBalancePrice(uh03MonthBalanceC1);
                String specification=uh03OnStoreCMapper.findSpe(uh03StoreOutCS.get(0).getMediNo());
                uh03MonthBalanceC.setSpecification(specification);
                String unit=uh03OnStoreCMapper.findUnit(uh03StoreOutCS.get(0).getMediNo());
                uh03MonthBalanceC.setUnit(unit);
                uh03MonthBalanceCMapper.insert(uh03MonthBalanceC);
            }else {
                uh03MonthBalanceCMapper.updateByOutUbc(uh03StoreOutCS.get(0).getMediNo(),uh03StoreOutCS.get(0).getUnitPrice(),uh03StoreOutCS.get(0).getQuantity(),month);
            }
           return 1;
        }
        for (int i=0;i<uh03StoreOutCS.size();i++){
            if (uh03OnStoreCMapper.selectByCount(uh03StoreOutCS.get(i).getMediNo(),uh03StoreOutCS.get(0).getQuantity()).size()>0){
                return -2;
            }
            if (uh03OnStoreCMapper.selectById(uh03StoreOutCS.get(i).getMediNo()) == null){
                return -1;
            }else {
                Uh03StoreOutC uh03StoreOutC=new Uh03StoreOutC(uh03StoreOutCS.get(i).getUnitPrice(),uh03StoreOutCS.get(i).getMediNo(),uh03StoreOutCS.get(i).getOutNo(),uh03StoreOutCS.get(i).getSpecification(),uh03StoreOutCS.get(i).getUnit(),uh03StoreOutCS.get(i).getQuantity(),uh03StoreOutCS.get(i).getDepartment());
                String specification=uh03OnStoreCMapper.findSpe(uh03StoreOutCS.get(i).getMediNo());
                uh03StoreOutC.setSpecification(specification);
                String unit=uh03OnStoreCMapper.findUnit(uh03StoreOutCS.get(i).getMediNo());
                uh03StoreOutC.setUnit(unit);
                uh03StoreOutCMapper.insert(uh03StoreOutC);
                uh03OnStoreCMapper.updateBybyOutno(uh03StoreOutCS.get(i).getMediNo(), uh03StoreOutCS.get(i).getQuantity());
            }
            if (uh03MonthBalanceCMapper.selectById(uh03StoreOutCS.get(i).getMediNo())==null){
                Uh03MonthBalanceC uh03MonthBalanceC=new Uh03MonthBalanceC(uh03StoreOutCS.get(i).getMediNo(),uh03StoreOutCS.get(i).getUnitPrice(),uh03StoreOutCS.get(i).getUnit(),uh03StoreOutCS.get(i).getSpecification(),uh03StoreOutCS.get(i).getQuantity());
                uh03MonthBalanceC.setMonth(month);
               Double uh03MonthBalanceC1= uh03MonthBalanceCMapper.findprice(month,uh03MonthBalanceC.getMediNo());
               uh03MonthBalanceC.setBalancePrice(uh03MonthBalanceC1);
                String specification=uh03OnStoreCMapper.findSpe(uh03StoreOutCS.get(i).getMediNo());
                uh03MonthBalanceC.setSpecification(specification);
                String unit=uh03OnStoreCMapper.findUnit(uh03StoreOutCS.get(i).getMediNo());
                uh03MonthBalanceC.setUnit(unit);
                uh03MonthBalanceCMapper.insert(uh03MonthBalanceC);
            }else {
                uh03MonthBalanceCMapper.updateByOutUbc(uh03StoreOutCS.get(i).getMediNo(),uh03StoreOutCS.get(i).getUnitPrice(),uh03StoreOutCS.get(i).getQuantity(),month);
            }
        }
        return uh03StoreOutCS.size() ;
    }

    @Override
    public List<Uh03StoreOutC> queryAll() {
        List<Uh03StoreOutC> list=uh03StoreOutCMapper.query();
        return list;
    }

    @Override
    public List<Uh03StoreOutVo> findById(Uh03StoreOutVo uh03StoreOutVo) {
        List<Uh03StoreOutVo> list=uh03StoreOutCMapper.findById(uh03StoreOutVo);
        return list;
    }
}




