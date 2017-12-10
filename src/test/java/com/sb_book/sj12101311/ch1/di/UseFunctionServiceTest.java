package com.sb_book.sj12101311.ch1.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UseFunctionServiceTest {

    @Autowired
    UseFunctionService functionService;
    @Test
    public void sayHello() {

        System.out.println(functionService.SayHello("无敌"));
    }
}