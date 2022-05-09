package com.zhongshan.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data //自动 产生 getset
@AllArgsConstructor  //所以参数的构造器
@NoArgsConstructor //无参构造器
@ToString
public class Uh03StoreOutVo {
    private Integer outId;
    private String mediNo;
    private String specification;
    private String unit;
    private Double unitPrice;
    private Integer quantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Integer State;
}
