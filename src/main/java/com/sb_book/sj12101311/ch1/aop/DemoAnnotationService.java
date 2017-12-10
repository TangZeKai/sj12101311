package com.sb_book.sj12101311.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){
        System.out.println(this.getClass().getName()+"DemoAnnotationService --add");
    }
}
