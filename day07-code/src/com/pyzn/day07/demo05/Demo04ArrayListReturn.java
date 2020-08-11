package com.pyzn.day07.demo05;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt());
        }
        System.out.println(integers);
        System.out.println(getSmallList(integers));

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> nums) {
        ArrayList<Integer> small = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                small.add(nums.get(i));
            }
        }
        return small;
    }
}
