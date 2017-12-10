package com.sb_book.sj12101311.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        /**
         * AnnotationConfigApplicationContext 作为Spring容器 接收输入一个配置类作为参数
         */
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DiConfig.class);

        /**
         * 获得声明配置DiConfig里面扫描到的UseFunctionService@Bean
         */
        UseFunctionService useFunctionService=
                context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.SayHello("Main.SayHello"));
        context.close();

    }


}
