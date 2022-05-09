package com.zhongshan.mapper;

import com.zhongshan.entity.Uh03StoreOutC;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.vo.Uh03StoreOutVo;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_store_out_c】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Uh03StoreOutC
*/
public interface Uh03StoreOutCMapper extends BaseMapper<Uh03StoreOutC> {

    List<Uh03StoreOutC> query();

    List<Uh03StoreOutVo> findById(Uh03StoreOutVo uh03StoreOutVo);

}




