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
 * @TableName persons
 */
@TableName(value ="persons")
@Data
public class Persons implements Serializable {
    /**
     * 非空
     */
    @TableId
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
    private Date birthDate;

    /**
     * 
     */
    private Date registerDate;

    /**
     * 
     */
    private String cardMark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}