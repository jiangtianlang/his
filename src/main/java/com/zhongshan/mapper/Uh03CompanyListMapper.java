package com.zhongshan.mapper;

import com.zhongshan.entity.Uh03CompanyList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_company_list】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Uh03CompanyList
*/
public interface Uh03CompanyListMapper extends BaseMapper<Uh03CompanyList> {

    List<Uh03CompanyList> queryAll();

    List<Uh03CompanyList> queryById(Uh03CompanyList uh03CompanyList);
}




