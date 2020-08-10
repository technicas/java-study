package com.pyzn.day07.demo03;

import java.util.Random;
import java.util.Scanner;
/*
用代码模拟猜数字游戏
 */
public class Demo03RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = scanner.nextInt();
            if (guessNum > randomNum) {
                System.out.println("太大了，请重试");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试");
            } else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
