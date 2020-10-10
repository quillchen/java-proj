package com.quill.springdemo.p3.dibean;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/22 9:34
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.spellChecking();
    }
}
