package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName case_history
 */
@TableName(value ="case_history")
@Data
public class CaseHistory implements Serializable {
    /**
     * 非空，每个病人病案号唯一
     */
    @TableId
    private String chNum;

    /**
     * 非空
     */
    private Integer chTimes;

    /**
     * 非空
     */
    private String chName;

    /**
     * 
     */
    private String chDepartment;

    /**
     * 
     */
    private String chBed;

    /**
     * 
     */
    private Integer chXRayNum;

    /**
     * 
     */
    private Integer chCardiographNum;

    /**
     * 
     */
    private Integer chElectroencephogramNum;

    /**
     * 
     */
    private Integer chPathologyNum;

    /**
     * 
     */
    private String chInStatus;

    /**
     * 
     */
    private String chCureCourse;

    /**
     * 
     */
    private String chOutStatus;

    /**
     * 
     */
    private String chOutDoctorAdvice;

    /**
     * 
     */
    private String chSignatureDirectorDoctor;

    /**
     * 
     */
    private String chSignatureChargeDoctor;

    /**
     * 
     */
    private String chSignatureHouseDoctor;

    /**
     * 
     */
    private String chSignatureIntern;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}