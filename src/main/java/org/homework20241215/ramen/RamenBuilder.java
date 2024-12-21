package org.homework20241215.ramen;


import org.homework20241215.shop.Item;
import org.homework20241215.shop.Shop;

import java.util.HashMap;
import java.util.Map;

public class RamenBuilder {

    private String name;
    private Integer ramenPrice;
    private Map<Topping, Integer> toppings = new HashMap<>();

    public RamenBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public RamenBuilder setRamenPrice(int price) {
        this.ramenPrice = price;
        return this;
    }

    public RamenBuilder addTopping(Topping topping, int price) {
        this.toppings.put(topping, price);
        return this;
    }

    public Ramen build() {
        return new Ramen(name, ramenPrice, toppings);
    }

}
