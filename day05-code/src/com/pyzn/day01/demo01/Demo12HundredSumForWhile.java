package com.pyzn.day01.demo01;

public class Demo12HundredSumForWhile {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i ++;
        }

        System.out.println("结果是：" + sum);
    }
}
