package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.Date;

@TableName(value ="medicalcard")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MedicalCard {
    @TableId
    private String personsNo;
    private String name;
    private BigInteger phone;
    private String age;
    private String sex;
    private String state;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creatTime;
    private String money;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
