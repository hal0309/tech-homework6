package org.homework20250105.kotlin.animal.base;

interface ManyFeet { // 2足より多い足を持つ動物で継承
    fun getFeet(): Int

    fun walk()  {
        println(getFeet().toString() + "足で歩きます");
    }
}