package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh03_on_store_c
 */
@TableName(value ="uh03_on_store_c")
@Data
public class Uh03OnStoreC implements Serializable {
    /**
     * 药品代码
     */
    @TableId
    private String mediNo;

    /**
     * 规格
     */
    private String specification;

    /**
     * 单位
     */
    private String unit;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 数量
     */
    private Integer quantity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}