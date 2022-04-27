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
 * @TableName uhms_log
 */
@TableName(value ="uhms_log")
@Data
public class UhmsLog implements Serializable {
    /**
     * 日志编号
     */
    @TableId(type = IdType.AUTO)
    private Integer logNo;

    /**
     * 子系统名
     */
    private String subSystemName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 进入操作时间
     */
    private Date inTime;

    /**
     * 操作内容
     */
    private String operation;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}