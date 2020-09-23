package com.pyzn_08;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
    编写一个程序，获取10个1-20之间的随机数，随机数不能重复，并在控制台输出
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建set集合对象
        Set<Integer> set = new HashSet<>();
        //创建随机数对象
        Random random = new Random();
        //判断随机数是否小于10个
            //如果是，则添加
        while (set.size() < 10) {
            int num = random.nextInt(20) + 1;
            set.add(num);
        }

        //循环输出
        for (int val : set) {
            System.out.println(val);
        }

    }
}
