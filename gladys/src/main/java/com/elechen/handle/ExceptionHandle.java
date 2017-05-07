package com.elechen.handle;

import com.elechen.domain.Result;
import com.elechen.exception.GladysException;
import com.elechen.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 22:10
 * Description: 描述.
 */
@ControllerAdvice
public class ExceptionHandle {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)  // 声明捕获的异常
    public Result handle(Exception e) {

        //判断异常类型
        if (e instanceof GladysException) {
            GladysException gladysException = (GladysException) e;
            return ResultUtil.error(gladysException.getCode(), gladysException.getMessage());
        }
        //打印异常日志
        LOGGER.error("【系统异常】{}", e.getMessage());
        return ResultUtil.error(-1, "未知异常");
    }
}
