package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigInteger;

@TableName(value ="medicalcard")
@Data
public class MedicalCard {
    @TableId
    private String personsNo;
    private String name;
    private BigInteger phone;
    private String age;
    private String sex;
    private String state;
    private String money;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
