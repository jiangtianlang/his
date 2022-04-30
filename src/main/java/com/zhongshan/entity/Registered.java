package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@TableName(value ="Registered")
@Data
public class Registered implements Serializable {
    @TableId
    private String personsNo;
    private Integer careId;
    private String  name;
    private String sex;
    private Integer phone;
    private String address;
    private String subjectNo;
    private Date time;
    private String state;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}

