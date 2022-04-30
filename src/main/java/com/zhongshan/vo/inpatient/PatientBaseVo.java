package com.zhongshan.vo.inpatient;

import com.zhongshan.entity.inpatient.PatientBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jtl
 * @date 2022年04月29日 16:22:30
 */
@Data
@ApiModel(value = "PatientBaseVo对象",description = "病人基本信息查询对象")
public class PatientBaseVo {
    @ApiModelProperty(value = "页码,从1开始")
    private Long page;
    @ApiModelProperty(value = "每页条数")
    private Long limit;
    private PatientBase patientBase;
}
