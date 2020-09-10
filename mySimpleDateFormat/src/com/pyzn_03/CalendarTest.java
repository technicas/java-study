package com.pyzn_03;

import java.util.Calendar;
import java.util.Scanner;

/*
获取任意一年的二月有多少天
 */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入任意年份：");
        int year = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 2, 1);
        calendar.add(Calendar.DATE, -1);

        System.out.println(calendar.get(Calendar.DATE));

    }
}
