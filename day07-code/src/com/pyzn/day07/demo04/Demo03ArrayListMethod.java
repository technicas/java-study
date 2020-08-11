package com.pyzn.day07.demo04;

import java.util.ArrayList;

/*
ArrayList的常用方法有：

public boolean add(E e):向集合添加一个元素，元素的类型和泛型E一致，返回值是是否成功。
public E get(int index):从集合中取出一个元素，参数是索引值，索引从0开始，返回值是索引对应的元素
public E remove(int index):从集合中删除一个元素，参数是索引值，返回值是索引对应的元素
public int size():获取集合的长度，返回值是集合中包含的元素个数

 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加元素
        list.add("柳岩");
        System.out.println(list); //[柳岩]
        list.add("赵丽颖");
        list.add("李小璐");
        list.add("贾乃亮");
        list.add("赵又廷");
        System.out.println(list);

        //从集合中读取元素
        String name = list.get(2);
        System.out.printf("集合中第2个元素是：" + name);

        //从集合中删除元素
        String isRemoved = list.remove(2);
        System.out.println("被删除的元素是：" + isRemoved);
        System.out.println("集合的大小为：" + list.size());
        System.out.println("集合中的元素为：" + list);


    }
}
