package com.pyzn.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;

        while(true) {
            System.out.println("请输入你猜测的数字：");
            Scanner scanner = new Scanner(System.in);

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
    }

}
