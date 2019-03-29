package com.mjw.baseutil.frame.exception;

import com.mjw.baseutil.frame.enums.SysMsgEnums;

/**
 * @Description 全局业务异常
 * @Author MinJunWen
 * @Data 2019/3/28 15:20
 * @Version 1.0.0
 **/
public class BusinessRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -6196580603262178845L;

    /** 错误码 */
    private Integer errorCode;

    /** 错误信息 */
    private String errorMsg;

    /**
     *  不允许手动创建 只能只能枚举创建
     */
    private BusinessRuntimeException(){}

    public BusinessRuntimeException(SysMsgEnums errorEnum){
        this.errorCode = errorEnum.getSysCode();
        this.errorMsg = errorEnum.getSysMsg();
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
