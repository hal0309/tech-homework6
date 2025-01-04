package org.homework20241222.house

class HouseBuilder {

    private var address: String ?= null
    // Integer宣言できない
    private var floors: Int ?=null
    private var floorMaterial: String ?= null
    private var wallMaterial: String ?= null

    fun setAddress(address:String) :HouseBuilder {
        this.address = address;
        return this;
    }

    fun setFloors(floors:Int) :HouseBuilder {
        this.floors = floors
        return this
    }

    fun setFloorMaterial(floorMaterial:String) :HouseBuilder {
        this.floorMaterial = floorMaterial
        return this
    }

    fun setWallMaterial(wallMaterial:String):HouseBuilder {
        this.wallMaterial = wallMaterial
        return this
    }

    fun build() :House{
        if (address == null) {
            throw IllegalStateException("addressが未設定です");
        }
        //なぜか「.toString」と書かないとエラーになる
        return House(address.toString(), floors.hashCode(), floorMaterial.toString(), wallMaterial.toString())
    }
}