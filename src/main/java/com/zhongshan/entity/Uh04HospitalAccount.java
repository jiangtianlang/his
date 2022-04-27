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
 * @TableName uh04_hospital_account
 */
@TableName(value ="uh04_hospital_account")
@Data
public class Uh04HospitalAccount implements Serializable {
    /**
     * 科目编码
     */
    private String subjectCode;

    /**
     * 日期
     */
    private Date accountDate;

    /**
     * 本日发生数
     */
    private Double dayMoney;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}