package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    private Integer id;

    private String staffNo;

    /**
     * 
     */
    private String department;

    /**
     * 上班日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date workDate;

    /**
     * 分正01常班、02值班、03早班、04中班、05晚班
     */
    private String branchOfWork;
    /**
     * 实际工作量
     */
    private Double workAmount;
    /**
     * 额定工作量
     */
    private Double exWorkAmount;
    /**
     * 平均工作量
     */
    private Double averWorkAmount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}