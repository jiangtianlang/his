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
    @Resource
private Sp05DiseaseCodeMapper sp05DiseaseCodeMapper;
    @Override
    public R insertDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode) {
        int row=sp05DiseaseCodeMapper.insert(sp05DiseaseCode);
        if(row==1){
            return R.ok().message("添加成功");
        }else {
            return R.ok().message("添加失败");
        }
    }

    @Override
    public R updateDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode) {
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
        List<Sp05DiseaseCode> list=sp05DiseaseCodeMapper.selectList(queryWrapper);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }
}




