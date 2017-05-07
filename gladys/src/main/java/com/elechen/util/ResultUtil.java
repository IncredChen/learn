package com.elechen.util;

import com.elechen.domain.Result;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 21:50
 * Description: 结果构造器.
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(1);
        result.setMessage("success");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message );
        return result;
    }
}
