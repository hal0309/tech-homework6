package org.homework20241222.ramen;

import org.homework20241222.ramen.RamenBuilder;
import org.homework20241222.ramen.Topping;
import org.homework20241222.shop.Item

import java.util.HashMap;

class Ramen(private val name: String, private val ramenPrice: Int, private val toppings: Map<Topping, Int>){
    companion object {
        fun builder(): RamenBuilder {
            return RamenBuilder();
        }
    }

    private var totalPrice:Int = 0;

    fun Ramen(name: String, ramenPrice: Int, toppings: Map<Topping, Int>) {
        totalPrice = ramenPrice
        toppings.forEach{(topping, price) -> totalPrice += price}
    }

    fun printRamenDetail() {
        println(name + "(" + totalPrice + "円)");
        println("トッピング");
        toppings.forEach{(topping, price) -> println(topping)}
    }


}
