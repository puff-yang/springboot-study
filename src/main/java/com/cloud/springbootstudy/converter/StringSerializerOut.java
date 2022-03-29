package com.cloud.springbootstudy.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

/**
 * @ClassName StringSerializer
 * @Description
 * @Author ymy
 * @Date 2022/3/26 18:38
 * @Version 1.0
 */
public class StringSerializerOut extends JsonSerializer<String> {
    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString("out is =" + value);
    }
}
