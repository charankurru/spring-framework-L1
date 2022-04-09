package com.BeanAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.BeanAnnotations")
@PropertySource("classpath:jdbc-config.properties")
public class BeanConfig {




}
