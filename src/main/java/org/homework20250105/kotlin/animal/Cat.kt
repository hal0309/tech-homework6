package org.homework20250105.kotlin.animal

import org.homework20250105.kotlin.animal.base.Animal
import org.homework20250105.kotlin.animal.base.ManyFeet

class Cat(name: String, age: Int?) : Animal(name, age, AnimalEnum.CAT), ManyFeet {
    override fun say() {
        println("Meow")
    }

    override fun getFeet(): Int = 4 // 省略記法(Intも省略可能) Dogでは非省略記法
}
