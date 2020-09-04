package com.quill.springdemo.context;

import com.quill.springdemo.bean.Earth;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/4 10:12
 */
public class CycleContext {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("start getBean");
        Earth bean = context.getBean(Earth.class);
        System.out.println("get desc "+bean.getDesc());
        Thread.sleep(5000);
        context.registerShutdownHook();
    }
}
