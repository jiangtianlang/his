package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@TableName(value ="registered")
@Data
public class Registered implements Serializable {
    @TableId
    private String personsNo;
    private String  name;
    private String age;
    private String sex;
    private BigInteger phone;
    private String subjectName;
    private String address;
    private Date time;
    private String peopleType;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}

