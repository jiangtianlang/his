package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh05_standard_high_student
 */
@TableName(value ="uh05_standard_high_student")
@Data
public class Uh05StandardHighStudent implements Serializable {
    /**
     * 男，女
     */
    @TableId
    private String sex;

    /**
     * 
     */
    @TableId
    private Integer age;

    /**
     * 单位：cm
     */
    private Double p3;

    /**
     * 单位：cm
     */
    private Double p5;

    /**
     * 单位：cm
     */
    private Double p10;

    /**
     * 单位：cm
     */
    private Double p25;

    /**
     * 单位：cm
     */
    private Double p30;

    /**
     * 单位：cm
     */
    private Double p50;

    /**
     * 单位：cm
     */
    private Double p70;

    /**
     * 单位：cm
     */
    private Double p80;

    /**
     * 单位：cm
     */
    private Double p90;

    /**
     * 单位：cm
     */
    private Double p95;

    /**
     * 单位：cm
     */
    private Double p97;

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
        Uh05StandardHighStudent other = (Uh05StandardHighStudent) that;
        return (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getP3() == null ? other.getP3() == null : this.getP3().equals(other.getP3()))
            && (this.getP5() == null ? other.getP5() == null : this.getP5().equals(other.getP5()))
            && (this.getP10() == null ? other.getP10() == null : this.getP10().equals(other.getP10()))
            && (this.getP25() == null ? other.getP25() == null : this.getP25().equals(other.getP25()))
            && (this.getP30() == null ? other.getP30() == null : this.getP30().equals(other.getP30()))
            && (this.getP50() == null ? other.getP50() == null : this.getP50().equals(other.getP50()))
            && (this.getP70() == null ? other.getP70() == null : this.getP70().equals(other.getP70()))
            && (this.getP80() == null ? other.getP80() == null : this.getP80().equals(other.getP80()))
            && (this.getP90() == null ? other.getP90() == null : this.getP90().equals(other.getP90()))
            && (this.getP95() == null ? other.getP95() == null : this.getP95().equals(other.getP95()))
            && (this.getP97() == null ? other.getP97() == null : this.getP97().equals(other.getP97()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getP3() == null) ? 0 : getP3().hashCode());
        result = prime * result + ((getP5() == null) ? 0 : getP5().hashCode());
        result = prime * result + ((getP10() == null) ? 0 : getP10().hashCode());
        result = prime * result + ((getP25() == null) ? 0 : getP25().hashCode());
        result = prime * result + ((getP30() == null) ? 0 : getP30().hashCode());
        result = prime * result + ((getP50() == null) ? 0 : getP50().hashCode());
        result = prime * result + ((getP70() == null) ? 0 : getP70().hashCode());
        result = prime * result + ((getP80() == null) ? 0 : getP80().hashCode());
        result = prime * result + ((getP90() == null) ? 0 : getP90().hashCode());
        result = prime * result + ((getP95() == null) ? 0 : getP95().hashCode());
        result = prime * result + ((getP97() == null) ? 0 : getP97().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", p3=").append(p3);
        sb.append(", p5=").append(p5);
        sb.append(", p10=").append(p10);
        sb.append(", p25=").append(p25);
        sb.append(", p30=").append(p30);
        sb.append(", p50=").append(p50);
        sb.append(", p70=").append(p70);
        sb.append(", p80=").append(p80);
        sb.append(", p90=").append(p90);
        sb.append(", p95=").append(p95);
        sb.append(", p97=").append(p97);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}