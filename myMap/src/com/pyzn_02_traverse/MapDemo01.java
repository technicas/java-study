package com.pyzn_02_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
集合的遍历(方式1)
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //1、获取所有的键的集合
        Set<String> keys = map.keySet();

        //2、遍历所有键的集合，取到每一个键
        for (String key : keys) {
            //3、根据键获取值
            String val = map.get(key);
            System.out.println(key + "," + val);
        }

        //3、根据键去找值
    }
}
