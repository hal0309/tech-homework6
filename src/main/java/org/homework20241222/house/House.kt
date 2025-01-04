package org.homework20241222.house;

import org.homework20241222.house.HouseBuilder;
import org.homework20241222.shop.Item

class House(private val address: String, private val floors: Int, private val floorMaterial: String, private val wallMaterial: String) {

    //companion object {}で囲うとbuilderが使用可能になる
    companion object {
        fun builder(): HouseBuilder {
            return HouseBuilder();
        }
    }

//    private var address: String ?= null
//    // Integer宣言できない
//    private var floors: Int ?=null
//    private var floorMaterial: String ?= null
//    private var wallMaterial: String ?= null

//    fun House(address: String, floors: Int, floorMaterial: String, wallMaterial: String) {
//        this.address = address;
//        this.floors = floors;
//        this.floorMaterial = floorMaterial;
//        this.wallMaterial = wallMaterial;
//    }

    fun printHouseDetail() {
        println(address + "の家")
        if(floors != null) {
            println("階数:" + floors)
        }
        if(floorMaterial != null) {
            println("床材:" + floorMaterial)
        }
        if(wallMaterial != null) {
            println("壁材:" + wallMaterial)
        }
    }
}