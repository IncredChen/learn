package com.elechen.exception;

import com.elechen.enums.ResultEnum;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 22:16
 * Description: 自定义异常.
 */
public class GladysException extends RuntimeException {

    private Integer code;

    public GladysException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
