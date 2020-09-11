package com.pyzn_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("张三", 40);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 28);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
