package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh03_price_c_dbf
 */
@TableName(value ="uh03_price_c_dbf")
@Data
public class Uh03PriceCDbf implements Serializable {
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
     * 品名
     */
    private String mediName;

    /**
     * 性质,1—自费；0—公费
     */
    private String quality;

    /**
     * 库存下限
     */
    private Integer storeLimit;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}