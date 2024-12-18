package com.sparta.javaintroduction.poly.abstract1;


public class AbstractMain {

    public static void main(String[] args) {

        // 추상 클래스 생성 불가
        // AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound();
        cat.sound();
        cow.sound();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("animal sound test start");
        animal.sound();
        System.out.println("animal sound test end");
    }
}
