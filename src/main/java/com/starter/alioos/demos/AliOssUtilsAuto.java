package com.starter.alioos.demos;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@EnableConfigurationProperties(AliOSSProperties.class)
@Configuration
public class AliOssUtilsAuto {
    @Bean
    public AliOSSUtils aliOSSUtils(AliOSSProperties aliOSSProperties) {
        AliOSSUtils aliOSSUtils = new AliOSSUtils(aliOSSProperties);
        aliOSSUtils.setAliOSSProperties(aliOSSProperties);
        return aliOSSUtils;
    }
}
