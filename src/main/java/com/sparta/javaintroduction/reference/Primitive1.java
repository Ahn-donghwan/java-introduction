package com.sparta.javaintroduction.reference;

public class Primitive1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("------------");

        // a 변경
        a = 20;
        System.out.println("a is changed 10 to 20 ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("------------");

        // b 변경
        b = 30;
        System.out.println("b is changed 20 to 30 ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("------------");
    }
}
