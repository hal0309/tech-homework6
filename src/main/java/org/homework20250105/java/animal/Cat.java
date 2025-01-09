package org.homework20250105.java.animal;

import org.homework20250105.java.animal.base.Animal;
import org.homework20250105.java.animal.base.ManyFeet;

public class Cat extends Animal implements ManyFeet {
    public Cat(String name, Integer age) {
        super(name, age, AnimalEnum.CAT);
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }

    @Override
    public int getFeet() {
        return 4;
    }
}
