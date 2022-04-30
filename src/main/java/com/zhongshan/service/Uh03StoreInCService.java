package com.zhongshan.service;

import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03StoreInC;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.Uh03StoreW;

import java.util.Date;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_store_in_c】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Uh03StoreInCService extends IService<Uh03StoreInC> {

    boolean insert(Uh03StoreInC uh03StoreInC);
   Uh03OnStoreC findByno(String id);
    boolean insertByno(String id);

    Uh03StoreInC findById(int id, Date date);
}
