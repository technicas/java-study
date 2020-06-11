package com.pyzn.day07.demo04;

public class Demo01ArrayObject {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("热巴", 30);
        Person two = new Person("娜扎", 25);
        Person three = new Person("扎哈", 28);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());
    }
}
