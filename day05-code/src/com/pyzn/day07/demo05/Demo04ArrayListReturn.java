package com.pyzn.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            numList.add(r.nextInt());
        }

        System.out.println(getSmallList(numList));
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                smallList.add(list.get(i));
            }
        }
        return smallList;
    }
}
