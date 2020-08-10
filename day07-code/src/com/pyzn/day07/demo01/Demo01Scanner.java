package com.pyzn.day07.demo01;

import java.util.Scanner;
/*
通过Scanner类获取从键盘输入的内容

引用类的使用步骤：
1、导包
2、创建
3、使用
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println("输入的数字是：" + num);

        String str = scanner.next();
        System.out.println("输入的字符串是：" + str);

    }
}
