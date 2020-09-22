package com.quill.springdemo.dibean;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/22 9:34
 */
public class SpellChecker {

    private String serial;

    public SpellChecker() {
        System.out.println("SpellChecker# Inside SpellChecker constructor. spellChecker serial = "+serial );
    }

    public void spellChecking(){
        System.out.println("SpellChecker# Inside checkSpelling. spellChecker serial ="+serial);
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
