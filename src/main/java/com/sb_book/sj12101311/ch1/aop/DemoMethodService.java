package com.sb_book.sj12101311.ch1.aop;


import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

public void add(){
    System.out.println(this.getClass().getName()+"DemoMethodService-add");
}



}
