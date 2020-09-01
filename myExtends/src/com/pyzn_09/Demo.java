package com.pyzn_09;

public class Demo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三丰", 100);
        System.out.println(teacher.getName() + ", " + teacher.getAge());
        teacher.teach();

        Student student = new Student("杨过", 17);
        System.out.println(student.getName() + ", " + student.getAge());
        student.study();
    }
}
