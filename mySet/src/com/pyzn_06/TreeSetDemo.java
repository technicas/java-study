package com.pyzn_06;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> s = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int ageNum = s1.getAge() - s2.getAge();
                int num = ageNum == 0 ? s1.getName().compareTo(s2.getName()) : ageNum;
                return num;
            }
        });

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
