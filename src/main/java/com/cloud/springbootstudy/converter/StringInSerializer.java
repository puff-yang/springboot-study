package com.cloud.springbootstudy.converter;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * @ClassName StringInSerializer
 * @Description
 * @Author ymy
 * @Date 2022/3/26 18:43
 * @Version 1.0
 */
public class StringInSerializer extends JsonDeserializer<String> {
    @Override
    public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        return "进入时反序列化" + p.getText();
    }
}
