package com.pyzn_05;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(30);
        ts.add(15);
        ts.add(20);
        ts.add(25);

        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}
