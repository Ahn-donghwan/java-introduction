package com.sparta.javaintroduction.condition;

public class CondOp2 {

    public static void main(String[] args) {

        int age = 10;

        // 삼항 연산자
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age +"status = " + status);
    }
}
