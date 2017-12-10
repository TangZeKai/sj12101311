package com.sb_book.sj12101311.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configruration 表示当前类是配置类 意味着这个类可能有0个或多个@Bean注解 如果只用此类中的Bean不用使用包扫描
 * 其他类可以用包扫描
 */
@Configuration
public class JavaConfig {

    /**
     * @Bean注解在放方法上 声明当前方法的返回值是一个Bean
     * @return
     */
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    /**
     * @Bean注解在放方法上 声明当前方法的返回值是一个Bean
     * @return
     */
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService=new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService1=new UseFunctionService();
        useFunctionService1.setFunctionService(functionService);
        return useFunctionService1;
    }
}
