package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh05_health_student_m
 */
@TableName(value ="uh05_health_student_m")
@Data
public class Uh05HealthStudentM implements Serializable {
    /**
     * 学号
     */
    @TableId
    private String studentNo;

    /**
     * 身长单位：Cm
     */
    private Double hight;

    /**
     * 体重单位：Kg
     */
    private Double weight;

    /**
     * 左视力
     */
    private Double eyesightL;

    /**
     * 右视力
     */
    private Double eyesightR;

    /**
     * 左矫正视力
     */
    private Double eyesightCorrectL;

    /**
     * 右矫正视力
     */
    private Double eyesightCorrectR;

    /**
     * 左沙眼(正常  +  ++  +++)
     */
    private String trachomaL;

    /**
     * 右沙眼(正常  +  ++  +++)
     */
    private String trachomaR;

    /**
     * 辩色力(色盲  色弱  正常)
     */
    private String achromatopsia;

    /**
     * 血压（高）(kpa)
     */
    private Double bloodPressureH;

    /**
     * 血压（低）(kpa)
     */
    private Double bloodPressureL;

    /**
     * 心(正常  不正常)
     */
    private String heart;

    /**
     * 肺(正常  不正常)
     */
    private String liver;

    /**
     * 肝(正常  不正常)
     */
    private String lungs;

    /**
     * 上肢(正常  残废)
     */
    private String limbUp;

    /**
     * 下肢(正常  残废)
     */
    private String limbLower;

    /**
     * 小儿麻痹(正常  上  下  上左  上右
下左  下右)
     */
    private String poliomyelitis;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}