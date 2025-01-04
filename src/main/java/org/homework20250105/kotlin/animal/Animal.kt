package org.homework20250105.kotlin.animal

abstract class Animal(// 名前
    val name: String, // 年齢
    private val age: Int?, // 動物の種類
    val type: AnimalEnum
) {
    fun getAge(): String {
        // 年齢が未指定(null)の場合は"???"を返す
        return age?.toString() ?: "???"
    }

    abstract fun say() // 鳴き声を出力する抽象メソッド
}

