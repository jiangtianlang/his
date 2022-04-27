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
 * @TableName day_money
 */
@TableName(value ="day_money")
@Data
public class DayMoney implements Serializable {
    /**
     * 医疗卡号
     */
    @TableId
    private String personsNo;

    /**
     * 追加日期
     */
    private Date dayDate;

    /**
     * 金额
     */
    private Double dayMoney;

    /**
     * 余额
     */
    private Double daySup;

    /**
     *  操作员号
     */
    private String opera;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}