package com.pyzn_03_HashMapStudentDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 32);
        Student s3 = new Student("王祖贤", 28);

        students.put("id001", s1);
        students.put("id002", s2);
        students.put("id003", s3);

        //第一种方式，获取所有key，通过key遍历
        Set<String> keys = students.keySet();
        for (String key : keys) {
            Student s = students.get(key);
            System.out.println(key + "," + s.getName() + "," + s.getAge());
        }

        System.out.println("-----------");
        //第二种方法，获取所有键值对对象的集合
        Set<Map.Entry<String, Student>> entries = students.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            String key = entry.getKey();
            Student s = entry.getValue();
            System.out.println(key + "," + s.getName() + "," + s.getAge());
        }
    }
}
