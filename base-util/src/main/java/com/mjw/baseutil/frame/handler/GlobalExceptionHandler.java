package com.mjw.baseutil.frame.handler;

import com.mjw.baseutil.frame.entity.ResponseEntity;
import com.mjw.baseutil.frame.exception.BusinessRuntimeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @Description 全局异常处理
 * @Author MinJunWen
 * @Data 2019/3/28 15:10
 * @Version 1.0.0
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕捉业务异常
     * @author MinJunWen
     * @date 2019/3/28 17:05
     */
    @ExceptionHandler({BusinessRuntimeException.class})
    @ResponseBody
    public ResponseEntity handlerBusinessRuntionException(BusinessRuntimeException exception, HttpServletResponse response){
        return ResponseEntity.buildBusinessRuntimeExceptionEntity(exception);
    }

    /**
     * 捕捉未知异常
     * @author MinJunWen
     * @date 2019/3/28 17:05
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResponseEntity handlerOtherException(Exception exception, HttpServletResponse response){
        return ResponseEntity.buildUnknownExceptionEntity(exception);
    }

}
