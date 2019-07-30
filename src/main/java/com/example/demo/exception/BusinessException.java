package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

/**
 业务异常
 */
public class BusinessException extends Exception{
    private static final long serialVersionUID = -238091758285157331L;

    private String errCode;
    private String errMsg;

    public BusinessException(String errCode) {
        this.errCode = errCode;
        this.errMsg = getMsgByCode(errCode);
    }
    public BusinessException() {
        super();
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public static final String CODE_SUCCESS = "8001";
    public static final String MSG_SUCCESS = "操作成功";

    public static final String CODE_ERROR = "4001";
    public static final String MSG_ERROR = "操作失败";

    public static final String CODE_DATA_EMPTY = "4002";
    public static final String MSG_DATA_EMPTY = "数据为空";

    public String getMsgByCode(String code) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("CODE_DATE_FORMAT_ERROR", "MSG_DATE_FORMAT_ERROR");
        return map.get(code);
    }
    @Override
    public String toString() {
        return "错误码：" + errCode + "，错误信息：" + errMsg;
    }
}
