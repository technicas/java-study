package com.pyzn.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1-33之间的随机数字，添加到集合，并遍历集合。
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <=6; i ++) {
            nums.add(random.nextInt(33) + 1);
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println(nums);
    }

}
