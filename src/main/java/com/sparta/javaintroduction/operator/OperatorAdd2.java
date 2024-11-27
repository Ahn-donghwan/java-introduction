package com.sparta.javaintroduction.operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        // a 의 값을 먼저 증가시키고, 그 결과를 b 에 대입
        // 증감 연산 수행 후 대입 연산 수행
        b = ++a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 후위 증감 연산자 사용 예
        int c = 1;
        int d = 0;

        // c의 현재 값을 d에 먼저 대입하고, 그 후 c 값을 증가시킴
        // 대입 연산 수행 후 증감 연산 수행
        d = c++;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
