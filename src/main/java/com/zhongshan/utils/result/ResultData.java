package com.zhongshan.utils.result;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 */
public class ResultData implements Serializable {
    private Boolean success;
    private Integer code;
    private Object data;//String  List  Map  User  json
    private String msg;
    HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return  data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public ResultData() {
    }

    /**
     *  成功
     * @return
     */
    public static ResultData ok() {
        ResultData r = new ResultData();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMsg(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }

    /**
     * 功能描述：失败返回
     *
     * @return ResultData 失败返回结果
     * @author cakin
     * @date 2020/11/16
     */
    public static ResultData error() {
        ResultData r = new ResultData();
        r.setSuccess(ResultCodeEnum.UNKNOWN_REASON.getSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_REASON.getCode());
        r.setMsg(ResultCodeEnum.UNKNOWN_REASON.getMessage());
        return r;
    }

    /**
     *     * 功能描述：失败返回
     *      *
     *      * @return ResultData 失败返回结果
     * @param resultCodeEnum 填入  枚举
     * @return
     */
    public static ResultData error(ResultCodeEnum resultCodeEnum) {
        ResultData r = new ResultData();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMsg(resultCodeEnum.getMessage());
        return r;
    }

    /**
     * 功能描述：设置返回结果
     *
     * @param resultCodeEnum 结果枚举
     * @return ResultData 返回给前端的结果
     * @author cakin
     * @date 2020/11/16
     */
    public static ResultData ok(ResultCodeEnum resultCodeEnum) {
        ResultData r = new ResultData();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMsg(resultCodeEnum.getMessage());
        return r;
    }

    /**
     * 功能描述：设置success状态
     *
     * @param success 值为true或false
     * @return ResultData
     * @author cakin
     * @date 2020/11/16
     */
    public ResultData success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    /**
     * 功能描述：设置message内容
     *
     * @param message 消息内容
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public ResultData message(String message) {
        this.setMsg(message);
        return this;
    }

    /**
     * 功能描述：设置code内容
     *
     * @param code 返回码
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public ResultData code(Integer code) {
        this.setCode(code);
        return this;
    }

    /**
     * 功能描述：单值设置数据
     *
     * @param key   键
     * @param value 值
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public ResultData data(String key, Object value) {
        objectObjectHashMap.put(key, value);
        this.data=objectObjectHashMap;
        return this;
    }

    /**
     * 功能描述：多值设置数据
     *
     * @param obj 集合
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public ResultData data(Object obj) {
        this.setData(obj);
        return this;
    }



}