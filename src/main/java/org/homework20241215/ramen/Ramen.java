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

    public Ramen(String name,Integer ramenPrice, Map<Topping, Integer> toppings) {
        this.name = name;
        this.ramenPrice = ramenPrice;
        this.toppings = toppings;
    }

    public void printRamenDetail() {
        int sum =0;
        for(int price:toppings.values()){
            sum = sum + price;
        }
        int totalPrice = sum + ramenPrice;
        System.out.println(name + "(" + totalPrice + "円" + ")");
        System.out.println("トッピング:");
        toppings.forEach((topping, count) -> System.out.println("- " + topping + ": " + count));
    }
}