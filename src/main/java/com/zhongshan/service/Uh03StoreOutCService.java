package com.zhongshan.service;

import com.zhongshan.entity.Uh03StoreOutC;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.vo.Uh03StoreOutVo;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_store_out_c】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Uh03StoreOutCService extends IService<Uh03StoreOutC> {

    int insertBatch(List<Uh03StoreOutC> uh03StoreOutCS);

    List<Uh03StoreOutC> queryAll();

    List<Uh03StoreOutVo> findById(Uh03StoreOutVo uh03StoreOutVo);
}
