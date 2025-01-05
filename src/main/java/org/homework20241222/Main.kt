package org.homework20241222

import org.homework20241222.house.House
import org.homework20241222.ramen.Ramen
import org.homework20241222.ramen.Topping
import org.homework20241222.shop.Item
import org.homework20241222.shop.Shop

fun main() {

    var yaoyaShop = Shop.builder()
            .setName("コトリン八百屋")
            .addItem(Item.ORANGE, 3)
            .addItem(Item.BANANA, 1)
            .build()

    yaoyaShop.printItems()

    var lifeShop = Shop.builder()
            .setName("コトリンLIFE")
            .addItem(Item.POTATO, 1)
            .addItem(Item.CARROT, 2)
            .addItem(Item.TOMATO, 3)
            .build()

    lifeShop.printItems()

    // 値段が表示されない
    var ramenShop = Ramen.builder()
            .setName("コトリン二郎")
            .setRamenPrice(800)
            .addTopping(Topping.NIKU, 100)
            .addTopping(Topping.NEGI, 200)
            .build();

    ramenShop.printRamenDetail(ramenShop.ramenPrice);

    var house = House.builder()
            .setAddress("コトリン港区")
            .setFloors(5)
            .setFloorMaterial("フローリング")
            .setWallMaterial("レンガ")
            .build()

    house.printHouseDetail()

    val house2 = org.homework20241215.house.House.builder()
            .setAddress("コトリン港")
            .build()

    house2.printHouseDetail()

    try {
        var house2 = House.builder().build();  // address未指定のため例外が発生
    } catch (e: IllegalStateException ) {
        println(e.message);
    }
    println("Hello, World!")
}
