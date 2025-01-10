package org.homework20250105.java.animal.base;

public interface ManyFeet { // 2足より多い足を持つ動物で継承
    int getFeet();

    default void walk() {
        System.out.println(getFeet() + "足で歩きます");
    }
}
