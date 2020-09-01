package com.pyzn_11;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println("我是一只猫，我会抓老鼠！");
    }
}
