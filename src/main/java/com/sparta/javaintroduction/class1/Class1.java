package com.sparta.javaintroduction.class1;

public class Class1 {

    public static void main(String[] args) {

        Student student1;
        student1 = new Student();       // x001 ( 참조값(주소) 저장 )
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2;
        student2 = new Student();       // x002 ( 참조값(주소) 저장 )
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);
    }
}
