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
 * @TableName contagion
 */
@TableName(value ="contagion")
@Data
public class Contagion implements Serializable {
    /**
     * 单位
     */
    private String unit;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Date birth;

    /**
     * 职别
     */
    private String position;

    /**
     * 职位
     */
    private String jobTitle;

    /**
     * 临床诊断
     */
    private String diagnosis;

    /**
     * 诊断日期
     */
    private Date diagnosiDate;

    /**
     * 住址
     */
    private String adress;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}