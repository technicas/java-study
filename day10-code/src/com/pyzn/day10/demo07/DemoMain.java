package com.pyzn.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();

        Mouse mouse = new Mouse();
        computer.useDevice(mouse);

        computer.useDevice(new Keyboard());

        computer.close();
    }
}
