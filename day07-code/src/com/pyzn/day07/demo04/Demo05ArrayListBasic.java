package com.pyzn.day07.demo04;

import java.util.ArrayList;

/*
集合ArrayList中只能存储引用类型，如果想在其中存储基本类型，必须使用基本类型的包装类

基本类型    包装类（引用类型，包装类都位于java.lang下）
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean

自动装箱：基本类型-》包装类型
自动拆箱：包装类型-》基本类型
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);

        System.out.println(list);
    }
}
