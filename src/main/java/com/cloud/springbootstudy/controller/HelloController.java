package com.cloud.springbootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = @Controller + @ResponseBody
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

}