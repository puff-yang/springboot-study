package com.cloud.springbootstudy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yangmanying
 * @date 2022/3/20 7:56 下午
 */
@Order(1)
@Component
public class MyBean2 implements ApplicationRunner {

    @Autowired
    public MyBean2(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        files.forEach(System.out::println);
        // if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("i am commandLineRunner 2");
    }
}
