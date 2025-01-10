package org.homework20250105.java.animal;

import org.homework20250105.java.animal.base.Animal;
import org.homework20250105.java.animal.base.TwoFeet;

public class Human extends Animal implements TwoFeet {

        public Human(String name, Integer age) {
        super(name, age, AnimalEnum.HUMAN);
    }

    @Override
    public void say() {
        System.out.println("Hello");
    }
}
