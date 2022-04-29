package com.zhongshan.utils;

/**
 * 结果集枚举
 */
public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS(true, 200, "成功"),
    SUCCESS_FIND(true, 200, "查询成功"),
    //SUCCESS_INSERT(true, 200, "新增成功"),
    SUCCESS_CRUD(true, 200, "更新成功"),
    /**
     * 数据验证有关
     */
    UN_DATA(false, 38008, "没有数据"),
    PARAM_ERROR(false, 31003, "参数不正确"),
    PARAM_FORMAT_ERROR(false, 31400, "参数数据格式有误"),
    COMMENT_EMPTY(false, 34006, "内容必须填写"),
    CODE_ERROR(false, 38000, "验证码错误"),
    LOGIN_PHONE_ERROR(false, 38009, "手机号码不正确"),
    LOGIN_MOBILE_ERROR(false, 38001, "账号不正确"),

    LOGIN_PASSWORD_ERROR(false, 38008, "密码不正确"),


    /////////////// 登录相关
    TOKEN_EXPIRED_ERROR(false, 43001, "token过期,请重新登录"),
    /**
     * 找不到用户
     */
    LOGIN_ERROR_UNKNOWNACCOUNT(false, 43002, "用户不存在"),
    /**
     * 登陆失败
     */
    LOGIN_ERROR(false, 43001, "登录失败,用户名或者密码错误"),
    /**
     * 该用户已被禁用
     */
    LOGIN_DISABLED_ERROR(false, 48002, "该用户已被禁用"),
    /**
     * 手机号已被注册
     */
    REGISTER_MOBLE_ERROR(false, 48003, "手机号已被注册"),
    LOGIN_AUTH(false, 48004, "需要登录"),
    LOGIN_ACL(false, 48005, "没有权限"),
    LOGIN_ACCESS(false, 48005, "权限问题"),
    FETCH_ACCESSTOKEN_FAILD(false, 43003, "获取accessToken失败"),
    FETCH_USERINFO_ERROR(false, 43004, "获取用户信息失败"),
    /**
     * 短信服务
     */
    SMS_SEND_ERROR(false, 58006, "短信发送失败"),
    SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL(false, 58007, "短信发送过于频繁"),

    /**
     * 文件上传下载 相关错误
     */
    FILE_UPLOAD_ERROR(false, 61004, "文件上传错误"),
    FILE_DELETE_ERROR(false, 61005, "文件刪除错误"),
    EXCEL_DATA_IMPORT_ERROR(false, 61006, "Excel数据导入错误"),

    VIDEO_UPLOAD_ALIYUN_ERROR(false, 62001, "视频上传至阿里云失败"),
    VIDEO_UPLOAD_TOMCAT_ERROR(false, 62002, "视频上传至业务服务器失败"),
    VIDEO_DELETE_ALIYUN_ERROR(false, 62003, "阿里云视频文件删除失败"),
    FETCH_VIDEO_UPLOADAUTH_ERROR(false, 62004, "获取上传地址和凭证失败"),
    REFRESH_VIDEO_UPLOADAUTH_ERROR(false, 62005, "刷新上传地址和凭证失败"),
    FETCH_PLAYAUTH_ERROR(false, 62006, "获取播放凭证失败"),

    /**
     * 订单相关错误
     */
    PAY_RUN(false, 75000, "支付中"),
    PAY_UNIFIEDORDER_ERROR(false, 75001, "统一下单错误"),
    PAY_ORDERQUERY_ERROR(false, 75002, "查询支付结果错误"),
    ORDER_EXIST_ERROR(false, 75003, "重复操作订单"),
    /**
     * 其他 错误信息
     */
    BAD_SQL_GRAMMAR(false, 81001, "sql语法错误"),
    JSON_PARSE_ERROR(false, 81002, "json解析异常"),
    URL_ENCODE_ERROR(false, 83001, "URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(false, 83002, "非法回调请求"),
    GATEWAY_ERROR(false, 86000, "服务不能访问"),
    UNKNOWN_REASON(false, 80001, "未知错误"),
    RUNTIMEEXCEPTION(false, 80001, "服务运行报错"),
    REQUEST_METHOD_ERROR(false, 80001, "请求方式有误"),
    STACK_OVERFLOW_ERROR(false, 80001, "栈溢出");
    private Boolean success;

    private Integer code;

    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
