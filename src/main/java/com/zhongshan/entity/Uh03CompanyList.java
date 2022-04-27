package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh03_company_list
 */
@TableName(value ="uh03_company_list")
@Data
public class Uh03CompanyList implements Serializable {
    /**
     * 供应商代码
     */
    @TableId
    private String comNo;

    /**
     * 供应商名称
     */
    private String comName;

    /**
     * 地址
     */
    private String comAddress;

    /**
     * 联系电话
     */
    private String contactTel;

    /**
     * 联系人
     */
    private String contactPer;

    /**
     * 类别,1—供应商，
2—领药部门
     */
    private Integer comType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}