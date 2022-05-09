package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh03CompanyList;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.service.Uh03CompanyListService;
import com.zhongshan.mapper.Uh03CompanyListMapper;
import com.zhongshan.utils.ValidatorUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_company_list】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh03CompanyListServiceImpl extends ServiceImpl<Uh03CompanyListMapper, Uh03CompanyList>
    implements Uh03CompanyListService{
    @Resource
    Uh03CompanyListMapper uh03CompanyListMapper;
    @Override
    public int add(Uh03CompanyList uh03CompanyList) {

            if (!ValidatorUtil.isMobile(uh03CompanyList.getContactTel())){
                return -1;
            }
       int row= uh03CompanyListMapper.insert(uh03CompanyList);
       if (row>0){
           return row;
       }
        return 0;
    }

    @Override
    public int select(Uh03CompanyList uh03CompanyList) {
       int row= uh03CompanyListMapper.updateById(uh03CompanyList);
        if (row>0){
            return row;
        }
        return 0;
    }

    @Override
    public List<Uh03CompanyList> findAll() {

        List<Uh03CompanyList> list = uh03CompanyListMapper.queryAll();
        return list;
    }

    @Override
    public List<Uh03CompanyList> findById(Uh03CompanyList uh03CompanyList) {
        List<Uh03CompanyList> list = uh03CompanyListMapper.queryById(uh03CompanyList);
        return list;
    }
}




