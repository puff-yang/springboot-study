package com.cloud.springbootstudy.converter;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @ClassName StringToLocalDateTimeConverter
 * @Description
 * @Author ymy
 * @Date 2022/3/26 17:29
 * @Version 1.0
 */
public class StringToLocalDateTimeConverter extends StdConverter<String, LocalDateTime> {
    @Override
    public LocalDateTime convert(String value) {
        return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
