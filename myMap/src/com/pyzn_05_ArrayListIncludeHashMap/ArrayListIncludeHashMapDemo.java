package com.pyzn_05_ArrayListIncludeHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<>();

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("郭靖", "黄蓉");
        hm1.put("杨过", "小龙女");
        array.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("孙策", "大乔");
        hm2.put("周瑜", "小乔");
        array.add(hm2);

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        array.add(hm3);

        for (HashMap<String, String> hm : array) {
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry<String, String> mp : entries) {
                System.out.println(mp.getKey() + "," + mp.getValue());
            }
        }
    }
}
