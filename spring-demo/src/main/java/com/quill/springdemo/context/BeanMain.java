package com.quill.springdemo.context;

import com.quill.springdemo.p4.autowiredbean.Computer;
import com.quill.springdemo.p0.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/3 9:55
 */
@Slf4j
public class BeanMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring0.xml");
        Person person = context.getBean(Person.class);
        System.out.println("BeanMain# person "+person);
        Person personBean = (Person) context.getBean("person");
        System.out.println("BeanMain# personBean "+personBean);
        String[] aliases = context.getAliases("person");
        System.out.println("BeanMain# aliases"+ Arrays.toString(aliases));
        System.out.println("BeanMain# --------");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        System.out.println("BeanMain# --------");
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        System.out.println(Arrays.toString(beanNamesForType));
        Computer computer = context.getBean(Computer.class);
        System.out.println("BeanMain# computer = "+computer);
    }
}
