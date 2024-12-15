package org.homework20241215.shop;


import java.util.HashMap;
import java.util.Map;

public class ShopBuilder {

    private String name;
    private Map<Item, Integer> items = new HashMap<>();

    public ShopBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ShopBuilder addItem(Item item, int count) {
        this.items.put(item, count);
        return this;
    }

    public Shop build() {
        return new Shop(name, items);
    }

}
