package org.homework20241215;

import org.homework20241215.shop.Item;
import org.homework20241215.shop.Shop;

public class Main {
    public static void main(String[] args) {

        Shop yaoyaShop = Shop.builder()
                .setName("ヤオヤ")
                .addItem(Item.ORANGE, 3)
                .addItem(Item.BANANA, 1)
                .build();

        yaoyaShop.printItems();

    }
}