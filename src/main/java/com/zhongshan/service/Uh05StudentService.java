package com.zhongshan.service;

import com.zhongshan.entity.Uh05Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【uh05_student】的数据库操作Service
* @createDate 2022-04-27 18:13:39
*/
public interface Uh05StudentService extends IService<Uh05Student> {

    R insertStudent(Uh05Student uh05Student);

    R updateStudent(Uh05Student uh05Student);

    R deleteStudent(Uh05Student uh05Student);

    R queryStudent(Uh05Student uh05Student);
}
