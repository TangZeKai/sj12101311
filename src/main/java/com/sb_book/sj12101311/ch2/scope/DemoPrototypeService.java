package com.sb_book.sj12101311.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")/*每次调用新建一个新的bean实例*/
public class DemoPrototypeService {
}
