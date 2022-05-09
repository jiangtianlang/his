package com.zhongshan.service;

import com.zhongshan.entity.Uh03CompanyList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_company_list】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Uh03CompanyListService extends IService<Uh03CompanyList> {

    int add(Uh03CompanyList uh03CompanyList);

    int select(Uh03CompanyList uh03CompanyList);

    List<Uh03CompanyList> findAll();

    List<Uh03CompanyList> findById(Uh03CompanyList uh03CompanyList);
}
