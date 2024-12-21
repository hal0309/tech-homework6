package org.homework20241222

import org.homework20241222.shop.Item
import org.homework20241222.shop.Shop

fun main() {
    println("Hello, World!")

    val yaoyaShop = Shop.builder()
        .setName("ヤオヤ")
        .addItem(Item.ORANGE, 3)
        .addItem(Item.BANANA, 1)
        .build()

    yaoyaShop.printItems()

    val lifeShop = Shop.builder()
        .setName("LIFE")
        .addItem(Item.POTATO, 1)
        .addItem(Item.CARROT, 2)
        .addItem(Item.TOMATO, 3)
        .build()

    lifeShop.printItems()
}
