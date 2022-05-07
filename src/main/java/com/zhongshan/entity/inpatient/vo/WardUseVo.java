package com.zhongshan.entity.inpatient.vo;

import com.baomidou.mybatisplus.annotation.*;
import com.zhongshan.entity.inpatient.PatientBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName ward_use
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WardUseVo implements Serializable {

    /**
     * 床号
     */
    private String bedNo;

    /**
     * 科别
     */
    private String section;
    /**
     * 价格
     */
    private Double price;

    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String patientSex;





    private static final long serialVersionUID = 1L;


}