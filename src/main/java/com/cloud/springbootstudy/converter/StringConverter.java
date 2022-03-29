package com.cloud.springbootstudy.converter;

import com.fasterxml.jackson.databind.util.StdConverter;

/**
 * @ClassName StringConverter
 * @Description
 * @Author ymy
 * @Date 2022/3/26 18:36
 * @Version 1.0
 */
public class StringConverter extends StdConverter<String,String> {
    @Override
    public String convert(String value) {
        return value+"001";
    }
}
