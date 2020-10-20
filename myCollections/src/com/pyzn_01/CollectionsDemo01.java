package com.pyzn_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);

        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);

        System.out.println(list);
    }
}
