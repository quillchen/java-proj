package com.quill.springdemo.p2.scanbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/18 10:44
 */
@Controller
public class StartController {

    @Autowired
    @Qualifier("startServiceImpl1")
    StartService startService;

    public String which(){
        String desc = startService.desc();
        System.out.println(desc);
        return desc;
    }

}
