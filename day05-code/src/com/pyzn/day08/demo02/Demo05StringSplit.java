package com.pyzn.day08.demo02;

/*
字符串分割方法
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,ddd";
        String[] strings = str1.split(",");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
