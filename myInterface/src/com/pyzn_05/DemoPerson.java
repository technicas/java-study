package com.pyzn_05;

public class DemoPerson {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer("邓亚萍", 30);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.study();
        ppp.speak();
        ppp.eat();

        System.out.println("========================");

        BasketballPlayer bp = new BasketballPlayer("姚明", 35);
        System.out.println(bp.getName() + ", " + bp.getAge());
        bp.study();
        bp.eat();

        System.out.println("========================");

        PingPangCoach ppc = new PingPangCoach("张三丰", 99);
        System.out.println(ppc.getName() + ", " + ppp.getAge());
        ppc.eat();
        ppc.speak();
        ppc.teach();
    }
}
