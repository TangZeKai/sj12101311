package com.sb_book.sj12101311.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(value = "com.sb_book.sj12101311.ch1.aop")/*扫描包下所有的bean*/
@EnableAspectJAutoProxy//开启spring对aspectj代理的支持
public class AopConfig {
}
