package com.sb_book.sj12101311.ch2.event;

import com.sb_book.sj12101311.ch2.el.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
        demoPublisher.publish("hehehe");
        context.close();
    }

}
