package org.homework20250105.kotlin.animal

import org.homework20250105.kotlin.animal.base.Animal
import org.homework20250105.kotlin.animal.base.TwoFeet

class Human(name: String, age: Int?) : Animal(name, age, AnimalEnum.HUMAN), TwoFeet {
    override fun say() {
        println("Hello")
    }
}
