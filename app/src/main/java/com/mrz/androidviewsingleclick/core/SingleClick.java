package com.mrz.androidviewsingleclick.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName: SingleClick
 * Author: MrZ
 * Date: 2019/5/24 4:45 PM
 * Description:
 * History:
 * <author> <time> <version> <desc>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SingleClick {
    long value() default 1000;
}
