package com.zhongshan.mapper;

import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03StoreInC;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.vo.Uh03StoreInCVo;

import java.util.Date;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_store_in_c】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Uh03StoreInC
*/
public interface Uh03StoreInCMapper extends BaseMapper<Uh03StoreInC> {

    Uh03StoreInC findByIdi(int id, Date date);

    int insertaa(Uh03OnStoreC uh03OnStoreC);

    List<Uh03StoreInC> findAll();

    List<Uh03StoreInCVo> findById(Uh03StoreInCVo uh03StoreInCVo);
}




