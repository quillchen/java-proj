package com.quill.springdemo.p2.scanbean;

import org.springframework.stereotype.Service;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/18 10:13
 */
@Service
public class StartServiceImpl1 implements StartService{
    @Override
    public String desc() {
        return "Start 1111111111111";
    }
}
