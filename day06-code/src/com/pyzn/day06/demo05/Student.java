package com.pyzn.day06.demo05;
/*
一个标准的类包含以下四个部分：
1、所有的成员变量都要使用private关键字修饰
2、为每个成员变量编写一对Getter/Setter
3、编写一个无参数的构造方法
4、编写一个全参数的构造方法

这样标准的类也叫做Java Bean
 */
public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
