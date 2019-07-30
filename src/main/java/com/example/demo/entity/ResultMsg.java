package com.example.demo.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回对象
 */
public class ResultMsg {
    private String code;
    private String msg;
    private Object data;

    public ResultMsg() {
    }

    public static final String CODE_SUCCESS = "8001";
    public static final String MSG_SUCCESS = "操作成功";

    public static final String CODE_ERROR = "4001";
    public static final String MSG_ERROR = "操作失败";

    public static Map<String, String> map = new HashMap<String, String>();

    static {
        map.put(CODE_SUCCESS, MSG_SUCCESS);
        map.put(CODE_ERROR, MSG_ERROR);
    }
    public static final ResultMsg ERROR   = new ResultMsg(ResultMsg.CODE_ERROR);

    public static final ResultMsg SUCCESS = new ResultMsg(ResultMsg.CODE_SUCCESS);

    public ResultMsg(String code) {
        this.code = code;
        this.msg = getMsgByCode(code);
    }

    public ResultMsg(Object data) {
        this.data = data;
    }

    public ResultMsg(String code, Object data) {
        this.code = code;
        this.msg = getMsgByCode(code);
        this.data = data;
    }
    public ResultMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResultMsg(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public String getMsgByCode(String code) {
        return map.get(code);
    }
}
