package com.zhongshan.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data   //自动 产生 getset
@AllArgsConstructor  //所以参数的构造器
@NoArgsConstructor //无参构造器
@ToString
public class PrescriptionsVo {
    private String name;
    private String personsNo;
    private String doctorName;
    private String mediName;
    private String mediNo;
    private Integer quantity;
    private Date todayDate;
}
