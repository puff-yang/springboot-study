package com.cloud.springbootstudy.model;

import com.cloud.springbootstudy.converter.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName LocalDateTimeVO
 * @Description
 * @Author ymy
 * @Date 2022/3/26 17:32
 * @Version 1.0
 */
@Data
public class LocalDateVO implements Serializable {
    private static final long serialVersionUID = 7542413477183123637L;

    @JsonSerialize(converter = LocalDateTimeToStringConverter.class)
    @JsonDeserialize(converter = StringToLocalDateTimeConverter.class)
    private LocalDateTime currentDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

//    @JsonSerialize(converter = StringConverter.class)
//    @JsonSerialize(using = StringSerializer.class)
    @JsonDeserialize(using = StringInSerializer.class)
    private String name;
}
