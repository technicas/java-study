package com.pyzn.day07.demo01;

import java.util.Scanner;
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int b = scanner.nextInt();
        System.out.println("两个数的和是：" + sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
