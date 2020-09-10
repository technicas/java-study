package com.pyzn_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();

        Student s1 = new Student("张三", 20);
        students.add(s1);
        Student s2 = new Student("李四", 30);
        students.add(s2);
        Student s3 = new Student("王五", 28);
        students.add(s3);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
