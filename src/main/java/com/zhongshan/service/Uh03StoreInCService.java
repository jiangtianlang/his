package com.zhongshan.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03StoreInC;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.Uh03StoreW;
import com.zhongshan.entity.vo.Uh03StoreInCVo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
* @author 13427
* @description 针对表【uh03_store_in_c】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Uh03StoreInCService extends IService<Uh03StoreInC> {

    boolean insert(Uh03StoreInC uh03StoreInC);
   Uh03OnStoreC findByno(String id);

    List<Uh03StoreInCVo> findById(Uh03StoreInCVo uh03StoreInCVo);

    int insertBatch(List<Uh03StoreInC> uh03StoreInCS);

    List<Uh03StoreInC> findAll();
}
