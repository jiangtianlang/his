package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.PersonBase;
import com.zhongshan.entity.vo.PersonBaseVo;
import com.zhongshan.entity.vo.PersonInfo;
import com.zhongshan.mapper.PersonHistoryMapper;
import com.zhongshan.service.personBase.PersonBaseService;
import com.zhongshan.mapper.personBase_mapper.PersonBaseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author 13427
* @description 针对表【person_base】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PersonBaseServiceImpl extends ServiceImpl<PersonBaseMapper, PersonBase>
    implements PersonBaseService{
    @Resource
    private  PersonBaseMapper personBaseMapper;
    @Override
    public Boolean add(PersonBase personBase) {
        int rows=personBaseMapper.insert(personBase);
        return rows>0?true:false;
    }
    @Override
    public List<PersonBase> findById(String personNo) {
        QueryWrapper<PersonBase> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("person_no",personNo);
        List<PersonBase> list=personBaseMapper.selectList(queryWrapper);
        System.out.println(list);
        return list;
    }
    private QueryWrapper<PersonBase> getQueryWrapper(PersonBaseVo personBaseVo){
        //查询
        QueryWrapper<PersonBase> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(personBaseVo.getPostNo())){
            queryWrapper.like("post_no",personBaseVo.getPostNo());
        }
        if(personBaseVo.getStartInWorkDate()!=null
                && personBaseVo.getEndInWorkDate()!=null){
            queryWrapper.between("Time",
                    personBaseVo.getStartInWorkDate(),
                    personBaseVo.getEndInWorkDate());
        }
        if(personBaseVo.getDegree()!=null){
            queryWrapper.eq("degree",personBaseVo.getDegree());
        }
        if(personBaseVo.getTitleNo()!=null){
            queryWrapper.like("title_no",personBaseVo.getTitleNo());
        }

        return   queryWrapper;
    }
    @Override
    public List<PersonBase> selectByMany(PersonBaseVo personBaseVo) {
        List<PersonBase> list=personBaseMapper.selectList(getQueryWrapper(personBaseVo));
        return list;
    }

    @Override
    public Page findByManyPage(PersonBaseVo personBaseVo, Integer page, Integer limit) {
        //创建page对象
        Page<PersonBase> pagePersonBase=new Page<>(page,limit);
        //查询 返回查询结果集
        pagePersonBase=personBaseMapper.selectPage(pagePersonBase,getQueryWrapper(personBaseVo));
        return pagePersonBase;
    }

    @Override
    public List<PersonBase> findByName(String personName) {
        QueryWrapper<PersonBase> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("person_name",personName);
        List<PersonBase> list=personBaseMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public List<PersonBase> findByManyCondition(PersonBase personBase) {
        //查询
        QueryWrapper<PersonBase> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(personBase.getPostNo())){
            queryWrapper.like("post_no",personBase.getPostNo());
        }
        if(personBase.getTitleNo()!=null){
           queryWrapper.like("title_no",personBase.getTitleNo());
        }
        if(personBase.getDegree()!=null){
            queryWrapper.like("degree",personBase.getDegree());
        }
        if(personBase.getInZsuDate()!=null){
            queryWrapper.like("in_zsu_date",personBase.getInZsuDate());
        }
        List<PersonBase> list=personBaseMapper.selectList(queryWrapper);
        return list;
    }
    @Override
    public List<PersonBase> findComprehensiveQuery(String schoolName) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("school_name",schoolName);
        List<PersonBase> list=personBaseMapper.selectByMap(map);
        return list;
    }

    @Override
    public List<PersonBase> findAll() {
        List<PersonBase> list=personBaseMapper.selectList(null);
        return list;
    }

    @Override
    public List<PersonBase> findByIdName(String personNo) {
        QueryWrapper<PersonBase> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("person_no",personNo);
        List<PersonBase> list=personBaseMapper.selectList(queryWrapper);
        return list;
    }
}





