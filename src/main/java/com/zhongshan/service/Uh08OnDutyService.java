package com.zhongshan.service;

import com.zhongshan.entity.Uh08OnDuty;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh08_on_duty】的数据库操作Service
* @createDate 2022-04-27 18:13:39
*/
public interface Uh08OnDutyService extends IService<Uh08OnDuty> {

    List<Uh08OnDuty> selectDepartment(String department);

    R outpatientDaily();

    R queryWorkload(String name);

    R workloadDaily();

    R workloadMonth(String date);

    R workloadYear(String date);

    R selectDate(String workDate);

    R selectDepart(String department);
    void schedule();
}
