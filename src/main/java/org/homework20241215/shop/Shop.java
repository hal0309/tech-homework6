package org.homework20241215.shop;


import java.util.Map;

public class Shop {

    public static ShopBuilder builder() {
        return new ShopBuilder();
    }

    private final String name;
    private Map<Item, Integer> items;

    public Shop(String name, Map<Item, Integer> items) {
        this.name = name;
        this.items = items;
    }

    public void printItems() {
        System.out.println("Shop: " + name);
        items.forEach((item, count) -> System.out.println(item + " - " + count));
    }
}
