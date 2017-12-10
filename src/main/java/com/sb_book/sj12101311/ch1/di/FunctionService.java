package com.sb_book.sj12101311.ch1.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class FunctionService {
    public String sayHello(String word){
        return "Hello"+word+"!";
    }
}
