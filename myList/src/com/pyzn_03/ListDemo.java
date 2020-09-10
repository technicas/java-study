package com.pyzn_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
集合中有3个元素，hello、world、java。对其进行遍历，看看有没有world元素，如果有的话，就添加一个javaee进去
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("Hello");
        s.add("world");
        s.add("java");

        Iterator<String> iterator = s.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()){
            String val = iterator.next();
            if (val.equals("world")) {
                s.add("javaee");
            }
            System.out.println(val);
        }
//
//        for (int i = 0; i < s.size(); i++) {
//            String val = s.get(i);
//            if (val.equals("world")) {
//                s.add("javaee");
//            }
//
//            System.out.println(val);
//        }
    }
}
