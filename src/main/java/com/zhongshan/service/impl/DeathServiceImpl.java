package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Death;
import com.zhongshan.service.DeathService;
import com.zhongshan.mapper.DeathMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 13427
* @description 针对表【death】的数据库操作Service实现
* @createDate 2022-05-09 08:45:25
*/
@Service
public class DeathServiceImpl extends ServiceImpl<DeathMapper, Death>
    implements DeathService{
    @Resource
    private DeathMapper deathMapper;

    @Override
    public R registrationOfDeath(Death death) {
        int row=deathMapper.insert(death);
        if(row>0)
        return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }
}




