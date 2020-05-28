package com.pyzn.day06.demo02;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("打电话给" + who);
    }

    public void sendMessage(String who) {
        System.out.println("发短信给" + who);
    }
}
