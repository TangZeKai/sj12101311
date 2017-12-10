package com.sb_book.sj12101311.ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@ComponentScan("com.sb_book.sj12101311.ch3.taskexecutor")
@EnableAsync//kaiqiyiburenwuzhichi
public class TaskExectorConfig  implements AsyncConfigurer{
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();//thread pool
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
