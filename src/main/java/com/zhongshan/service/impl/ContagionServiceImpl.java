package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Contagion;
import com.zhongshan.service.ContagionService;
import com.zhongshan.mapper.ContagionMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 13427
* @description 针对表【contagion】的数据库操作Service实现
* @createDate 2022-05-09 08:45:25
*/
@Service
public class ContagionServiceImpl extends ServiceImpl<ContagionMapper, Contagion>
    implements ContagionService{
    @Resource
    private ContagionMapper contagionMapper;

    @Override
    public R registrationOfContagion(Contagion contagion) {
        int row=contagionMapper.insert(contagion);
        if(row>0)
            return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }
}




