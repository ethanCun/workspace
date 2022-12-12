package com.czy.common;

import com.czy.common.base.resp.BaseRep;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 异常工具
 */
@ControllerAdvice
public class ExceptionUtil {

    @ExceptionHandler(RuntimeException.class)
    public BaseRep exceptionHandle(Exception e){

        return BaseRep.fail(e.getLocalizedMessage());
    }
}
