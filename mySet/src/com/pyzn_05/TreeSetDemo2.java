package com.pyzn_05;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> s = new TreeSet<>();

        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);
        Student s5 = new Student("linqingxia", 33);
        Student s6 = new Student("linqingxia", 33);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        s.add(s6);

        for (Student student : s) {
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
