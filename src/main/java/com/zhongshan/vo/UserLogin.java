package com.zhongshan.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jtl
 * @date 2022年04月28日 19:08:14
 */
@Data
@ApiModel(value = "UserLogin对象",description = "用户登录的实体")
public class UserLogin {
    @ApiModelProperty(value = "职工编号")
    private String userName;
    @ApiModelProperty(value = "密码")
    private String passWord;
    @ApiModelProperty(value = "验证码")
    private String code;
    @ApiModelProperty(value = "验证码uuid")
    private String uuid;
}
