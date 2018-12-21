package org.fuelteam.watt.result;

import java.util.Map;

import com.google.common.collect.Maps;

public enum ResultCode {

    // @formatter:off
    SUCCESS("000000", "SUCCESS"),
    ERROR("999999", "ERROR");
    // @formatter:on

    private static Map<String, ResultCode> map = Maps.newConcurrentMap();

    static {
        for (ResultCode resultCode : ResultCode.values()) {
            map.put(resultCode.getCode(), resultCode);
        }
    }

    public static ResultCode of(String code) {
        return map.get(code);
    }

    private String code;
    
    private String message;

    private ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public ResultCode code(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultCode message(String message) {
        this.message = message;
        return this;
    }
}
