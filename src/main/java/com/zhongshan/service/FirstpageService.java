package com.zhongshan.service;

import com.zhongshan.entity.Firstpage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【firstpage】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface FirstpageService extends IService<Firstpage> {

    int insert(Firstpage firstpage);

    List<Firstpage> queryByNum(Firstpage firstpage);

    List<Firstpage> queryAll();

    int updateBy(Firstpage firstpage);

    List<Firstpage> findCount(String fgNum);

    List<Firstpage> findCountall(String fgNum, Integer fgTimes);
}
