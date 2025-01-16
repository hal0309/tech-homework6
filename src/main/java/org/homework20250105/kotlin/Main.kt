package org.homework20250105.kotlin

import org.homework20250105.kotlin.animal.AnimalEnum
import org.homework20250105.kotlin.animal.Cat
import org.homework20250105.kotlin.animal.Dog
import org.homework20250105.kotlin.animal.Human
import org.homework20250105.kotlin.animal.base.Animal

fun main() {
    var dog = Dog("Pochi", 5)
    var cat = Cat("Tama", 3)
    var human = Human("Takeshi", null)

    println(dog.getName() + " (" + dog.getType() + ", " + dog.getAge() + ")")
    dog.say()
    dog.walk()

    println(cat.getName() + " (" + cat.getType() + ", " + cat.getAge() + ")")
    cat.say()
    cat.walk()

    println(human.getName() + " (" + human.getType() + ", " + human.getAge() + ")")
    human.say()
    human.walk()

    // 各10匹の動物を入れたリスト作成
    //  「var animals: ArrayList<Animal>」の書き方だとなぜかanimalsListにaddできない
    var animals = arrayListOf<Animal>()
    for(i in 0..9){
        animals.add(Dog("Pochi$i", i))
        animals.add(Cat("Tama$i", i))
        animals.add(Human("Takeshi$i", i))
    }

    println("\n---3歳以下の動物たち---");
    animals.filter {animal -> animal.getAge() != "???" && Integer.parseInt(animal.getAge()) <= 3}
            .forEach { animal ->
                println(animal.getName() + " (" + animal.getType() + ", " + animal.getAge() + ")")
            }

    // 5歳以上の人間だけ表示
    println("\n---5歳以上の人間たち---");
    animals.filter{animal -> animal.getType() == AnimalEnum.HUMAN}
    .filter{animal -> animal.getAge() != "???" && Integer.parseInt(animal.getAge()) >= 5}
    .forEach { animal ->
        println(animal.getName() + " (" + animal.getType() + ", " + animal.getAge() + ")")
    }
}
