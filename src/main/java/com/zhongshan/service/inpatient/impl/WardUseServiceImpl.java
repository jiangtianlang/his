package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.Ward;
import com.zhongshan.entity.inpatient.WardUse;
import com.zhongshan.mapper.WardMapper;
import com.zhongshan.service.inpatient.WardUseService;
import com.zhongshan.mapper.WardUseMapper;
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
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public boolean updateById(WardUse entity) {
        WardUse wardUse = baseMapper.selectById(entity.getWardId());
        //如果是换床,则修改床位表信息
        try {
            if (!wardUse.getBedNo().equals(entity.getBedNo())){
                super.updateById(entity);
                Ward oldWard = new Ward();
                oldWard.setBedNo(wardUse.getBedNo());
                oldWard.setIsNull(1);
                Ward newWard = new Ward();
                newWard.setBedNo(entity.getBedNo());
                newWard.setIsNull(0);
                wardMapper.updateById(oldWard);
                wardMapper.updateById(newWard);
            }else {
                super.updateById(entity);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }
}




