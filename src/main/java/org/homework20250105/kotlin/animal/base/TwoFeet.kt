package org.homework20250105.kotlin.animal.base


interface TwoFeet {

    fun getFeet(): Int = 2

    fun walk() {
        println("${getFeet()}足で歩きます")
    }
}
