package com.sparta.javaintroduction.poly.ex2;

public class AnimalSoundMain1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("animal sound test start");
        animal.sound();
        System.out.println("animal sound test end");
    }
}
