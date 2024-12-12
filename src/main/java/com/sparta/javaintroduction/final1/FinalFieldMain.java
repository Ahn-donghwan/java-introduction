package com.sparta.javaintroduction.final1;

public class FinalFieldMain {

    public static void main(String[] args) {

        // final 필드 - 생성자 초기화
        System.out.println("Construct Init");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1);
        System.out.println(constructInit2);

        // final 필드 - 필드 초기화
        System.out.println("Field Init");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println("constant");
        System.out.println(fieldInit1.CONST_VALUE);

    }
}
