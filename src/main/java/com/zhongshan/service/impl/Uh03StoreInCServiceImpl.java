package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03StoreInC;
import com.zhongshan.entity.Uh03StoreOutC;
import com.zhongshan.entity.Uh03StoreW;
import com.zhongshan.mapper.Uh03OnStoreCMapper;
import com.zhongshan.mapper.Uh03StoreOutCMapper;
import com.zhongshan.mapper.Uh03StoreWMapper;
import com.zhongshan.service.Uh03StoreInCService;
import com.zhongshan.mapper.Uh03StoreInCMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_store_in_c】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh03StoreInCServiceImpl extends ServiceImpl<Uh03StoreInCMapper, Uh03StoreInC>
    implements Uh03StoreInCService{
    @Resource
    private Uh03StoreInCMapper uh03StoreInCMapper;
    @Resource
    private Uh03OnStoreCMapper uh03OnStoreCMapper;
    @Override
    public boolean insert(Uh03StoreInC uh03StoreInC) {
       int row= uh03StoreInCMapper.insert(uh03StoreInC);
      if (row==1){
          Uh03OnStoreC uh03OnStoreC1=findByno(uh03StoreInC.getComNo());
          if (uh03OnStoreC1!=null){
              insertByno(uh03StoreInC.getMediNo());
          }else {
              Uh03OnStoreC uh03OnStoreC=new Uh03OnStoreC(uh03StoreInC.getMediNo(),uh03StoreInC.getUnitPrice(),uh03StoreInC.getSpecification(),uh03StoreInC.getUnit(),uh03StoreInC.getQuantity());
              uh03StoreInCMapper.insertaa(uh03OnStoreC);
          }
         return true;
      }else {
         return false;
      }

    }

    @Override
    public Uh03OnStoreC findByno(String id) {
    Uh03OnStoreC uh03OnStoreC=uh03OnStoreCMapper.selectById(id);
        return uh03OnStoreC;
    }

    @Override
    public boolean insertByno(String dm) {
        return uh03OnStoreCMapper.updateBybyno(dm)>0?true:false;

    }

    @Override
    public Uh03StoreInC findById(int id, Date date) {
        return uh03StoreInCMapper.findByIdi(id,date);
    }

}




