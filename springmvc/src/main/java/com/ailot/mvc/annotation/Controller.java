package com.ailot.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author ailot
 * @version Controller.java, 2019年04月07日 上午11:41
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {

    String value() default "";
}
