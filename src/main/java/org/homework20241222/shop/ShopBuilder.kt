package org.homework20241222.shop

import java.util.*
import kotlin.collections.HashMap


class ShopBuilder {
    private var name: String = ""
    private val items: MutableMap<Item, Int> = mutableMapOf()

    fun setName(name: String): ShopBuilder {
        this.name = name
        return this
    }

    fun addItem(item: Item, count: Int): ShopBuilder {
        items[item] = count
        return this
    }

    fun build(): Shop {
        return Shop(name, items)
    }
}
