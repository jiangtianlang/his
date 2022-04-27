package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh05_standard_nutrition_student
 */
@TableName(value ="uh05_standard_nutrition_student")
@Data
public class Uh05StandardNutritionStudent implements Serializable {
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
     * 单位：cm
     */
    private Integer hight;

    /**
     * 单位：kg
     */
    private Double weightL;

    /**
     * 单位：kg
     */
    private Double weightM;

    /**
     * 单位：kg
     */
    private Double weightH;

    /**
     * 单位：kg
     */
    private Double weightSl;

    /**
     * 单位：kg
     */
    private Double weightSh;

    /**
     * 单位：kg
     */
    private Double weightFat;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}