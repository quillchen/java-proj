package com.quill.springdemo.context;

import com.quill.springdemo.p5.javabean.BeanConfig;
import com.quill.springdemo.p5.javabean.Foo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/28 10:57
 */
public class JavaBeanMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Foo bean = context.getBean(Foo.class);
        System.out.println("JavaBeanMain foo="+bean);
    }
}
