package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName department
 */
@TableName(value ="department")
@Data
public class Department implements Serializable {
    /**
     * 部 门 代 号(按学校统一编码非空)
     */
    @TableId
    private Integer departmentNo;

    /**
     * 部 门 名 称
     */
    private String departmentName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}