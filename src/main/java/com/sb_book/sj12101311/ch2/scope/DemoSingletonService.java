package com.sb_book.sj12101311.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")/*一个Spring容器共享一个实例*/
public class DemoSingletonService {
}
