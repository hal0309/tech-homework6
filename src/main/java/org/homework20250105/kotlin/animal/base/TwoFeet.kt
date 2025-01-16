package org.homework20250105.kotlin.animal.base;

interface TwoFeet { // 2足歩行動物で継承

    fun getFeet(): Int {
        return 2;
    }

    fun walk() {
        println(getFeet().toString() + "足で歩きます");
    }
}
