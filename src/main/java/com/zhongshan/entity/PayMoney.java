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
 * @TableName pay_money
 */
@TableName(value ="pay_money")
@Data
public class PayMoney implements Serializable {
    /**
     * 住院号
     */
    @TableId
    private String patientNo;

    /**
     * 交款日期
     */
    private Date paydate;

    /**
     * 病人姓名
     */
    private String patientName;

    /**
     * 预交款
     */
    private Double money;

    /**
     * 出院否
     */
    private Integer outFlag;

    /**
     * 出院日期
     */
    private Date outDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}