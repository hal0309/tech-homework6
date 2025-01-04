package org.homework20250105.java.animal;

public class Dog extends Animal {
    public Dog(String name, Integer age) {
        super(name, age, AnimalEnum.DOG);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }
}
