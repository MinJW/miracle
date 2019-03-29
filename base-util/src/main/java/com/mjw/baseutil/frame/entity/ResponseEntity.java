package com.mjw.baseutil.frame.entity;

import com.mjw.baseutil.frame.enums.SysMsgEnums;
import com.mjw.baseutil.frame.exception.BusinessRuntimeException;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/28 15:16
 * @Version 1.0.0
 **/
public class ResponseEntity {

    /** 状态码*/
    private int code = 0;

    /** 状态描述*/
    private String msg = "";

    /** 时间戳 13位*/
    private long timestamp;

    /** 返回数据*/
    private Object data = "";

    /**
     * @Title
     * @Description 构建业务异常返回实体
     * @author MinJunWen
     * @date 2019/3/28 17:06
     */
    public static ResponseEntity buildBusinessRuntimeExceptionEntity(BusinessRuntimeException exception){

        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(exception.getErrorCode());
        responseEntity.setMsg(exception.getErrorMsg());
        responseEntity.setTimestamp(System.currentTimeMillis());

        return responseEntity;
    }

    /**
     * @Title
     * @Description 构建其他异常返回实体
     * @author MinJunWen
     * @date 2019/3/28 17:06
     */
    public static ResponseEntity buildUnknownExceptionEntity(Exception exception){

        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(SysMsgEnums.SYS_UNKNOWN_FAIL.getSysCode());
        responseEntity.setMsg(SysMsgEnums.SYS_UNKNOWN_FAIL.getSysMsg());
        responseEntity.setTimestamp(System.currentTimeMillis());

        return responseEntity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
