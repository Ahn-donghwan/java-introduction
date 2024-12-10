package com.sparta.javaintroduction.class1;

public class Class2 {

    public static void main(String[] args) {

        Student student1;
        student1 = new Student();       // x001 ( 참조값(주소) 저장 )
        student1.name = "Sujin";
        student1.age = 18;
        student1.grade = 90;

        Student student2;
        student2 = new Student();       // x002 ( 참조값(주소) 저장 )
        student2.name = "Minho";
        student2.age = 16;
        student2.grade = 80;
        
        Student[] students = new Student[2];
        
        students[0] = student1;
        students[1] = student2;

        for (Student s : students) {
            System.out.println(" name : " + s.name + "\n age : " + s.age + "\n grade : " + s.grade + "\n");
        }

    }
}
