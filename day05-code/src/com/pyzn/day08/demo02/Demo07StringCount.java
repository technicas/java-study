package com.pyzn.day08.demo02;

import java.util.Scanner;

/*
键盘输入一个字符串，并且统计其中各类字符出现的次数
种类有：大写字母、小写字母、数字、其他
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = scanner.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母出现的次数是：" + countUpper);
        System.out.println("小写字母出现的次数是：" + countLower);
        System.out.println("数字出现的次数是：" + countNumber);
        System.out.println("其它字母出现的次数是：" + countOther);
    }
}
