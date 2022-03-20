package com.cloud.springbootstudy.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @author yangmanying
 * @date 2022/3/13 12:52 下午
 * @ConfigurationProperties entity和yaml中属性绑定
 * @Component 启动时被扫描到，能够被调用
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
//@Validated
public class Person {
//    @Value("${person.name}")
    private String name;
    private List<String> books;
//    @Email
    private String email;

}
