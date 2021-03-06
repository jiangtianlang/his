package com.zhongshan.mapper.security_mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.pojo.User;
import com.zhongshan.pojo.vo.UserVo;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2020-01-12
 */
public interface UserMapper extends BaseMapper<User> {
    List<UserVo> selectUserAndRole();
}
