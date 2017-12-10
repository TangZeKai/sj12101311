package com.sb_book.sj12101311.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("yibu task: no :"+i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("yibu task plusno"+(i+1));
    }
}
