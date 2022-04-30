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
     * 非空
     */
    @TableId
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