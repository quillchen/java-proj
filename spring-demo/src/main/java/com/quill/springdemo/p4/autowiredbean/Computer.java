package com.quill.springdemo.p4.autowiredbean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/3 10:10
 */
@Data
public class Computer {

    //默认不进行自动加载
    @Autowired
    private Cpu cpu;

    private Double memory;

    private Double hardDisk;
}
