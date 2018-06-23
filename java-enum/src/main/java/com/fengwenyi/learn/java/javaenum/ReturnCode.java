package com.fengwenyi.learn.java.javaenum;

/**
 * @author Wenyi Feng
 */
public enum ReturnCode {

    ERROR(200, "Error"),

    SUCCESS(100, "Success")
    ;

    private Integer code;
    private String msg;

    ReturnCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
