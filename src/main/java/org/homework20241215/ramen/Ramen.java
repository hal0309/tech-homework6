package org.homework20241215.ramen;


import org.homework20241215.shop.Item;
import org.homework20241215.shop.ShopBuilder;

import java.util.Map;

public class Ramen {

    public static RamenBuilder builder() {
        return new RamenBuilder();
    }

    private final String name;

    private final Integer ramenPrice;

    private Map<Topping, Integer> toppings;

    private int totalPrice;

    public Ramen(String name,Integer ramenPrice, Map<Topping, Integer> toppings) {
        this.name = name;
        this.ramenPrice = ramenPrice;
        this.toppings = toppings;

        totalPrice = ramenPrice;
        for(int price: toppings.values()){
            totalPrice += price;
        }
//        toppings.values().forEach(price ->
//                totalPrice += price
//        );
    }

    public void printRamenDetail() {

        System.out.println(name + "(" + totalPrice + "円" + ")");
        System.out.println("トッピング:");
        toppings.forEach((topping, count) -> System.out.println("- " + topping + ": " + count));
    }
}
