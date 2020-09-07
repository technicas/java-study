package com.pyzn_02;

import java.util.Arrays;

/*
    Arrays 包含用来操作数组（比如排序和搜索）的各种方法。此类还包含一个允许将数组作为列表来查看的静态工厂。

    public static String toString(int[] a) 返回指定数组内容的字符串表示形式
    public static void sort(int[] a) 对指定的 int 型数组按数字升序进行排序
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10,50,30,80,40,60};

        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
