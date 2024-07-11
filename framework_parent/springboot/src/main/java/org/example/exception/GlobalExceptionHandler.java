package org.example.exception;

import org.example.response.Result;
import org.example.response.ResultEnum;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 全局异常处理器类
 * @author 16339
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public Object handleCustomException(CustomException e) {
        // 打印异常追踪信息
        e.printStackTrace();
        // 从异常对象里取出一场枚举
        ResultEnum resultEnum = e.getResultEnum();
        // 返回错误给前端
        return Result.error(resultEnum);
    }

    @ExceptionHandler(BindException.class)
    public Object handleBindException(BindException e) {
        e.printStackTrace();
        // 获取异常对象中携带的校验结果对象(里面有校验失败的字段和消息)
        BindingResult bindingResult = e.getBindingResult();
        // bindingResult中携带了一个fieldError的list对象
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        Map<String, String> errorMap = new HashMap<>();
        // 遍历FieldErrors这个list，依次取出其中的异常信息放入errorMap中
        for (FieldError fieldError : fieldErrors) {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        // 创建resultMap，放入自定义的校验异常码和errorMap具体的异常信息map
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", ResultEnum.DATA_NOT_FOUND.getCode());
        resultMap.put("message", errorMap);
        return resultMap;

        // 简单方案，直接返回校验失败的信息，但是前端不会知道是哪个字段校验失败了
        // return Result.error(ResultEnum.DATA_NOT_FOUND);
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public Object handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
        e.printStackTrace();
        return Result.error(ResultEnum.FILE_OUT_MAX_SIZE);
    }

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        e.printStackTrace();
        return Result.error();
    }
}
