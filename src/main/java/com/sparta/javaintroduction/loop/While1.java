package com.sparta.javaintroduction.loop;

public class While1 {

    public static void main(String[] args) {

        int count = 0;

        count = count + 1;
        System.out.println("count = " + count);

        count++;
        System.out.println("count = " + count);
        
        count = 0;
        
        while (count < 3) {
            //count = count + 1;
            count++;
            System.out.println("count = " + count);
        }
    }
}
