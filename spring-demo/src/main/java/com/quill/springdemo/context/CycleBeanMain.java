package com.quill.springdemo.context;

import com.quill.springdemo.cyclebean.InitMethodEarth;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/4 10:12
 */
public class CycleBeanMain {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-cyclebean.xml");
        System.out.println("start getBean");
        InitMethodEarth bean = context.getBean(InitMethodEarth.class);
        System.out.println("get desc "+bean.getDesc());
        Thread.sleep(1000);
        context.registerShutdownHook();
    }
}
