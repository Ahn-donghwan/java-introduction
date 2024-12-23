package com.sparta.javaintroduction.method;

public class Method3 {

    public static void main(String[] args) {

        int number = 5;
        System.out.println("1. changeNumber 호출 전, number : " + number);      // [1] number : 5
        number = changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number : " + number);      // [4] number : 5

    }

    public static int changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number : " + number);      // [2] number : 5
        number = number * 2;     // == num2 *= 2;
        System.out.println("3. changeNumber 변경 후, number : " + number);      // [3] number : 10
        return number;
    }
}
