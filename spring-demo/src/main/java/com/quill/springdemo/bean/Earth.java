package com.quill.springdemo.bean;

import javax.sound.midi.Soundbank;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/4 9:57
 */
public class Earth {

    private String desc;



    public Earth() {
        System.out.println("construct non params");
    }

    public Earth(String desc) {
        this.desc = desc;
        System.out.println("construct with params "+ desc);
    }

    public void init(){
        System.out.println("earth init");
    }

    public void destroy(){
        System.out.println("earth destroy");
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
