package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh03_store_w
 */
@TableName(value ="uh03_store_w")
@Data
public class Uh03StoreW implements Serializable {
    /**
     *  药品代码
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
     * 数量
     */
    private Integer quantity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Uh03StoreW() {
    }

    public Uh03StoreW(String mediNo, String specification, String unit, Integer quantity) {
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.quantity = quantity;
    }

    public Uh03StoreW(String comNo) {

    }

    public Uh03StoreW(Integer quantity) {
    }
}