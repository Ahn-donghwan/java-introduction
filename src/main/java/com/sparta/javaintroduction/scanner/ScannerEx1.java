package com.sparta.javaintroduction.scanner;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {

        /*
        예제 : 두 수를 입력받고 그 합을 출력하기
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number");
        int num1 = scanner.nextInt();

        System.out.println("Please input second number");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
}
