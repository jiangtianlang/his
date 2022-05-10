package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @TableName persons
 */
@TableName(value ="persons")
@Data
public class Persons implements Serializable {
    /**
     * 非空
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String personNo;

    /**
     * 非空
     */
    private String personName;

    /**
     * 按学校统一编码
     */
    private String departmentNo;

    /**
     * 按高教统一编码
     */
    private String titleNo;

    /**
     * 男，女
     */
    private String personSex;

    /**
     * 由医院编码01-99, 非空
     */
    private String chargeNo;

    /**
     * 
     */
    private String personTel;

    /**
     * 
     */
    private String personAddress;

    /**
     * 对固定金卡所扣剩下的余额
     */
    private Double personMoney;

    /**
     * 
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthDate;

    /**
     * 
     */
    @TableField(fill = FieldFill.INSERT)
    private Date registerDate;

    /**
     * 
     */
    private String cardMark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}