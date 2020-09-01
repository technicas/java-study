package com.pyzn_05;

public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练，教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("我什么都能吃");
    }

    @Override
    public void speak() {
        System.out.println("我说英语！");
    }
}
