package com.sb_book.sj12101311.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sb_book.sj12101311.ch2.prepost")
public class PrePostCofig {
    @Bean(initMethod = "init",destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
