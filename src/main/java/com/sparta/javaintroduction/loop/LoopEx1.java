package com.sparta.javaintroduction.loop;

public class LoopEx1 {

    public static void main(String[] args) {

        /*
        문제 : 자연수 출력

        처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이 때, count 라는 변수를 사용해야 합니다.
        while 문, for 문 2가지 버전의 정답을 만들어야 합니다.
         */

        int count = 1;

        // for 문
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        // while 문
        while (count <= 10) {
            System.out.println("count = " + count);
            count++;                                    //  System.out.println("count = " + count++); 로 해도 됨
        }
    }
}
