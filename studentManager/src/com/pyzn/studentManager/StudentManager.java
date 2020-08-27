package com.pyzn.studentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        //用输出语句输出程序主界面
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");

            System.out.println("请输入您的选择：");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        System.out.println("添加学生");

        Scanner scanner = new Scanner(System.in);
        String sid;

        while (true) {
            System.out.println("请输入学号：");
            sid = scanner.nextLine();

            boolean used = isUsed(array, sid);

            if (used) {
                System.out.println("该学号已经被占用，请重新输入！");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();

        System.out.println("请输入年龄：");
        String age = scanner.nextLine();

        System.out.println("请输入地址：");
        String address = scanner.nextLine();

        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        array.add(student);

        System.out.println("添加成功！");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("没有学生信息，请添加后再查询！");
            return;
        }
        System.out.println("所有的学生信息：");
        System.out.println("学号\t姓名\t\t\t年龄\t地址");
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getSid() + "\t" + student.getName() + "\t"
             + student.getAge() + "\t" + student.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("没有学生信息，请添加后再查询！");
            return;
        }
        System.out.println("删除学生");

        int index = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要删除学生的学号：");
        String sid = scanner.nextLine();

        for (int i = 0; i < array.size(); i++) {
            if (sid.equals(array.get(i).getSid())) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("没有找到学生信息，请检查学号后重试！");
        } else {
            array.remove(index);
            System.out.println("删除学生成功！");
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要修改学生的学号：");
        String sid = scanner.nextLine();

        System.out.println("请输入要修改学生的新姓名：");
        String name = scanner.nextLine();

        System.out.println("请输入要修改学生的新年龄：");
        String age = scanner.nextLine();

        System.out.println("请输入要修改学生的新地址：");
        String address = scanner.nextLine();

        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(student.getSid())) {
                array.set(i, student);
                System.out.println("修改学生信息成功！");
                break;
            }
        }
    }

    public static boolean isUsed(ArrayList<Student> students, String sid) {
        boolean flag = false;

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);

            if (student.getSid().equals(sid)){
                flag = true;
            }
        }

        return flag;
    }
}
