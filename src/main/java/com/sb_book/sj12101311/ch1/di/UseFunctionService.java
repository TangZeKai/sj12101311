package com.sb_book.sj12101311.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}
