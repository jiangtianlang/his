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
 * @TableName sp05_gynecology
 */
@TableName(value ="sp05_gynecology")
@Data
public class Sp05Gynecology implements Serializable {
    /**
     * 
     */
    @TableId
    private String checkNo;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private String item;

    /**
     * 
     */
    private String desc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}