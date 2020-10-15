package com.pyzn_06_HashMapIncludeArrayList;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapCharacterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine ();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < line.length(); i ++) {
            char key = line.charAt(i);

            Integer value = hm.get(key);

            if (value == null) {
                hm.put(key, 1);
            } else {
                value++;
                hm.put(key, value);
            }
        }

        //StringBuilder 一个可变的字符序列
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String s = sb.toString();
        System.out.println(s);

    }
}
