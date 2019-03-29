package com.mjw.baseutil.frame.enums;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/28 16:43
 * @Version 1.0.0
 **/
public enum SysMsgEnums {

    SYS_SUCCESS(0,"成功"),
    SYS_UNKNOWN_FAIL(1,"操作失败"),

    ;

    /** 错误码*/
    private Integer sysCode;

    /** 错误信息*/
    private String sysMsg;

    static {
        /**
         * 校验错误码不得重复
         */
        Set<Integer> codes = new HashSet<>();

        for(SysMsgEnums errorEnum : values()){
            if(codes.contains(errorEnum.getSysCode())){
                throw new RuntimeException(" ERRORENUMS HAS REPEAT ERRO CODE ,PLEASE CHECK ERRORENUMS...");
            }else {
                codes.add(errorEnum.getSysCode());
            }
        }


    }

    SysMsgEnums(Integer sysCode, String sysMsg) {
        this.sysCode = sysCode;
        this.sysMsg = sysMsg;
    }

    public Integer getSysCode() {
        return sysCode;
    }

    public void setSysCode(Integer sysCode) {
        this.sysCode = sysCode;
    }

    public String getSysMsg() {
        return sysMsg;
    }

    public void setSysMsg(String sysMsg) {
        this.sysMsg = sysMsg;
    }
}
