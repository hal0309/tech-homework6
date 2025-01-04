package org.homework20250105.java.animal;

public class Human extends Animal {
    public Human(String name, Integer age) {
        super(name, age, AnimalEnum.HUMAN);
    }

    @Override
    public void say() {
        System.out.println("Hello");
    }
}
