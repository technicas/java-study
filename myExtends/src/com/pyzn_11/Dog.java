package com.pyzn_11;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor() {
        System.out.println("我是一只狗，我会看门！");
    }
}
