package com.cloud.springbootstudy.controller;

import com.cloud.springbootstudy.model.LocalDateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @RestController = @Controller + @ResponseBody
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

    @GetMapping("/test/converter")
    LocalDateVO localDateTimeConverter(@RequestBody LocalDateVO params) {
        log.info("转换成功 params={}", params);
        return params;
    }

    public static void main(String[] args) {
        String date="2022-03-25";
//        Date date1 = new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        String format = sdf.format(date1);
//        System.out.println(format);
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        System.out.println(localDate);
        String format = localDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);
    }

}