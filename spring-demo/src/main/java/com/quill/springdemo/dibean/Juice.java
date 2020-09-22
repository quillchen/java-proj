package com.quill.springdemo.dibean;

import javax.sound.midi.Soundbank;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/22 10:12
 */
public class Juice implements Drink {

    @Override
    public void drink() {
        System.out.println("Juice# drink juice");
    }
}
