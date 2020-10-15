package com.pyzn_04_HashMapStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 32);
        Student s3 = new Student("王祖贤", 28);
        Student s4 = new Student("王祖贤", 28);

        hm.put(s1, "河南");
        hm.put(s2, "北京");
        hm.put(s3, "上海");
        hm.put(s4, "上海");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student s = entry.getKey();
            String address = entry.getValue();
            System.out.println(s.getName() + "," + s.getAge() + "," + address);
        }
    }
}
