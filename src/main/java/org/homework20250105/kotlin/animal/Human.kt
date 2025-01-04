package org.homework20250105.kotlin.animal

class Human(name: String, age: Int?) : Animal(name, age, AnimalEnum.HUMAN) {
    override fun say() {
        println("Hello")
    }
}
