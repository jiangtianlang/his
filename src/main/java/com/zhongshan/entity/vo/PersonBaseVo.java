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
    private String postNo;
    private String titleNo;
    private String degree;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startInWorkDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endInWorkDate;
}
