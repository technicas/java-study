package com.pyzn_06_HashMapIncludeArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> array1 = new ArrayList<>();
        array1.add("诸葛亮");
        array1.add("赵云");
        hm.put("三国演义", array1);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("唐僧");
        array2.add("孙悟空");
        hm.put("西游记", array2);

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("武松");
        array3.add("鲁志深");
        hm.put("水浒传", array3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> map : entries) {
            String bookName = map.getKey();
            System.out.println(bookName + ":");
            ArrayList<String> people = map.getValue();
            for (String p : people) {
                System.out.println("\t" + p);
            }

        }
    }
}
