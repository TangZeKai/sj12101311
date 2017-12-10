package com.sb_book.sj12101311.ch2.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg=demoEvent.getMsg();
        System.out.println("jieshoudao-msg:"+msg);
    }
}
