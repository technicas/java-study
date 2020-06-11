package com.pyzn.day07.demo05;

import java.util.ArrayList;

//自定义4个学生对象，添加到集合，并遍历
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("张三", 20));
        students.add(new Student("李四", 23));
        students.add(new Student("王五", 28));
        students.add(new Student("赵六", 21));

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("姓名：" + student.getName() + "----" + "年龄：" + student.getAge());
        }
    }
}
