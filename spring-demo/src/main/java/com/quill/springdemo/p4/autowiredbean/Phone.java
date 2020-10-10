package com.quill.springdemo.p4.autowiredbean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/27 10:19
 */
@Data
public class Phone {

    @Autowired
    private PhoneCpu phoneCpu;

    @Autowired
    private Screen screen;

}
