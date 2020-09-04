package com.quill.springdemo;

import com.quill.springdemo.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringDemoApplication.class, args);
        Person person = run.getBean(Person.class);
        System.out.println("person ="+person);

    }

}
