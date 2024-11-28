package com.sparta.javaintroduction.condition;

public class CondPractice1 {

    public static void main(String[] args) {

        /*
        문제 : " 학점 계산하기 "
        학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.

        - 90 점 이상 : " A "
        - 80 점 이상 90 점 미만 : " B "
        - 70 점 이상 80 점 미만 : " C "
        - 60 점 이상 70 점 미만 : " D "
        - 60 점 미만 : " F "
         */

        int score = 0;
        String grade = "";

        if(score >= 90) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        }
        System.out.println("grade = " + grade);
    }
}
