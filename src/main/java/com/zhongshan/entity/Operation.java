package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 
 * @TableName operation
 */
@TableName(value ="operation")
@Data
public class Operation implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer oId;
    /**
     * 非空，每个病人病案号唯一
     */

    private String operationNum;

    /**
     * 非空
     */
    private Integer operationTimes;

    /**
     * 
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date operationDate;

    /**
     * 
     */
    private String operationName;

    /**
     * icd-9编码
     */
    private String operationCode;

    /**
     * 静脉麻|吸入麻|局麻|硬膜外麻|硬膜外麻+局麻|静脉麻+局麻
     */
    private String operationHocus;

    /**
     * 手术野 + 伤口愈合情况
     */
    private String operationCut;

    /**
     * 
     */
    private String operationDoctorName;
    /**
     * 状态
     */
    @TableLogic
    private Integer State;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}