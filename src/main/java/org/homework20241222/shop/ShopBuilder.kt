package org.homework20241222.shop

class ShopBuilder {

    private var name: String? = null
    private var items: Map<Item, Int> = HashMap()

    fun setName(name: String): ShopBuilder {
        this.name = name
        return this
    }

    fun addItem(item: Item, count: Int): ShopBuilder {
        this.items += item to count
        return this
    }

    fun build(): Shop {
        return Shop(name.toString(), items)
    }

}
