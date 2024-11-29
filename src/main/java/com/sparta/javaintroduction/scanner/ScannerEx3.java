package com.sparta.javaintroduction.scanner;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {

        /*
        사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어 보자.
        exit 라는 문자가 입력되면 프로그램을 종료한다.
        프로그램은 반복해서 실행된다.
         */

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Input any String");
            String str1 = scanner.nextLine();

            if(str1.equals("exit")) {
                System.out.println("Will you exit?");
                String str2 = scanner.nextLine();
                if(str2.equals("yes") || str2.equals("ok")) {
                    System.out.println("Exit Program. GoodBye :) ");
                    break;
                }
            }
        }
    }
}
