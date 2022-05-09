package com.zhongshan.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data   //自动 产生 getset
@AllArgsConstructor  //所以参数的构造器
@NoArgsConstructor //无参构造器
@ToString
public class Uho8OnDutyVo {
    private Double workloadSum;
    private String department;
    private String no;
    private Double completion;
}
