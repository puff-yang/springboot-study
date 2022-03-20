package com.cloud.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ComponentScan("com.cloud.springbootstudy")
 * 变更启动类路径时，需加上此注解及启动类原包路径。不加项目也可正常启动，但controller中所有路径皆访问不到
 */
@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);
    }

}
