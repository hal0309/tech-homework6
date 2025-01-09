package org.homework20250105.java.animal;

import org.homework20250105.java.animal.base.Animal;
import org.homework20250105.java.animal.base.ManyFeet;

public class Dog extends Animal implements ManyFeet {
    public Dog(String name, Integer age) {
        super(name, age, AnimalEnum.DOG);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }

    @Override
    public int getFeet() {
        return 4;
    }
}
