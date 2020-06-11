package com.pyzn.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
生成6个1-33之间的随机数字，添加到集合，并遍历集合
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int randomNum = random.nextInt(33) + 1;
            list.add(randomNum);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
