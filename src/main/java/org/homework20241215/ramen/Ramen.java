package org.homework20241215.ramen;

import java.util.HashMap;
import java.util.Map;

public class Ramen {

    public static RamenBuilder builder() {
        return new RamenBuilder();
    }

    private final String name;
    private final Integer ramenPrice;
    private Map<Topping, Integer> toppings = new HashMap<>();

    private int totalPrice = 0;

    public Ramen(String name, int ramenPrice, Map<Topping, Integer> toppings) {
        this.name = name;
        this.ramenPrice = ramenPrice;
        this.toppings = toppings;

        totalPrice = ramenPrice;
        toppings.forEach((topping, price) -> totalPrice += price);

    }

    public void printRamenDetail() {
        System.out.println(name + "(" + totalPrice + "円)");
        System.out.println("トッピング");
        toppings.forEach((topping, price) -> System.out.println(topping));
    }


}
