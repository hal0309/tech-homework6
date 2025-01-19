package org.homework20250105.kotlin.animal

import org.homework20250105.kotlin.animal.base.Animal
import org.homework20250105.kotlin.animal.base.ManyFeet

class Dog(name: String, age: Int?) : Animal(name, age, AnimalEnum.DOG), ManyFeet {
    override fun say() {
        println("Woof")
    }

    override fun getFeet(): Int {
        return 4
    }
}
