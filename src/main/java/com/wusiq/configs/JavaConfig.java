package com.wusiq.configs;

import com.wusiq.service.DogServcie;
import com.wusiq.service.impl.DogServcieImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 方法一：javaconfig配置信息获取properties的值
 */
@Configuration
@ComponentScan
@PropertySource("classpath:/application.properties")
public class JavaConfig {
    @Bean
    public DogServcie getDogService(){
        return new DogServcieImpl();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    };
}
