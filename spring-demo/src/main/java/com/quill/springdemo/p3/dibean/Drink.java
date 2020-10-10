package com.quill.springdemo.p3.dibean;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/22 10:11
 */
public interface Drink {

    default void drink(){
        System.out.println("Drink# drinking");
    }
}
