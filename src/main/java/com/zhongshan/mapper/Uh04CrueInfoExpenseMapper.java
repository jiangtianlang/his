package com.zhongshan.mapper;

import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.vo.Income;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh04_crue_info_expense】的数据库操作Mapper
* @createDate 2022-05-04 20:07:41
* @Entity com.zhongshan.entity.inpatient.Uh04CrueInfoExpense
*/
public interface Uh04CrueInfoExpenseMapper extends BaseMapper<Uh04CrueInfoExpense> {

    List<Income> selectByDate(@Param("year") Integer year,@Param("month") Integer month);

    List<Uh04CrueInfoExpense> queryCrueInfo(@Param("patientNo")String patientNo, @Param("inDate")Date inDate, @Param("outDate")Date outDate);
}




