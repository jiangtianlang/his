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
 * @TableName uh05_health_staff
 */
@TableName(value ="uh05_health_staff")
@Data
public class Uh05HealthStaff implements Serializable {
    /**
     * 
     */
    @TableId
    private String checkNo;

    /**
     * 
     */
    private String staffNo;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String hobby;

    /**
     * 
     */
    private Double high;

    /**
     * 
     */
    private Double weight;

    /**
     * 
     */
    private Double bloodPressureH;

    /**
     * 
     */
    private Double bloodPressureL;

    /**
     * 
     */
    private Double eyesightL;

    /**
     * 
     */
    private Double eyesightR;

    /**
     * 
     */
    private Double eyesightCorrectL;

    /**
     * 
     */
    private Double eyesightCorrectR;

    /**
     * 
     */
    private String nose;

    /**
     * 
     */
    private String pharynx;

    /**
     * 
     */
    private String oralCavity;

    /**
     * 
     */
    private String tooth;

    /**
     * 
     */
    private String heart;

    /**
     * 
     */
    private String liver;

    /**
     * 
     */
    private String lungs;

    /**
     * 
     */
    private String spleen;

    /**
     * 
     */
    private String skin;

    /**
     * 
     */
    private String lymph;

    /**
     * 
     */
    private String limbs;

    /**
     * 
     */
    private String thyroidGland;

    /**
     * 
     */
    private String anus;

    /**
     * 
     */
    private String genitourinary;

    /**
     * 
     */
    private String others;

    /**
     * 
     */
    private String xRays;

    /**
     * 
     */
    private String urine;

    /**
     * 
     */
    private String electrocardiogram;

    /**
     * 
     */
    private String ultrasonic;

    /**
     * 
     */
    private String liverFunction;

    /**
     * 
     */
    private String gynecology;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}