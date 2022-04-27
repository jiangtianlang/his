package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName check_standard
 */
@TableName(value ="check_standard")
@Data
public class CheckStandard implements Serializable {
    /**
     * 检查项目代号
     */
    @TableId
    private String checkNo;

    /**
     * 名称
     */
    private String checkName;

    /**
     * 价格
     */
    private Double checkPay;

    /**
     * 单位
     */
    private String checkUnit;

    /**
     * 类型
     */
    private String checkType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}