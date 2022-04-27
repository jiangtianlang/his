package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.UserAuthDao;
import com.zhongshan.entity.UserAuth;
import com.zhongshan.service.UserAuthService;
import org.springframework.stereotype.Service;

/**
 * (UserAuth)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@Service("userAuthService")
public class UserAuthServiceImpl extends ServiceImpl<UserAuthDao, UserAuth> implements UserAuthService {

}
