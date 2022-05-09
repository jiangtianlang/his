package com.zhongshan.mapper;

import com.zhongshan.entity.Uh03OnStoreC;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.Uh03StoreInC;

import java.util.List;
import java.util.Map;

/**
* @author 13427
* @description 针对表【uh03_on_store_c】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Uh03OnStoreC
*/
public interface Uh03OnStoreCMapper extends BaseMapper<Uh03OnStoreC> {


    int insertaa(Uh03StoreInC uh03StoreInC);

    int updateBybyno(String mediNo,Integer quantity);

    List<Uh03OnStoreC> queryZ();

    List<Uh03OnStoreC> queryH();

    List<Uh03OnStoreC> queryAll();

    List<Uh03OnStoreC> queryMN();

    List<Uh03OnStoreC> findallList();

    void updateBybyOutno(String mediNo, Integer quantity);

    List<Uh03OnStoreC> selectByCount(String mediNo,Integer quantity);

    String findSpe(String mediNo);

    String findUnit(String mediNo);

   Integer findSum();
}




