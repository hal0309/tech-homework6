package org.homework20241215;

import org.homework20241215.house.House;
import org.homework20241215.ramen.Ramen;
import org.homework20241215.ramen.Topping;
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

        Shop lifeShop = Shop.builder()
                .setName("LIFE")
                .addItem(Item.POTATO, 1)
                .addItem(Item.CARROT, 2)
                .addItem(Item.TOMATO, 3)
                .build();

        lifeShop.printItems();

        Ramen ramenShop = Ramen.builder()
                .setName("二郎")
                .setRamenPrice(800)
                .addTopping(Topping.NIKU, 100)
                .addTopping(Topping.NEGI, 200)
                .build();

        ramenShop.printRamenDetail();

        House house = House.builder()
                .setAddress("港区")
                .setFloors(5)
                .setFloorMaterial("フローリング")
                .setWallMaterial("レンガ")
                .build();

        house.printHouseDetail();

        try {
            House house2 = House.builder().build();  // address未指定のため例外が発生

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());

        }
    }
}