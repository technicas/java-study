package com.pyzn.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(30);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());

        System.out.println("===================");

        Student stu2 = new Student(40, "李四");
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
    }
}
