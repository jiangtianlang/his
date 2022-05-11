package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName diagnose
 */
@TableName(value ="diagnose")
@Data
public class Diagnose implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer diseaseId;
    /**
     * 非空
     */
    private String diseaseIcd9;

    /**
     * 
     */
    private String diseaseCode;

    /**
     * 后来去掉
     */
    private String diseaseType;

    /**
     * 
     */
    private String diseaseName;
    /**
     * 状态
     */
    @TableLogic
    private Integer State;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}