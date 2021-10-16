package com.wenzi.logiclayer.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.wenzi.logiclayer.service")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class ProviderConfiguration {

}
