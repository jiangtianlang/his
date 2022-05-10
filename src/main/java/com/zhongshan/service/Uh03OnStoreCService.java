package com.zhongshan.service;

import com.zhongshan.entity.Uh03OnStoreC;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author 13427
* @description 针对表【uh03_on_store_c】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Uh03OnStoreCService extends IService<Uh03OnStoreC> {

    List<Uh03OnStoreC> findByZ();

    List<Uh03OnStoreC> findByH();

    List<Uh03OnStoreC> findAll();

    List<Uh03OnStoreC> findMN();

    List<Uh03OnStoreC> findallList();

    Integer findSum();

    List<Uh03OnStoreC> selectMedical();

    Uh03OnStoreC selectQuantity(String mediNo);
}
