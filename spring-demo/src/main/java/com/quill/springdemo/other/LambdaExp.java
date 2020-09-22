package com.quill.springdemo.other;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/4 16:22
 */
public class LambdaExp {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "dog", "and", "cat");
        list.forEach(item-> System.out.println(item));

        LambdaExp lambdaExp = new LambdaExp();
        MyConsumer myConsumer = () -> System.out.println("dd");
        myConsumer.action();

        new Thread(()-> System.out.println("hello")).start();
    }


    interface MyConsumer<T> {
        void action();
    }


}
