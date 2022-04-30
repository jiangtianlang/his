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
import java.util.List;

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
        List<PersonBase> list= new ArrayList<>();
        PersonBase personBase=personBaseMapper.selectById(personNo);
        list.add(personBase);
        return list;
    }
    private QueryWrapper<PersonBase> getQueryWrapper(PersonBaseVo personBaseVo){
        //查询
        QueryWrapper<PersonBase> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(personBaseVo.getPost_no())){
            queryWrapper.like("post_no",personBaseVo.getPost_no());
        }
        if(personBaseVo.getStart_in_work_date()!=null
                && personBaseVo.getEnd_in_work_date()!=null){
            queryWrapper.between("Time",
                    personBaseVo.getStart_in_work_date(),
                    personBaseVo.getEnd_in_work_date());
        }
        if(personBaseVo.getDegree()!=null){
            queryWrapper.eq("degree",personBaseVo.getDegree());
        }
        if(personBaseVo.getTitle_no()!=null){
            queryWrapper.like("title_no",personBaseVo.getTitle_no());
        }
        queryWrapper.orderByDesc("Time");
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
    public List<PersonInfo> findByIdName(String personNo, String personName) {
        List<PersonInfo> list= personBaseMapper.findByIdName(personNo,personName);
        return list;
    }

}




