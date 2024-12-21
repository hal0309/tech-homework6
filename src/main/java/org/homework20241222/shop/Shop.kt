package org.homework20241222.shop

class Shop(private val name: String, private val items: Map<Item, Int>) {
    fun printItems() {
        println(name)
        items.forEach { (item, count) ->
            println("${item}: ${count}個")
        }
    }

    companion object {
        fun builder(): ShopBuilder {
            return ShopBuilder()
        }
    }
}

