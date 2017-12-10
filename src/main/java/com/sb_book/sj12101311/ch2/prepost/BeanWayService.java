package com.sb_book.sj12101311.ch2.prepost;

public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造参数-BeanWaySetvice");
    }
    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
