package com.sb_book.sj12101311.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
@Configuration
@ComponentScan("com.sb_book.sj12101311.ch2.el")
@PropertySource("classpath:com/sb_book/sj12101311/ch2/el/test.properties")
public class ElConfig {


    @Value("我最亲爱的")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    @Value("#{demoService.author}")
    private String fromAuthor;
//import sun.misc.Resource;
    @Value("classpath:com/sb_book/sj12101311/ch2/el/test.txt")
    private Resource testFile;
//import org.springframework.core.io.Resource;
    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() throws IOException {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAuthor);
        System.out.println(IOUtils.toString(testFile.getInputStream()));
        System.out.println(IOUtils.toString(testUrl.getInputStream()));
        System.out.println("bookname"+bookName);
        System.out.println(environment.getProperty("book.author"));
    }




}
