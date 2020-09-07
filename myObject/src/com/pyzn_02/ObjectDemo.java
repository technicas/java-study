package com.pyzn_02;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林清霞", 30);
        Student s2 = new Student("林清霞", 30);
        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
    }
}
