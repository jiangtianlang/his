package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.Uh05StudentDao;
import com.zhongshan.entity.Uh05Student;
import com.zhongshan.service.Uh05StudentService;
import org.springframework.stereotype.Service;

/**
 * (Uh05Student)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@Service("uh05StudentService")
public class Uh05StudentServiceImpl extends ServiceImpl<Uh05StudentDao, Uh05Student> implements Uh05StudentService {

}
