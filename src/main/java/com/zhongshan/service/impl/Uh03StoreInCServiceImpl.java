package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.*;
import com.zhongshan.entity.vo.Uh03StoreInCVo;
import com.zhongshan.mapper.*;
import com.zhongshan.service.Uh03MonthBalanceCService;
import com.zhongshan.service.Uh03StoreInCService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
* @author 13427
* @description 针对表【uh03_store_in_c】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh03StoreInCServiceImpl extends ServiceImpl<Uh03StoreInCMapper, Uh03StoreInC>
    implements Uh03StoreInCService {
    @Resource
    private Uh03StoreInCMapper uh03StoreInCMapper;
    @Resource
    private Uh03OnStoreCMapper uh03OnStoreCMapper;
@Resource
    Uh03MonthBalanceCMapper uh03MonthBalanceCMapper;
    Calendar calendar = Calendar.getInstance();
    //记得要+1
    int month = calendar.get(Calendar.MONTH) + 1;
    @Override
    public boolean insert(Uh03StoreInC uh03StoreInC) {
        int row = uh03StoreInCMapper.insert(uh03StoreInC);
        if (row >= 1) {
            Uh03OnStoreC uh03OnStoreC1 = findByno(uh03StoreInC.getComNo());
            if (uh03OnStoreC1 != null) {
                uh03OnStoreCMapper.updateBybyno(uh03StoreInC.getMediNo(), uh03StoreInC.getQuantity());
            } else {
                // Uh03OnStoreC uh03OnStoreC=new Uh03OnStoreC(uh03StoreInC.getMediNo(),uh03StoreInC.getUnitPrice(),uh03StoreInC.getSpecification(),uh03StoreInC.getUnit(),uh03StoreInC.getQuantity());
                uh03OnStoreCMapper.insertaa(uh03StoreInC);
            }
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Uh03OnStoreC findByno(String id) {
        Uh03OnStoreC uh03OnStoreC = uh03OnStoreCMapper.selectById(id);
        return uh03OnStoreC;
    }

    @Override
    public List<Uh03StoreInCVo> findById(Uh03StoreInCVo uh03StoreInCtVo) {
        List<Uh03StoreInCVo> list=uh03StoreInCMapper.findById(uh03StoreInCtVo);
        return list;
    }
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int insertBatch(List<Uh03StoreInC> uh03StoreInCS) {

        if (CollectionUtils.isEmpty(uh03StoreInCS)) {
            return 0;
        }
        if (uh03StoreInCS.size()==1){
            int row= uh03StoreInCMapper.insert(uh03StoreInCS.get(0));
            if (uh03OnStoreCMapper.selectById(uh03StoreInCS.get(0).getMediNo()) == null){
            Uh03OnStoreC uh03OnStoreC=new Uh03OnStoreC(uh03StoreInCS.get(0).getMediNo(),uh03StoreInCS.get(0).getUnitPrice(),uh03StoreInCS.get(0).getUnit(),uh03StoreInCS.get(0).getQuantity(),uh03StoreInCS.get(0).getSpecification());
            uh03OnStoreCMapper.insert(uh03OnStoreC);
            }else {
                uh03OnStoreCMapper.updateBybyno(uh03StoreInCS.get(0).getMediNo(), uh03StoreInCS.get(0).getQuantity());
            }
            if (uh03MonthBalanceCMapper.selectById(uh03StoreInCS.get(0).getMediNo())==null){
                Uh03MonthBalanceC uh03MonthBalanceC=new Uh03MonthBalanceC(uh03StoreInCS.get(0).getMediNo(),uh03StoreInCS.get(0).getUnitPrice(),uh03StoreInCS.get(0).getUnit(),uh03StoreInCS.get(0).getSpecification());
                uh03MonthBalanceC.setMonth(month);
                Double uh03MonthBalanceC1= uh03MonthBalanceCMapper.findprice(month,uh03MonthBalanceC.getMediNo());
                    uh03MonthBalanceC.setBalancePrice(uh03MonthBalanceC1);
                uh03MonthBalanceCMapper.insert(uh03MonthBalanceC);
            }else {
                uh03MonthBalanceCMapper.updateByUbc(uh03StoreInCS.get(0).getMediNo(),uh03StoreInCS.get(0).getUnitPrice(),month);
            }
            return row;
        }
        for (int i=0;i<uh03StoreInCS.size();i++){
             uh03StoreInCMapper.insert(uh03StoreInCS.get(i));
            if (uh03MonthBalanceCMapper.selectById(uh03StoreInCS.get(i).getMediNo())==null){
                Uh03MonthBalanceC uh03MonthBalanceC=new Uh03MonthBalanceC(uh03StoreInCS.get(i).getMediNo(),uh03StoreInCS.get(i).getUnitPrice(),uh03StoreInCS.get(i).getUnit(),uh03StoreInCS.get(i).getSpecification());
                uh03MonthBalanceC.setMonth(month);
                Double uh03MonthBalanceC1= uh03MonthBalanceCMapper.findprice(month,uh03MonthBalanceC.getMediNo());
                    uh03MonthBalanceC.setBalancePrice(uh03MonthBalanceC1);
                uh03MonthBalanceCMapper.insert(uh03MonthBalanceC);
            }else {
                uh03MonthBalanceCMapper.updateByUbc(uh03StoreInCS.get(i).getMediNo(),uh03StoreInCS.get(i).getUnitPrice(),month);
            }
            if (uh03OnStoreCMapper.selectById(uh03StoreInCS.get(i).getMediNo()) == null){
                Uh03OnStoreC uh03OnStoreC=new Uh03OnStoreC(uh03StoreInCS.get(i).getMediNo(),uh03StoreInCS.get(i).getUnitPrice(),uh03StoreInCS.get(i).getUnit(),uh03StoreInCS.get(i).getQuantity(),uh03StoreInCS.get(i).getSpecification());
                uh03OnStoreCMapper.insert(uh03OnStoreC);

            }else {
                uh03OnStoreCMapper.updateBybyno(uh03StoreInCS.get(i).getMediNo(), uh03StoreInCS.get(i).getQuantity());
            }
        }
       return uh03StoreInCS.size() ;
    }

    @Override
    public List<Uh03StoreInC> findAll() {
      List list=  uh03StoreInCMapper.findAll();
        return list ;
    }

}




