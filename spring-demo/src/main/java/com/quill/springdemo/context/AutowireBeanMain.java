package com.quill.springdemo.context;

import com.quill.springdemo.p0.bean.Person;
import com.quill.springdemo.p4.autowiredbean.Computer;
import com.quill.springdemo.p4.autowiredbean.Phone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/3 9:55
 */
@Slf4j
public class AutowireBeanMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4-autowirebean.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("AutowireBeanMain# "+Arrays.toString(beanDefinitionNames));
        Computer computer = context.getBean(Computer.class);
        System.out.println("AutowireBeanMain# autowire is no, computer = "+computer);

        Phone phone = context.getBean(Phone.class);
        System.out.println("AutowireBeanMain# autowire is byName, phone = "+phone);
    }
}
