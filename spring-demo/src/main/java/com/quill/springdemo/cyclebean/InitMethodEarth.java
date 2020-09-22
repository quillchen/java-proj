package com.quill.springdemo.cyclebean;

import javax.sound.midi.Soundbank;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/4 9:57
 */
public class InitMethodEarth {

    private String desc;



    public InitMethodEarth() {
        System.out.println("Earth# construct non params");
    }

    public InitMethodEarth(String desc) {
        this.desc = desc;
        System.out.println("Earth# construct with params "+ desc);
    }

    public void init(){
        System.out.println("Earth# earth init");
    }

    public void destroy(){
        System.out.println("Earth# earth destroy");
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        System.out.println("Earth# inject desc");
        this.desc = desc;
    }
}
