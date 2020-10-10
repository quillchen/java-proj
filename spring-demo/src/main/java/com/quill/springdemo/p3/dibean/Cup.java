package com.quill.springdemo.p3.dibean;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/22 10:09
 */
public class Cup {

    private Drink drink;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        System.out.println("Cup# setDrink "+drink);
        this.drink = drink;
    }

    public void drink(){
        System.out.println("Cup# invoke drink");
        drink.drink();
    }

}
