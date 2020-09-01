package com.pyzn_05;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("我是篮球运动员，我学篮球！");
    }

    @Override
    public void eat() {
        System.out.println("我要减脂，控制饮食！");
    }
}
