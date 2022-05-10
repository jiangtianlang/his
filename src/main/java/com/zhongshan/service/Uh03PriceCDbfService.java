package com.zhongshan.service;

import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03PriceCDbf;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_price_c_dbf】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Uh03PriceCDbfService extends IService<Uh03PriceCDbf> {

    int add(Uh03PriceCDbf uh03PriceCDbf);

    List<Uh03PriceCDbf> queryAll();

    List<Uh03PriceCDbf> queryByid(Uh03PriceCDbf uh03PriceCDbf);

    List<Uh03PriceCDbf> selectAllMedicine();

    Uh03PriceCDbf selectQuantity(String medi_name);
}
