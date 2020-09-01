package com.pyzn_05;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("我是篮球教练，我教篮球！");
    }

    @Override
    public void eat() {
        System.out.println("我想吃什么就可以吃什么！");
    }
}
