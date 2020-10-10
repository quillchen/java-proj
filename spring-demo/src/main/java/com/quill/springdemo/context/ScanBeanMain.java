package com.quill.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/18 10:36
 */
public class ScanBeanMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2-scanbean.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String name:beanDefinitionNames) {
//            System.out.println("ScanBeanMain# "+name);
//        }
        Arrays.asList(beanDefinitionNames).forEach(name -> System.out.println("ScanBeanMain# "+name));
    }
}
