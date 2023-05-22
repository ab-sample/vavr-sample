package com.qwfys.sample.vavr.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author liuwenke
 * @since 0.0.1
 */
@Configuration
public class DefaultConfig {

    ///**
    // * 对返回前端的JSON数据进行格式化
    // *
    // * @return 进行格式化ObjectMapper
    // */
    //@Bean
    //public ObjectMapper objectMapper() {
    //    ObjectMapper mapper = new ObjectMapper();
    //    // 进行缩进输出
    //    mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    //    // 解决延迟加载的对象
    //    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    //    // 进行Date日期格式化
    //    DateFormat dateFormat = new SimpleDateFormat(DatePattern.NORM_DATETIME_PATTERN);
    //    mapper.setDateFormat(dateFormat);
    //
    //    JavaTimeModule javaTimeModule = new JavaTimeModule();
    //    // 序列换成json时,将所有的long变成string ，处理Long类型转Json后精度丢失问题
    //    javaTimeModule.addSerializer(Long.class, ToStringSerializer.instance);
    //    javaTimeModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
    //
    //    // 进行LocalDateTime时间格式化
    //    javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    //    javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    //    javaTimeModule.addSerializer(LocalTime.class, new LocalTimeSerializer(DateTimeFormatter.ofPattern("HH:mm:ss")));
    //
    //    mapper.registerModule(javaTimeModule);
    //    mapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
    //
    //    mapper.registerModule(new ParameterNamesModule()).registerModule(new Jdk8Module()).registerModule(new JavaTimeModule());
    //
    //    mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
    //
    //    // 支持接收List
    //    mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    //    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    //    // 根据属性名称排序
    //    mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    //    mapper.configure(MapperFeature.ALLOW_COERCION_OF_SCALARS, true);
    //    mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
    //    return mapper;
    //}

}
