package com.sparta.javaintroduction.operator;

public class Comp2 {

    public static void main(String[] args) {

        String str1 = "문자열1";
        String str2 = "문자열1";

        boolean result1 = "hello".equals("hello");   // 리터럴 비교
        System.out.println("result1 = " + result1);
        
        boolean result2 = str1.equals("문자열1");     // 문자열 변수와 리터럴 비교
        System.out.println("result2 = " + result2);
        
        boolean result3 = str1.equals(str2);         // 문자열 변수 비교
        System.out.println("result3 = " + result3);

    }
}