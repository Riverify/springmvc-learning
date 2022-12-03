package com.itheima.controller;

import com.itheima.domain.Code;
import com.itheima.domain.Result;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * FileName: ProjectExceptionAdvice
 * Date: 2022/12/03
 * Time: 14:28
 * Author: river
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        // 记录日志

        // 发送消息给运维

        // 发送给开发

        // 返回
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {
        // 返回
        return new Result(ex.getCode(), null, ex.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        // 返回其他异常
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "...系统繁忙");
    }

}
