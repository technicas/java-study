package com.pyzn_10;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("我是学生，学习使我快乐！");
    }
}
