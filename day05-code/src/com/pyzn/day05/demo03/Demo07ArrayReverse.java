package com.pyzn.day05.demo03;

/*
数组元素的反转
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 5, 60};
        //遍历数组原来的内容
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("================");

        /*
        遍历数组反转后的内容
        初始化：min = 0, max = array.length - 1
        条件判断：min < max
        步进表达式：min ++, max --
         */
        for (int min = 0, max = array.length - 1; min < max; min ++, max --) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int value : array) {
            System.out.println(value);
        }
    }
}
