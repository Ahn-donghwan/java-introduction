package com.sparta.javaintroduction.poly.ex2;

public class AnimalSoundMain2 {

    public static void main(String[] args) {

        Animal[] animalArr = new Animal[]{new Dog(), new Cat(), new Cow()};

        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("animal sound test start");
        animal.sound();
        System.out.println("animal sound test end");
    }
}
