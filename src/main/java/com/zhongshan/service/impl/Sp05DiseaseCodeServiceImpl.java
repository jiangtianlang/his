package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Sp05DiseaseCode;
import com.zhongshan.service.Sp05DiseaseCodeService;
import com.zhongshan.mapper.Sp05DiseaseCodeMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
* @author 13427
* @description 针对表【sp05_disease_code】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Sp05DiseaseCodeServiceImpl extends ServiceImpl<Sp05DiseaseCodeMapper, Sp05DiseaseCode>
    implements Sp05DiseaseCodeService{
    private static final String WXWY="^[a-zA-Z]\\d{5}$";
    private static final String WX="^[A-Za-z]+$";
    @Resource
private Sp05DiseaseCodeMapper sp05DiseaseCodeMapper;
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public R insertDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode) {
        if(!StringUtils.isNotBlank(sp05DiseaseCode.getDiseaseCode())){
            return R.ok().message("请输入疾病体征代码");
        }
        if(!sp05DiseaseCode.getDiseaseCode().matches(WXWY)){
            return R.ok().message("疾病体征代码不规范");
        }
        if(!StringUtils.isNotBlank(sp05DiseaseCode.getDiseaseName())){
            return R.ok().message("请输入疾病名称");
        }
        if(StringUtils.isNotBlank(sp05DiseaseCode.getChineseChar())){
            if(!sp05DiseaseCode.getChineseChar().matches(WX)){
                return R.ok().message("疾病体征拼音错误格式");
            }
        }
        QueryWrapper<Sp05DiseaseCode> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("disease_code",sp05DiseaseCode.getDiseaseCode());
        List<Sp05DiseaseCode> list=sp05DiseaseCodeMapper.selectList(queryWrapper);
        if(list.size()!=0){
            return R.ok().message("该疾病代码已录入,名字为："+list.get(0).getDiseaseName());
        }
        QueryWrapper<Sp05DiseaseCode> queryWrapper1=new QueryWrapper<>();
        queryWrapper1.eq("disease_name",sp05DiseaseCode.getDiseaseName());
        List<Sp05DiseaseCode> list1=sp05DiseaseCodeMapper.selectList(queryWrapper1);
        if(list1.size()!=0){
            return R.ok().message("该疾病名称已录入：代码为："+list1.get(0).getDiseaseCode());
        }
        int row=sp05DiseaseCodeMapper.insert(sp05DiseaseCode);
        if(row==1){
            return R.ok().message("添加成功");
        }else {
            return R.ok().message("添加失败");
        }
    }

    @Override
    public R updateDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode) {
        if(StringUtils.isNotBlank(sp05DiseaseCode.getChineseChar())){
            if(!sp05DiseaseCode.getChineseChar().matches(WX)){
                return R.ok().message("疾病体征拼音错误格式");
            }
        }
        int row=sp05DiseaseCodeMapper.updateById(sp05DiseaseCode);
        if(row==1){
            return R.ok().message("修改成功");
        }else {
            return R.ok().message("修改失败");
        }
    }

    @Override
    public R deleteDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode) {
        int row=sp05DiseaseCodeMapper.deleteById(sp05DiseaseCode);
        if(row==1){
            return R.ok().message("删除成功");
        }else {
            return R.ok().message("删除失败");
        }
    }

    @Override
    public R queryDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode) {
        QueryWrapper<Sp05DiseaseCode> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(sp05DiseaseCode.getDiseaseCode())){
            queryWrapper.like("disease_code",sp05DiseaseCode.getDiseaseCode());
        }
        if(sp05DiseaseCode.getDiseaseName()!=null){
            queryWrapper.like("disease_name",sp05DiseaseCode.getDiseaseName());
        }
        if(sp05DiseaseCode.getChineseChar()!=null){
            queryWrapper.like("disease_char",sp05DiseaseCode.getChineseChar());
        }
        queryWrapper.orderByAsc("disease_code");
        List<Sp05DiseaseCode> list=sp05DiseaseCodeMapper.selectList(queryWrapper);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }
}




