package com.sparta.javaintroduction.loop;

public class LoopEx4 {

    public static void main(String[] args) {

        /*
        문제 : 구구단 출력
        중첩 for 문을 사용해서 구구단을 완성해라.
         */

        for (int x = 1; x <= 9; x++) {
            System.out.println(x + "th");
            System.out.println("-------------------------------------");
            for (int y = 1; y <= 9; y++) {
                System.out.println(x + " * " + y + " = " + x * y);
            }
            System.out.println("-------------------------------------");
        }
    }
}
