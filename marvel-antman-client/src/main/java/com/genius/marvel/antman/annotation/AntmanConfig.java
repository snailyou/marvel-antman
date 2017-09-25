package com.genius.marvel.antman.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Chuck Liu
 * @date 9/21/17
 * @time 10:06 PM
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AntmanConfig {

    String key() default "";

    String value() default "";

    String defaultValue() default "";
}
