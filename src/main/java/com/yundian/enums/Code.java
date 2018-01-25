package com.yundian.enums;

public enum Code {
    SUCCESS(100, "SUCCESS"), FAIL(101, "FAILED"), unknown(-1, "未知");

    private int code;
    private String desc;

    Code(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
