package org.homework20241222.ramen

class Ramen(private val name: String, val ramenPrice: Int, private val toppings: Map<Topping, Int>){
    companion object {
        fun builder(): RamenBuilder {
            return RamenBuilder()
        }
    }

    private var totalPrice: Int = 0;

    fun printRamenDetail(ramenPrice: Int) {
        totalPrice = ramenPrice
        toppings.forEach{(topping, price) -> totalPrice += price}
        println(name + "(" + totalPrice + "円)")
        println("トッピング")
        toppings.forEach{(topping, price) -> println(topping)}
    }


}
