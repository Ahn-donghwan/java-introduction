package com.sparta.javaintroduction.reference;

public class MethodChange1 {

    public static void main(String[] args) {

        // 기본형과 메서드 호출

        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changeMethod(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }

    static void changeMethod(int x) {
        x = 20;
    }
}
