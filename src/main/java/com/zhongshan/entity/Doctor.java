package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}