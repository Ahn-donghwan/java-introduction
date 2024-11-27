package com.sparta.javaintroduction.condition;

public class If4 {

    public static void main(String[] args) {

        /**
         * If3 의 코드를 수정
         * else if 사용
         */

        int age = 14;

        if(age<=7) {
            System.out.println("미취학");
        } else if(age>=8 && age<=13) {
            System.out.println("초등학생");
        } else if(age>14 && age<=16) {
            System.out.println("중학생");
        } else if(age>=17 && age<=19) {
            System.out.println("고등학생");
        } else if(age>=20) {
            System.out.println("성인");
        }
    }
}
