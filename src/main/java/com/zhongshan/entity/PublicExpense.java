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
 * @TableName public_expense
 */
@TableName(value ="public_expense")
@Data
public class PublicExpense implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 
     */
    private Date beginDate;

    /**
     * 
     */
    private Date endDate;

    /**
     * 
     */
    private Integer inDays;

    /**
     * 
     */
    private Double chargeForMedicine;

    /**
     * 
     */
    private Double chargeForCheck;

    /**
     * 
     */
    private Double chargeForBed;

    /**
     * 
     */
    private Double otherCharge;

    /**
     * 
     */
    private String levelNo;

    /**
     * 
     */
    private String symptomNo;

    /**
     * 
     */
    private Double orgaTotal;

    /**
     * 
     */
    private Double personTotal;

    /**
     * 非空
     */
    private Date submitDate;

    /**
     * 
     */
    private String remarks;

    /**
     * 非空
     */
    private Integer sequenceNo;

    /**
     * 
     */
    private Integer chargeStandard;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}