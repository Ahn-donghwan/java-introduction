package com.sparta.javaintroduction.scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        /*
        예제 :
        사용자로 부터 2개의 정수를 입력 받고,
        더 큰 수를 출력하는 프로그램을 작성해보자.
        두 숫자가 같은 경우 두 숫자는 같다고 출력하면 된다.

        조건문을 사용해서 처리할 수 있다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number");
        int num1 = scanner.nextInt();

        System.out.println("Please input second number");
        int num2 = scanner.nextInt();

        int max = 0;

        if (num1 > num2) {
            max = num1;
            System.out.println("max is " + max);
        } else if (num2 > num1) {
            max = num2;
            System.out.println("max is " + max);
        } else {
            max = num1;
            System.out.println("max is " + max + " (same)");
        }
    }
}
