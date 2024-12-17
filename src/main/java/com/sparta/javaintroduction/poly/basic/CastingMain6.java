package com.sparta.javaintroduction.poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("call parent1");
        call(parent1);

        Parent parent2 = new Parent();
        System.out.println("call parent2");
        call(parent2);
    }

    private static void call(Parent parent) {

        parent.parentMethod();

        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {

            System.out.println("instanceof Child : true");
            child.childMethod();
        }
    }
}
