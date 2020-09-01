package com.pyzn_11;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪", 1);
        cat.catchMouse();

        Dog dog = new Dog("佩奇", 2);
        dog.lookDoor();
    }
}
