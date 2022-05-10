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
 * @TableName uh05_staff
 */
@TableName(value ="uh05_staff")
@Data
public class Uh05Staff implements Serializable {
    /**
     * 工资号
     */
    @TableId
    private String staffNo;

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
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthDate;

    /**
     * 部门代码
     */
    private String departmentNo;

    /**
     * 职称代码
     */
    private String titleNo;

    /**
     * 职务代码
     */
    private String postNo;

    /**
     * 级别
     */
    private String rank;

    /**
     * 籍贯代码
     */
    private String nativePlace;

    /**
     * 既往病史
     */
    private String mediHist;

    /**
     * 家族病史
     */
    private String mediHistFamily;

    /**
     * 家庭住址
     */
    private String homeAdd;

    /**
     * 住宅电话
     */
    private String homeTel;

    /**
     * 当前状态('1'-在职  '2'-调出  '3'-离休  
'4'-退休  '5'-死亡)
     */
    private String status;

    /**
     * 配偶姓名
     */
    private String spouseName;

    /**
     * 配偶单位
     */
    private String spouseOrga;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}