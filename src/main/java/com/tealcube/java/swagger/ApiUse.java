package com.tealcube.java.swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Selects a class annotated with @ApiDefine to reuse its group of Swagger annotations.
 * @author AD82225
 * @version 05082015
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiUse {

    Class<?>[] value();

}
