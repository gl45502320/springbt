package com.gaolong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gaolong.dao")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//        FastJsonHttpMessageConverter oFastConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig oFastJsonConfig = new FastJsonConfig();
//        oFastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        oFastConverter.setFastJsonConfig(oFastJsonConfig);
//        List<MediaType> oFastMediaTypeList = new ArrayList<>();
//        oFastMediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
//        oFastConverter.setSupportedMediaTypes(oFastMediaTypeList);
//        HttpMessageConverter<?> oConverter = oFastConverter;
//        return new HttpMessageConverters(oConverter);
//    }



}
