package com.pyzn_02;

import java.util.ArrayList;
import java.util.Collections;

/*
    需求：
        通过程序实现斗地主中的洗牌、发牌、看牌
    思路：
        1、创建一个牌盒，也就是定义一个集合对象，用ArrayList实现
        2、往牌盒里面装牌
        3、洗牌，也就是把牌打散，用Collections的shuffle()方法实现
        4、发牌，遍历集合，给三个玩家发牌
        5、看牌，三个玩家分别遍历自己的牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，也就是定义一个集合对象，用ArrayList实现
        ArrayList<String> array = new ArrayList<>();

        //往牌盒里面装牌
        /*
        ♠2...♠A
        ♣...
        ♥...
        ♦...
         */
        String[] colors = {"♠","♣","♥","♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                String s = color + number;
                array.add(s);
            }
        }
        array.add("大王");
        array.add("小王");

        //洗牌，也就是把牌打散，用Collections的shuffle()方法实现
        Collections.shuffle(array);

        //发牌，遍历集合，给三个玩家发牌
        ArrayList<String> player1Array = new ArrayList<>();
        ArrayList<String> player2Array = new ArrayList<>();
        ArrayList<String> player3Array = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();

        for (int i = 0; i < array.size(); i ++) {
            String poker = array.get(i);

            if ( i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                player1Array.add(poker);
            } else if (i % 3 == 1) {
                player2Array.add(poker);
            } else if (i % 3 == 2) {
                player3Array.add(poker);
            }
        }

        lookPoker("林青霞", player1Array);
        lookPoker("张曼玉", player2Array);
        lookPoker("张柏芝", player3Array);
        lookPoker("底牌", dpArray);

        //System.out.println(array);
    }

    /**
     * 看牌
     * @param name 姓名
     * @param array 所有的牌
     */
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
