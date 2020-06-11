package com.pyzn.day07.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("张三");
        System.out.println(list);
        list.add("李四");
        list.add("王五");
        System.out.println(list);
    }
}
