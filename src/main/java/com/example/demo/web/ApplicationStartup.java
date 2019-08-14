package com.example.demo.web;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author sj
 * web容器启动后, 初始化工作
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("------------监听加载------------");
        System.out.println("我的父容器为：" + contextRefreshedEvent.getApplicationContext().getParent());
        System.out.println("初始化时我被调用了");
    }
}
