package com.quill.springdemo.p5.javabean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/28 10:54
 */
@Configurable
public class BeanConfig {

    @Bean
    public Foo foo(){
        return new Foo(bar(),"this is a method that gen java");
    }

    @Bean
    public Bar bar(){
       return new Bar("Jiu Bar");
    }
}
