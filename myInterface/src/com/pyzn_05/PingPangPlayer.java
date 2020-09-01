package com.pyzn_05;

public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("我是乒乓球运动员");
    }

    @Override
    public void eat() {
        System.out.println("我什么都不能吃！");
    }

    @Override
    public void speak() {
        System.out.println("我说英语");
    }
}
