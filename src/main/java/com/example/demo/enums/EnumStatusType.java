package com.example.demo.enums;

/**
 * @Author dongm
 * @Description: 状态类型枚举
 * @Date 2019/7/30 14:11
 */
public enum EnumStatusType {

    AVAILABLE("1","可用"),
    UNAVAILABLE("0","不可用")
    ;

    private String value;
    private String name;

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    EnumStatusType(String value, String name) {
        this.value = value;
        this.name = name;
    }


}
