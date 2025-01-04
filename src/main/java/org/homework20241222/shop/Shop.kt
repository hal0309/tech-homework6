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

//class Shop {
//    constructor(name: String?, items: Map<Item, Int>)
//
//    fun builder() :ShopBuilder{
//        return ShopBuilder()
//    }
//
//    private var name:String? = null
//    private var items:Map<Item, Int>  = mutableMapOf()
//
//    fun Shop(name:String, items:Map<Item, Int>) {
//        this.name = name
//        this.items = items
//    }
//
//    fun printItems() {
//        System.out.println(name);
//        items.forEach{ (item, count) -> println(item.toString()+ ": " + count + "個")}
//    }
//}
