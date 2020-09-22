package com.quill.springdemo.context;

import com.quill.springdemo.dibean.Cup;
import com.quill.springdemo.dibean.TextEditor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/22 9:38
 */
public class DiBeanMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("DiBeanMain# "+ Arrays.toString(beanDefinitionNames));
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.spellCheck();

        Cup cup = (Cup) context.getBean("cup");
        cup.drink();

        Cup cup2 = (Cup) context.getBean("cup2");
        cup2.drink();
    }
}
