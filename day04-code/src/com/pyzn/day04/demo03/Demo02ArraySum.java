package com.pyzn.day04.demo03;

public class Demo02ArraySum {
    public static void main(String[] args) {
        int[] array = {1,10,5,8,9,20,18};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
