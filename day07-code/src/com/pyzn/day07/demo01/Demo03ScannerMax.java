package com.pyzn.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = scanner.nextInt();

        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();

        System.out.println("请输入第三个数字：");
        int c = scanner.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        System.out.println("输入的最大值是：" + max);
    }
}
