package com.pyzn.day04.demo03;
/*
求数组的最大值
 */
public class Demo01ArrayMax {
    public static void main(String[] args) {
        int[] array = {1,10,5,8,9,20,18};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
