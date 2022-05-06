package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName uh04_ward_bed_sum
 */
@TableName(value ="uh04_ward_bed_sum")
@Data
public class Uh04WardBedSum implements Serializable {
    /**
     * 日期
     */
    @TableId
    private Date totalDate;

    /**
     * 有效床位数
     */
    private Integer validBedNumber;

    /**
     * 占用床位数
     */
    private Integer useBedNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}