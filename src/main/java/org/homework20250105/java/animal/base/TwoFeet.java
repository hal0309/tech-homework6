package org.homework20250105.java.animal.base;

public interface TwoFeet { // 2足歩行動物で継承

    default int getFeet() {
        return 2;
    }

    default void walk() {
        System.out.println(getFeet() + "足で歩きます");
    }
}
