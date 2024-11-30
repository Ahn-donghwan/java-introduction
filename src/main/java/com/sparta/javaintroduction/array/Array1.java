package com.sparta.javaintroduction.array;

public class Array1 {

    public static void main(String[] args) {

        int[] students = new int[5];  // students[0] [1] [2] [3] [4]

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // students.length == 5
        for (int i = 0; i < students.length ; i++) {
            System.out.println("student" + (i + 1) + "'s score : " + students[i]);
        }


    }
}
