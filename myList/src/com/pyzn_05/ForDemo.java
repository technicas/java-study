package com.pyzn_05;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }

        String[] arrString = {"hello", "world", "java"};
        for (String str : arrString) {
            System.out.println(str);
        }

        List<String> lstr = new ArrayList<>();
        lstr.add("Hello");
        lstr.add("world");
        lstr.add("java");

        for (String ls : lstr) {
            System.out.println(ls);
        }
    }
}
