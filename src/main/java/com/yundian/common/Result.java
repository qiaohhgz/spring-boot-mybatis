package com.yundian.common;

import com.yundian.enums.Code;

public class Result<T> {
    private int code;
    private String message;
    private T result;

    public Result(Code code, T result) {
        this.code = code.getCode();
        this.message = code.getDesc();
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
