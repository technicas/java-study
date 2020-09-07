package com.pyzn_03;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        String[] arr = s.split(" ");
        int[] arrInt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arrInt);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrInt.length; i++) {
            if (i == arrInt.length - 1) {
                stringBuilder.append(arrInt[i]);
            } else {
                stringBuilder.append(arrInt[i] + " ");
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
