package org.example;

public class Main {
    public Main method1() {
        System.out.println("method 1");
        return this;
    }

    public Main method2() {
        System.out.println("method 2");
        return this;
    }

    public Main method3() {
        System.out.println("method 3");
        return this;
    }

    public static void main(String[] args) {
        new Main().method1().method2().method3();
    }
}