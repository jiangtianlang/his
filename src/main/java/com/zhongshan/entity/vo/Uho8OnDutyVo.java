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
public class Uho8OnDutyVo {
    private String staffNo;

    /**
     *
     */
    private String department;


    /**
     * 实际工作量
     */
    private Double workAmount;
    /**
     * 额定工作量
     */
    private Double exWorkAmount;
    /**
     * 平均工作量
     */
    private Double averWorkAmount;
    private String name;
}
