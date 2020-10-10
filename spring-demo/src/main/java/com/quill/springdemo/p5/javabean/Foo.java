package com.quill.springdemo.p5.javabean;

import lombok.Data;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/28 10:52
 */
@Data
public class Foo {

    private String desc;

    private Bar bar;

    public Foo(Bar bar,String desc) {
        this.bar = bar;
        this.desc = desc;
    }



}
