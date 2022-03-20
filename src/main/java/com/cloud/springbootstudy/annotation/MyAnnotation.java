package com.cloud.springbootstudy.annotation;

import java.lang.annotation.*;

/**
 * @author yangmanying
 * @date 2022/3/13 1:18 下午
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {
    String name() default "zhangsan";
}

class Student {

    @MyAnnotation(name = "hehe")
    private String studentName;

    @MyAnnotation
    public void test() {

    }
}
