package com.sparta.javaintroduction.method;

public class Method4Casting {

    public static void main(String[] args) {

        double number = 1.5;
//        printNumber(number);
        printNumber((int) number);
    }

    public static void printNumber(int number) {
        System.out.println("number : " + number);
    }
}
