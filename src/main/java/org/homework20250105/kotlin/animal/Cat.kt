package org.homework20250105.kotlin.animal

class Cat(name: String, age: Int?) : Animal(name, age, AnimalEnum.CAT) {
    override fun say() {
        println("Meow")
    }
}
