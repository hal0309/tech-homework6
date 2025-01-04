package org.homework20250105.kotlin.animal

class Dog(name: String, age: Int?) : Animal(name, age, AnimalEnum.DOG) {
    override fun say() {
        println("Woof")
    }
}
