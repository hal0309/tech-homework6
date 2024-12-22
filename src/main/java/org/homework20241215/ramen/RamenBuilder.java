package org.homework20241215.ramen;


import org.homework20241215.shop.Item;

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

    public RamenBuilder setRamenPrice(Integer ramenPrice) {
        this.ramenPrice = ramenPrice;
        return this;
    }

    public RamenBuilder addToppings(Topping topping, int toppingPrice) {
        this.toppings.put(topping, toppingPrice);
        return this;
    }

    public Ramen build() {
        return new Ramen(name, ramenPrice, toppings);
    }

}
