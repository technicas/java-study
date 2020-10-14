package com.pyzn_01;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合的基本功能
    V put(K key, V value)
          将指定的值与此映射中的指定键关联（可选操作）。
    V remove(Object key)
          如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
    boolean isEmpty()
          如果此映射未包含键-值映射关系，则返回 true。
    void clear()
          从此映射中移除所有映射关系（可选操作）。
    boolean containsKey(Object key)
          如果此映射包含指定键的映射关系，则返回 true。
    boolean containsValue(Object value)
          如果此映射将一个或多个键映射到指定值，则返回 true。
    int size()
          返回此映射中的键-值映射关系数。
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //V put(K key, V value)
        //          将指定的值与此映射中的指定键关联（可选操作）。
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //V remove(Object key)
        //          如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
//        System.out.println(map.remove("郭靖"));
//        System.out.println(map.remove("郭襄"));



        System.out.println(map);
    }
}
