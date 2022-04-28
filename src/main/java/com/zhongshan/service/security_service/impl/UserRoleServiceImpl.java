package com.zhongshan.service.security_service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.security_mapper.UserRoleMapper;
import com.zhongshan.pojo.UserRole;
import com.zhongshan.service.security_service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-01-12
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
