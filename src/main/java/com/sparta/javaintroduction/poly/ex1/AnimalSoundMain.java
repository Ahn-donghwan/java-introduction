package com.sparta.javaintroduction.poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("animal sound test start");
        dog.sound();
        System.out.println("animal sound test end");

        System.out.println("animal sound test start");
        cat.sound();
        System.out.println("animal sound test end");

        System.out.println("animal sound test start");
        cow.sound();
        System.out.println("animal sound test end");

    }
}
