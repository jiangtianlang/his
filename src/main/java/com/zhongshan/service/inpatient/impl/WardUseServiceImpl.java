package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.entity.inpatient.Ward;
import com.zhongshan.entity.inpatient.WardUse;
import com.zhongshan.mapper.WardMapper;
import com.zhongshan.service.inpatient.PatientBaseService;
import com.zhongshan.service.inpatient.WardUseService;
import com.zhongshan.mapper.WardUseMapper;
import com.zhongshan.utils.result.R;
import com.zhongshan.utils.result.ResultData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* @author 13427
* @description 针对表【ward_use】的数据库操作Service实现
* @createDate 2022-05-05 21:56:24
*/
@Service
public class WardUseServiceImpl extends ServiceImpl<WardUseMapper, WardUse>
    implements WardUseService{

    @Resource
    private WardMapper wardMapper;
    @Resource
    private PatientBaseService patientBaseService;
    @Resource
    private WardUseMapper wardUseMapper;

    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public boolean updateById(WardUse entity) {
        WardUse wardUse = baseMapper.selectById(entity.getWardId());
        //如果是换床,则修改床位表信息
        if (!wardUse.getBedNo().equals(entity.getBedNo())){
            Ward oldWard = new Ward();
            oldWard.setBedNo(wardUse.getBedNo());
            oldWard.setIsNull(1);
            Ward newWard = new Ward();
            newWard.setBedNo(entity.getBedNo());
            newWard.setIsNull(0);
            //修改新旧床位信息
            wardMapper.updateById(oldWard);
            wardMapper.updateById(newWard);
            //更新病人信息
            PatientBase patientBase = new PatientBase();
            patientBase.setPatientNo(entity.getPatientNo());
            patientBase.setBedNo(entity.getBedNo());
            patientBaseService.updateById(patientBase);
            //更新床位使用记录
            return super.updateById(entity);
        }else {
            return super.updateById(entity);
        }
    }

    @Override
    public ResultData totalWardUse(QueryWrapper<Ward> wrapper) {
        //总床位数目，空床数目，实际使用率
        Integer total = wardMapper.selectCount(wrapper);
        Integer empty = wardMapper.selectCount(wrapper.eq("is_null",1));
        Double rate = Double.valueOf(empty)/Double.valueOf(total);
        return ResultData.ok().data("data",wardUseMapper.totalWardUse()).data("total",total).data("empty",empty).data("rate",rate);
    }
}




