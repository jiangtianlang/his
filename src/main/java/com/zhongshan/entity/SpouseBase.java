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
 * @TableName spouse_base
 */
@TableName(value ="spouse_base")
@Data
public class SpouseBase implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 
     */
    private String spouseName;

    /**
     * 
     */
    private Date spouseBirthDate;

    /**
     * 
     */
    private String spouseParty;

    /**
     * 
     */
    private String spouseSchooling;

    /**
     * 
     */
    private Date marryDate;

    /**
     * 
     */
    private String workUnit;

    /**
     * 
     */
    private String spouseNative;

    /**
     * 全民或集体
     */
    private String workQuality;

    /**
     * t—干部   f—工人
     */
    private String cadre;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}