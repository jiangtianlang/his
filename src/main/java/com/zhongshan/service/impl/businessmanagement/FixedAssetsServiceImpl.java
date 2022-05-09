package com.zhongshan.service.impl.businessmanagement;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Firstpage;
import com.zhongshan.entity.FixedAssets;
import com.zhongshan.mapper.FirstpageMapper;
import com.zhongshan.service.FixedAssetsService;
import com.zhongshan.mapper.FixedAssetsMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【fixed_assets】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class FixedAssetsServiceImpl extends ServiceImpl<FixedAssetsMapper, FixedAssets>
    implements FixedAssetsService{
    @Resource
    private FixedAssetsMapper fixedAssetsMapper;
    @Override
    public R selectFixed(FixedAssets fixedAssets) {
        QueryWrapper<FixedAssets> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(fixedAssets.getFixedName())){
            queryWrapper.like("fixed_name",fixedAssets.getFixedName());
        }
        if(StringUtils.isNotBlank(fixedAssets.getFixedNo())){
            queryWrapper.like("fixed_no",fixedAssets.getFixedNo());
        }
        if(fixedAssets.getFixedDate()!=null){
            queryWrapper.like("fixed_date",fixedAssets.getFixedDate());
        }
        if(fixedAssets.getFixedPrice()!=null){
            queryWrapper.like("fixed_price",fixedAssets.getFixedPrice());
        }
        List<FixedAssets> list=fixedAssetsMapper.selectList(queryWrapper);
        return R.ok().data("data",list);
    }
@Resource
private FirstpageMapper firstpageMapper;
    @Override
    public R selectCaseHealthCare(Firstpage firstpage) {
        QueryWrapper<Firstpage> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(firstpage.getFgMainDiagnoseCode())){
            queryWrapper.like("fg_mian_diagnose_code",firstpage.getFgMainDiagnoseCode());
        }
        return null;
    }
}





