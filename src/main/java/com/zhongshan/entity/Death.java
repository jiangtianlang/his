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
 * @TableName death
 */
@TableName(value ="death")
@Data
public class Death implements Serializable {
    /**
     * 单位
     */
    @TableId
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
     * 临床诊断
     */
    private String diagnosis;

    /**
     * 发病日期
     */
    private Date accidentDate;

    /**
     * 死亡原因
     */
    private String deathCause;

    /**
     * 死亡日期
     */
    private Date deathDate;

    /**
     * 死亡地点
     */
    private String deathAdress;

    /**
     * 死者住址
     */
    private String adress;

    /**
     * 其它
     */
    private String additional;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}