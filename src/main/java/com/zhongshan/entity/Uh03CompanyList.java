package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName uh03_company_list
 */
@TableName(value ="uh03_company_list")
@Data
@NoArgsConstructor
public class Uh03CompanyList implements Serializable {
    /**
     * 供应商id
     */
    @TableId
    private Integer comId;
    /**
     * 供应商代码
     */
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
     * 状态
     */
    @TableLogic
    private Integer state;
    /**
     * 类别,1—供应商，
2—领药部门
     */
    private Integer comType;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Uh03CompanyList(String comNo) {
        this.comNo = comNo;
    }
}