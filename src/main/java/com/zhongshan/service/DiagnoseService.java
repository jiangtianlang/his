package com.zhongshan.service;

import com.zhongshan.entity.Diagnose;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【diagnose】的数据库操作Service
* @createDate 2022-04-27 18:13:36
*/
public interface DiagnoseService extends IService<Diagnose> {

    List<Diagnose> queryAll();

    List<Diagnose> findById(Diagnose diagnose);

    int insert(Diagnose diagnose);

    int updateBytj(Diagnose diagnose);
}
