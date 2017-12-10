package com.sb_book.sj12101311.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**声明本类为配置类*/
@Configuration

/**此注解自动扫描包下所有@S@Component类似注解 并注册为Bean*/
@ComponentScan(value = "com.sb_book.sj12101311.ch1.di")

public class DiConfig {


}
