package org.homework20241222.ramen

import org.homework20241222.shop.Item
import org.homework20241222.shop.Shop


class RamenBuilder {
    private var name: String? = null
    private var ramenPrice: Int? = null
    private val toppings: MutableMap<Topping, Int> = HashMap()
    fun setName(name: String?): RamenBuilder {
        this.name = name
        return this
    }

    fun setRamenPrice(price: Int): RamenBuilder {
        this.ramenPrice = price
        return this
    }

    fun addTopping(topping:Topping, price: Int): RamenBuilder {
        this.toppings += topping to price
        return this
    }


    fun build(): Ramen {
        return Ramen(name.toString(), ramenPrice.hashCode(), toppings)
    }
}

