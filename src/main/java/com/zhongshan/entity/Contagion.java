package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @TableId
    private Integer id;
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
    @JsonFormat(pattern="yyyy-MM-dd")
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date diagnosiDate;

    /**
     * 住址
     */
    private String adress;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}