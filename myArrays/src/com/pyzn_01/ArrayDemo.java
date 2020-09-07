package com.pyzn_01;

/*
冒泡排序：每次两个值进行比较，小的值放前面，大的值放后面
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {10,50,30,80,40,60};

        for (int x = 0; x < arr.length - 1; x++) {
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }



        System.out.println(arrayToString(arr));

    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
