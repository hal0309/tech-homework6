package org.homework20250105.kotlin.animal.base


interface ManyFeet {

    fun getFeet(): Int

    fun walk() {
        println("${getFeet()}足で歩きます")
    }
}
