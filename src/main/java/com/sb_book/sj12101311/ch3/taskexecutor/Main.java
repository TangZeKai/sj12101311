package com.sb_book.sj12101311.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(TaskExectorConfig.class);

        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);

        for(int i=0;i<10;i++){
        asyncTaskService.executeAsyncTask(i);
        asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
/**
 * 结果->
 * 并发并不是有序进行的
 */

}
