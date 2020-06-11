package com.pyzn.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();

        int max;
        max = a > b ? a: b;
        max = max > c ? max : c;

        System.out.println("最大数为：" + max);
    }
}

