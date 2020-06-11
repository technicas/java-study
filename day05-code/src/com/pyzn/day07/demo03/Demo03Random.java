package com.pyzn.day07.demo03;

import java.util.Random;

/*
根据int变量n的值，来获取随机数，范围是[1,n]
 */
public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(n) + 1;
            System.out.println(num);
        }

    }
}
