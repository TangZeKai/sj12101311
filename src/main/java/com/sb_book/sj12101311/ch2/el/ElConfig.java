package com.sb_book.sj12101311.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sb_book.sj121013.ch2.el")
@PropertySource("classpath:com/sb_book/sj12101311/ch2/el/test.properties")
public class ElConfig {


    @Value("我最亲爱的")
    private String normal;

    @Value("#{systemEnvironment.os.name}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;



}
