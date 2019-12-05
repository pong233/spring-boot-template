package com.example.demo.annotation;

import java.lang.annotation.*;

/**
 * @author DSM.Avalon@gmail.com
 * @ClassName: SysTraceLog
 * @Description: 调用日志追踪
 * @date 2019/12/5
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysTraceLog {

    String description()  default "";

}
