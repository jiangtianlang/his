package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName treat
 */
@TableName(value ="treat")
@Data
public class Treat implements Serializable {
    /**
     * 医疗卡号
     */
    @TableId
    private String personsNo;

    /**
     * 看病日期
     */
    private Date treatDate;

    /**
     * 药费总额
     */
    private Double mediTotal;

    /**
     * 应扣百分比
     */
    private Integer percentage;

    /**
     * 药品种类
     */
    private String mediType;

    /**
     * 挂号员号
     */
    private String opera;

    /**
     * 挂号标记(Y-已挂号，N-没挂号)
     */
    private String registerYn;

    /**
     *  打印标记
     */
    private Integer printNumber;

    /**
     * 处方流水号
     */
    private Integer presNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}