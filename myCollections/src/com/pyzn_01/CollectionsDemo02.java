package com.pyzn_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
用ArrayList存储学生对象，使用Collections对ArrayList进行排序
要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("zhangsan", 25);
        Student s2 = new Student("lisi",25);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("zhaoliu", 19);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

                return num2;
            }
        });

        System.out.println(array);
    }
}
