package com.sparta.javaintroduction.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input String : ");
        String str = scanner.nextLine();
        System.out.println("String : " + str);

        System.out.println("Input int : ");
        int intValue = scanner.nextInt();
        System.out.println("int : " + intValue);

        System.out.println("Input double : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("double : " + doubleValue);
    }
}
