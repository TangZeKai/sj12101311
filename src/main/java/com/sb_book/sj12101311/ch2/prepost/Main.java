package com.sb_book.sj12101311.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.net.PortConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostCofig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
    context.close();
    }



}
