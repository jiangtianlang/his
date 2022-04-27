package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.UserAuth;
import com.zhongshan.service.UserAuthService;
import com.zhongshan.mapper.UserAuthMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【user_auth】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class UserAuthServiceImpl extends ServiceImpl<UserAuthMapper, UserAuth>
    implements UserAuthService{

}




