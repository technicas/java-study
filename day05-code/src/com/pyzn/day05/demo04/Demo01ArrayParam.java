package com.pyzn.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
