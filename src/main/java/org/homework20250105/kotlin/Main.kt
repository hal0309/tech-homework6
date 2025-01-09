package org.homework20250105.kotlin

import org.homework20250105.kotlin.animal.*
import org.homework20250105.kotlin.animal.base.Animal

fun main() {
    val dog = Dog("Pochi", 5)
    val cat = Cat("Tama", 3)
    val human = Human("Takeshi", null)

    println("${dog.name} (${dog.type}, ${dog.getAge()})")
    dog.say()
    dog.walk()

    println("${cat.name} (${cat.type}, ${cat.getAge()})")
    cat.say()
    cat.walk()

    println("${human.name} (${human.type}, ${human.getAge()})")
    human.say()
    human.walk()

    // 各10匹の動物を入れたリスト作成
    val animals = ArrayList<Animal>()
    for (i in 0..9) {
        animals.add(Dog("Pochi$i", i))
        animals.add(Cat("Tama$i", i))
        animals.add(Human("Takeshi$i", i))
    }

    // 3歳以下の動物だけ表示
    println("\n---3歳以下の動物たち---")
    animals.stream()
        .filter { animal: Animal -> animal.getAge().toInt() <= 3 }
        .forEach { animal: Animal -> println(animal.name + " (" + animal.type + ", " + animal.getAge() + ")") }

    // 5歳以上の人間だけ表示
    println("\n---5歳以上の人間たち---")
    animals.stream()
        .filter { animal: Animal -> animal.type == AnimalEnum.HUMAN }
        .filter { animal: Animal -> animal.getAge().toInt() >= 5 }
        .forEach { animal: Animal -> println(animal.name + " (" + animal.type + ", " + animal.getAge() + ")") }
}
