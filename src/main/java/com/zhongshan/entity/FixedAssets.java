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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FixedAssets other = (FixedAssets) that;
        return (this.getFixedNo() == null ? other.getFixedNo() == null : this.getFixedNo().equals(other.getFixedNo()))
            && (this.getFixedName() == null ? other.getFixedName() == null : this.getFixedName().equals(other.getFixedName()))
            && (this.getFixedNum() == null ? other.getFixedNum() == null : this.getFixedNum().equals(other.getFixedNum()))
            && (this.getFixedPrice() == null ? other.getFixedPrice() == null : this.getFixedPrice().equals(other.getFixedPrice()))
            && (this.getFixedDate() == null ? other.getFixedDate() == null : this.getFixedDate().equals(other.getFixedDate()))
            && (this.getScrap() == null ? other.getScrap() == null : this.getScrap().equals(other.getScrap()))
            && (this.getMaintenance() == null ? other.getMaintenance() == null : this.getMaintenance().equals(other.getMaintenance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFixedNo() == null) ? 0 : getFixedNo().hashCode());
        result = prime * result + ((getFixedName() == null) ? 0 : getFixedName().hashCode());
        result = prime * result + ((getFixedNum() == null) ? 0 : getFixedNum().hashCode());
        result = prime * result + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        result = prime * result + ((getFixedDate() == null) ? 0 : getFixedDate().hashCode());
        result = prime * result + ((getScrap() == null) ? 0 : getScrap().hashCode());
        result = prime * result + ((getMaintenance() == null) ? 0 : getMaintenance().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fixedNo=").append(fixedNo);
        sb.append(", fixedName=").append(fixedName);
        sb.append(", fixedNum=").append(fixedNum);
        sb.append(", fixedPrice=").append(fixedPrice);
        sb.append(", fixedDate=").append(fixedDate);
        sb.append(", scrap=").append(scrap);
        sb.append(", maintenance=").append(maintenance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}