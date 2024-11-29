package com.sparta.javaintroduction.loop;

public class Nested1 {

    public static void main(String[] args) {

        // 중첩 반복문
        // for 문 안의 for 문
        for (int i = 0; i < 2; i++) {
            System.out.println("external for-loop start i : " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> internal for-loop for " + i + " - " + j);
            }
            System.out.println("external for-loop for finished i : " + i);
            System.out.println();
        }
    }
}
