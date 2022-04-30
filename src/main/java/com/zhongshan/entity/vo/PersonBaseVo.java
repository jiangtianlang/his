package com.zhongshan.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data   //自动 产生 getset
@AllArgsConstructor  //所以参数的构造器
@NoArgsConstructor //无参构造器
@ToString
public class PersonBaseVo {
    private String post_no;
    private String title_no;
    private String degree;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_in_work_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_in_work_date;
}
