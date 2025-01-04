package org.homework20250105.java.animal;

public abstract class Animal {
    private String name;
    private Integer age;
    private AnimalEnum type;

    public Animal(String name, Integer age, AnimalEnum type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        if (age == null) {
            return "???";
        }
        return age.toString();
    }

    public AnimalEnum getType() {
        return type;
    }

    public abstract void say();
}
