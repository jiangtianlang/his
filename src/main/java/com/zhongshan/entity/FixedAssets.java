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
 * @TableName fixed_assets
 */
@TableName(value ="fixed_assets")
@Data
public class FixedAssets implements Serializable {
    /**
     * 
     */
    @TableId
    private String fixedNo;

    /**
     * 
     */
    private String fixedName;

    /**
     * 
     */
    private Integer fixedNum;

    /**
     * 
     */
    private Double fixedPrice;

    /**
     * 
     */
    private Date fixedDate;

    /**
     * 0代表报废，1代表使用
     */
    private Integer scrap;

    /**
     * 
     */
    private String maintenance;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}