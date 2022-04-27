package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh05_standard_weight_student
 */
@TableName(value ="uh05_standard_weight_student")
@Data
public class Uh05StandardWeightStudent implements Serializable {
    /**
     * 男，女
     */
    @TableId
    private String sex;

    /**
     * 
     */
    private Integer age;

    /**
     * 单位：kg
     */
    private Double p3;

    /**
     * 单位：kg
     */
    private Double p5;

    /**
     * 单位：kg
     */
    private Double p10;

    /**
     * 单位：kg
     */
    private Double p25;

    /**
     * 单位：kg
     */
    private Double p30;

    /**
     * 单位：kg
     */
    private Double p50;

    /**
     * 单位：kg
     */
    private Double p70;

    /**
     * 单位：kg
     */
    private Double p80;

    /**
     * 单位：kg
     */
    private Double p90;

    /**
     * 单位：kg
     */
    private Double p95;

    /**
     * 单位：kg
     */
    private Double p97;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}