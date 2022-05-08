package com.zhongshan.service.security_service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.security_mapper.UserMapper;
import com.zhongshan.pojo.User;
import com.zhongshan.pojo.vo.UserVo;
import com.zhongshan.service.security_service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-01-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User selectByUsername(String username) {
        return baseMapper.selectOne(new QueryWrapper<User>().eq("username", username));
    }

    @Override
    public List<UserVo> selectUserAndRole() {
        return baseMapper.selectUserAndRole();
    }
}
