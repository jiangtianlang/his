package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @TableName doctor
 */
@TableName(value ="doctor")
@Data
public class Doctor implements Serializable {
    /**
     * 医生代号
     */
    @TableId
    private String doctorNo;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 科室代号
     */
    private String subjectNo;

    /**
     * 科室名称
     */
    private String subjectName;

    /**
     * 兼科代号
     */
    private String subjectNo1;

    /**
     * 工资代号
     */
    private String personNo;
    /**
     * 医生状态
     */
    private String state;
    @TableLogic
    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Integer isDelete;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}