package com.example.springboot.config;

import com.example.springboot.bean.Animal;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/16 19:20
 */
@Configurable
public class BeanConfig {

    @Bean
    public Animal animalId(){
        return new Animal();
    }
}
