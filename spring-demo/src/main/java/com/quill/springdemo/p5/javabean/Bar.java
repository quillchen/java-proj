package com.quill.springdemo.p5.javabean;

import lombok.Data;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/28 10:52
 */
@Data
public class Bar {

    public Bar(String name) {
        this.name = name;
    }

    private String name;

}
