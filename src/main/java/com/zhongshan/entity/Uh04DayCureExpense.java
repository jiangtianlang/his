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
 * @TableName uh04_day_cure_expense
 */
@TableName(value ="uh04_day_cure_expense")
@Data
public class Uh04DayCureExpense implements Serializable {
    /**
     * 住院号
     */
    @TableId
    private String patientNo;

    /**
     * 日期
     */
    private Date cureDate;

    /**
     * 科目码
     */
    private String subjectCode;

    /**
     * 本日发生数
     */
    private Double ownExpense;

    /**
     * 出院否
     */
    private String outHospitalFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}