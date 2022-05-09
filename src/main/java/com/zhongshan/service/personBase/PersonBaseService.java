package com.zhongshan.service.personBase;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.PersonBase;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.vo.PersonBaseVo;


import java.util.List;

/**
* @author 13427
* @description 针对表【person_base】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface PersonBaseService extends IService<PersonBase> {
        Boolean add(PersonBase personBase);

        List<PersonBase> findById(String personNo);

        List<PersonBase> selectByMany(PersonBaseVo personBasevo);

        Page findByManyPage(PersonBaseVo personBaseVo, Integer page, Integer limit);
        List<PersonBase> findByName(String personName);

        List<PersonBase> findByManyCondition(PersonBase personBase);

        List<PersonBase> findComprehensiveQuery(String schoolName);

        List<PersonBase> findAll();
}
