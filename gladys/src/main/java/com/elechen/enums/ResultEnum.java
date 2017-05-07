package com.elechen.enums;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 22:26
 * Description: 异常枚举.
 */
public enum ResultEnum {
    UNKNOW_EORROR(-1, "未知异常"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "小学"),
    MIDDLE_SCHOOL(101, "初中");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
