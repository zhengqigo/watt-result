package org.fuelteam.watt.result;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.alibaba.fastjson.JSON;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = -7039040962200146476L;

    private String code = ResultCode.SUCCESS.getCode();
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public Result<T> code(String code) {
        this.code = code;
        // this.message = ResultCode.of(code).getMessage();
        return this;
    }

    public Result<T> code(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        return this;
    }

    public boolean succeded() {
        return ResultCode.SUCCESS.getCode().equalsIgnoreCase(this.getCode());
    }

    public String getMessage() {
        return message;
    }

    public Result<T> message(String message) {
        this.message = message;
        return this;
    }

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.code(ResultCode.SUCCESS.getCode());
        result.message(ResultCode.SUCCESS.getMessage());
        return result;
    }

    public static <T> Result<T> error() {
        Result<T> result = new Result<T>();
        result.code(ResultCode.ERROR.getCode());
        result.message(ResultCode.ERROR.getMessage());
        return result;
    }

    public Result<T> custom(String code, String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> data(T data) {
        this.data = data;
        return this;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }
}