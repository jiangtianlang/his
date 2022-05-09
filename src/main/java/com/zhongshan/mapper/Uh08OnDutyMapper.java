package com.zhongshan.mapper;

import com.zhongshan.entity.Uh08OnDuty;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.vo.MonthVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh08_on_duty】的数据库操作Mapper
* @createDate 2022-04-27 18:13:39
* @Entity com.zhongshan.entity.Uh08OnDuty
*/
public interface Uh08OnDutyMapper extends BaseMapper<Uh08OnDuty> {

    List<MonthVo> workloadMonth(@Param("year") String year, @Param("month") String month);

    List<MonthVo> workloadYear(@Param("year") String date);

    List<MonthVo> workloadDaily(@Param("year") String year, @Param("month") String month, @Param("day") String day);
}




