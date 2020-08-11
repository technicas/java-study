package com.pyzn.day07.demo05;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("张三",20));
        students.add(new Student("李四", 30));
        students.add(new Student("王五", 35));
        students.add(new Student("赵六", 25));

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).name);
        }
    }
}
