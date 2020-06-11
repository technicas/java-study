package com.pyzn.day07.demo04;

import java.util.ArrayList;

/*
ArrayList常用方法
public boolean add(E e)
public E get(int index);
public E remove(int index);
public int size();

 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //向集合内添加元素add()
        list.add("张三");
        list.add("李四");
        list.add("王五");

        System.out.println(list);

        //获取元素
        String name = list.get(2);
        System.out.println(name);

        //删除元素
        String whoRemove = list.remove(2);
        System.out.println(list);

        //获取集合长度
        int size = list.size();
        System.out.println(size);
    }

}
