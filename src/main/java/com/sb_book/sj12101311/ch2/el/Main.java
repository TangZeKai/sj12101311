package com.sb_book.sj12101311.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig demoService=context.getBean(ElConfig.class);

        demoService.outputResource();
        context.close();
    }

}
