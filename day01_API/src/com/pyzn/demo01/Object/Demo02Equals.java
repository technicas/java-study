package com.pyzn.demo01.Object;

public class Demo02Equals {
    public static void main(String[] args) {
        Person s1 = new Person("张三", 20);
        Person s2 = new Person("张三", 20);
        System.out.println(s1.equals(s2));
    }
}
