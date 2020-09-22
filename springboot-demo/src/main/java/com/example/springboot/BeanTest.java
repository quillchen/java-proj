package com.example.springboot;

import com.example.springboot.bean.Animal;
import com.example.springboot.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/16 19:23
 */
public class BeanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Animal animal = (Animal) context.getBean("animalId");
        System.out.println(animal);
        Animal bean = context.getBean(Animal.class);
        System.out.println(bean);
    }
}
