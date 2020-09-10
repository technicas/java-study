package com.pyzn_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Iterator迭代器的使用
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> s = new ArrayList<>();

        s.add("Hello");
        s.add("World");
        s.add("Java");

        Iterator<String> iterator = s.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
