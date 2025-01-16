package org.homework20250105.kotlin.animal.base;

import org.homework20250105.kotlin.animal.AnimalEnum;

    abstract class Animal(private var name: String, private var age: Int?, private var type: AnimalEnum){

    fun getName(): String {
        return name
    }

    fun getAge(): String{
        // 年齢が未指定(null)の場合は"???"を返す
        // 「 age?.let 」の条件式が書けない
        if(age == null) {
            return "???"
        }
        return age.toString()
    }

    fun getType() :AnimalEnum{
        return type
    }

    // kotlinではvoidは記載不要？
    abstract fun say()  // 鳴き声を出力する抽象メソッド
}


