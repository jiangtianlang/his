package com.zhongshan.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data   //自动 产生 getset
@AllArgsConstructor  //所以参数的构造器
@NoArgsConstructor //无参构造器
@ToString
public class MonthVo {
    private String name;//姓名
    private String department;//部门
    private Double ex;//额定工作量
    private Double work;//实际工作量
    private Double average;//平均工作量
    private Double defen;//得分
    private String qingkuang;//说明
}
