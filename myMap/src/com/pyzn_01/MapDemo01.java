package com.pyzn_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        /*
        public interface Map<K,V>将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
         */
        Map<String, String> map = new HashMap<>();

        /*
        put(K key, V value)
          将指定的值与此映射中的指定键关联（可选操作）。
         */
        map.put("001", "林青霞");
        map.put("002", "张曼玉");
        map.put("003", "王祖贤");
        System.out.println(map);
    }
}
