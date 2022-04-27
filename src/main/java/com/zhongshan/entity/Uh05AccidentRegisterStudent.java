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
 * @TableName uh05_accident_register_student
 */
@TableName(value ="uh05_accident_register_student")
@Data
public class Uh05AccidentRegisterStudent implements Serializable {
    /**
     * 学号
     */
    @TableId
    private String studentNo;

    /**
     * 日期
     */
    private Date date;

    /**
     * 事项(休学  退学  复学  死亡)
     */
    private String item;

    /**
     * 原因(病退  开除  勒令  自杀
交通事故  溺水  疾病死亡)
     */
    private String reason;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}