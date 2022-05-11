package com.zhongshan.entity.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data //自动 产生 getset
@AllArgsConstructor  //所以参数的构造器
@NoArgsConstructor //无参构造器
@ToString
public class OperationVo {
    @TableId
    private Integer oId;
    /**
     * 非空，每个病人病案号唯一
     */

    private String operationNum;

    /**
     * 非空
     */
    private Integer operationTimes;

    /**
     *
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endDate;
    /**
     *
     */
    private String operationName;

    /**
     * icd-9编码
     */
    private String operationCode;

    /**
     * 静脉麻|吸入麻|局麻|硬膜外麻|硬膜外麻+局麻|静脉麻+局麻
     */
    private String operationHocus;

    /**
     * 手术野 + 伤口愈合情况
     */
    private String operationCut;

    /**
     *
     */
    private String operationDoctorName;
    /**
     * 状态
     */
    @TableLogic
    private Integer State;
}
