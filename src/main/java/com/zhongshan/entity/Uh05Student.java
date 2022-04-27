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
 * @TableName uh05_student
 */
@TableName(value ="uh05_student")
@Data
public class Uh05Student implements Serializable {
    /**
     * 学号
     */
    @TableId
    private String studentNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别(男，女)
     */
    private String sex;

    /**
     * 出生日期
     */
    private Date birthDate;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 考区
     */
    private String arear;

    /**
     * 考号
     */
    private String examNo;

    /**
     * 既往病史
     */
    private String mediHist;

    /**
     * 家族病史
     */
    private String mediHistFamily;

    /**
     * 系所号
     */
    private String departmentNo;

    /**
     * 专业号(第1,2位：系所
第3位：类别
第4位：序号
第5,6位：年度)
     */
    private String majorFieldNo;

    /**
     * 年级
     */
    private String grade;

    /**
     * 学历类别(博士 硕士
本科 专科)
     */
    private String degreeLevel;

    /**
     * 当前状态('S' - 休学
'L' - 退学
'F' - 毕业)
     */
    private String status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}