package org.homework20250105.java;

import org.homework20250105.java.animal.*;
import org.homework20250105.java.animal.base.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Pochi", 5);
        Cat cat = new Cat("Tama", 3);
        Human human = new Human("Takeshi", null);

        System.out.println(dog.getName() + " (" + dog.getType() + ", " + dog.getAge() + ")");
        dog.say();
        dog.walk();

        System.out.println(cat.getName() + " (" + cat.getType() + ", " + cat.getAge() + ")");
        cat.say();
        cat.walk();

        System.out.println(human.getName() + " (" + human.getType() + ", " + human.getAge() + ")");
        human.say();
        human.walk();

        // 各10匹の動物を入れたリスト作成
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            animals.add(new Dog("Pochi" + i, i));
            animals.add(new Cat("Tama" + i, i));
            animals.add(new Human("Takeshi" + i, i));
        }

        // 3歳以下の動物だけ表示
        System.out.println("\n---3歳以下の動物たち---");
        animals.stream()
                .filter(animal -> Integer.parseInt(animal.getAge()) <= 3)
                .forEach(animal ->
                        System.out.println(animal.getName() + " (" + animal.getType() + ", " + animal.getAge() + ")")
                );


        // 5歳以上の人間だけ表示
        System.out.println("\n---5歳以上の人間たち---");
        animals.stream()
                .filter(animal -> animal.getType() == AnimalEnum.HUMAN)
                .filter(animal -> Integer.parseInt(animal.getAge()) >= 5)
                .forEach(animal ->
                        System.out.println(animal.getName() + " (" + animal.getType() + ", " + animal.getAge() + ")")
                );
    }
}
