package org.homework20241222.shop

// Shopの()の中に記載されている変数で変数宣言されている？
//　コンストラクタ作成しなくていい？
class Shop(private val name: String, private val items: Map<Item, Int>) {

    fun printItems() {
        println(name)
        items.forEach { (item: Item, count: Int) -> println(item.toString() + ": " + count + "個") }
    }

    companion object {
        fun builder(): ShopBuilder {
            return ShopBuilder()
        }
    }

}
