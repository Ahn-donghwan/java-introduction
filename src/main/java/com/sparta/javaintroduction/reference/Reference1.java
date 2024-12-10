package com.sparta.javaintroduction.reference;

public class Reference1 {

    public static void main(String[] args) {

        Data dataA = new Data();

        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 's reference value : " + dataA);    // dataA 's reference value : Data@3f99bd52
        System.out.println("dataB 's reference value : " + dataB);    // dataB 's reference value : Data@3f99bd52
        System.out.println("dataA.value : " + dataA.value);           // dataA.value : 10
        System.out.println("dataB.value : " + dataB.value);           // dataB.value : 10

        // dataA update
        dataA.value = 20;
        System.out.println("[FIX] dataA.value = 20");
        System.out.println("dataA.value : " + dataA.value);           // dataA.value : 20
        System.out.println("dataB.value : " + dataB.value);           // dataB.value : 20

        // dataB update
        dataB.value = 30;
        System.out.println("[FIX] dataB.value = 30");
        System.out.println("dataA.value : " + dataA.value);           // dataA.value : 30
        System.out.println("dataB.value : " + dataB.value);           // dataB.value : 30
    }
}
