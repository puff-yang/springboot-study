package com.cloud.springbootstudy.converter;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @ClassName LocalDateTimeToStringConverter
 * @Description
 * @Author ymy
 * @Date 2022/3/26 17:28
 * @Version 1.0
 */
public class LocalDateTimeToStringConverter extends StdConverter<LocalDateTime, String> {

    @Override
    public String convert(LocalDateTime value) {
        return value.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
