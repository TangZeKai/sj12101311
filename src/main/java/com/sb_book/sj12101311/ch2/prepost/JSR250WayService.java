package com.sb_book.sj12101311.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    @PostConstruct//在构造函数执行完之后执行
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造参数-BeanWaySetvice");

    }

    @PreDestroy//在Bean销毁前执行
    public void destory() {
        System.out.println("@Bean-destory-method");
    }


}
