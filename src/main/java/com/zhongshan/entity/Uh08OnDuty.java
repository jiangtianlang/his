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
 * @TableName uh08_on_duty
 */
@TableName(value ="uh08_on_duty")
@Data
public class Uh08OnDuty implements Serializable {
    /**
     * 
     */
    @TableId
    private String staffNo;

    /**
     * 
     */
    private String department;

    /**
     * 上班日期
     */
    private Date workDate;

    /**
     * 分正01常班、02值班、03早班、04中班、05晚班
     */
    private String branchOfWork;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}