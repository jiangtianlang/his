package com.zhongshan.mapper;

import com.zhongshan.entity.Uh03PriceCDbf;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_price_c_dbf】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Uh03PriceCDbf
*/
public interface Uh03PriceCDbfMapper extends BaseMapper<Uh03PriceCDbf> {

    List<Uh03PriceCDbf> queryAll();

    List<Uh03PriceCDbf> queryByid(Uh03PriceCDbf uh03PriceCDbf);
}




