package org.homework20250105.java.animal;

public class Cat extends Animal {
    public Cat(String name, Integer age) {
        super(name, age, AnimalEnum.CAT);
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
