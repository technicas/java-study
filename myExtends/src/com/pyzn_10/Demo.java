package com.pyzn_10;

public class Demo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("风清扬", 60);
        System.out.println(teacher.getName() + ", " + teacher.getAge());
        teacher.teach();

        Student student = new Student("令狐冲", 23);
        System.out.println(student.getName() + ", " + student.getAge());
        student.study();
    }
}
