package org.homework20241222.ramen


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
        // mapに値を追加
        this.toppings += topping to price
        return this
    }

    fun build(): Ramen {
        return Ramen(name.toString(), ramenPrice.hashCode(), toppings)
    }
}

