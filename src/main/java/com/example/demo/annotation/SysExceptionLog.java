package com.example.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author DSM.Avalon@gmail.com
 * @ClassName: SysExceptionLog
 * @Description: 调用异常日志注解
 * @date 2019/12/5
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SysExceptionLog {

    String description()  default "";

}
