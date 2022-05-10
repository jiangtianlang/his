package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName case_history
 */
@TableName(value ="case_history")
@NoArgsConstructor
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
    /**
     * 状态
     */
    @TableLogic
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    public CaseHistory(Firstpage f) {
        this.chSignatureDirectorDoctor =f.getFgSignatureDirectorDoctor();
        this.chSignatureChargeDoctor = f.getFgSignatureChargeDoctor();
        this.chSignatureHouseDoctor = f.getFgSignatureHouseDoctor();
        this.chSignatureIntern = f.getFgSignatureIntern();
        this.chNum =f.getFgNum();
        this.chTimes =f.getFgTimes();
        this.chOutStatus = f.getFgOutStatus();
        this.chInStatus = f.getFgInStatus();
        this.chName=f.getFgName();
        this.chDepartment=f.getFgDepartment();
    }
}