package com.pyzn.day01.demo01;

public class Demo12HundredSumForDoWhile {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i ++;
        }while (i <= 100);

        System.out.println("结果是：" + sum);
    }
}
