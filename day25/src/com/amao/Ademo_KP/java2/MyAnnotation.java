package com.amao.Ademo_KP.java2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 17:39
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "Hello";
}
