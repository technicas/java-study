package com.pyzn.day07.demo01;

import java.util.Scanner;
/*
求从键盘输入的两个数字之各
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = scanner.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = scanner.nextInt();

        System.out.println("输入的两个数字和是：" + num1 + num2);

    }
}
