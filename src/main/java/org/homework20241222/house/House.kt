package org.homework20241222.house;

class House(private val address: String, private val floors: Int, private val floorMaterial: String, private val wallMaterial: String) {

    //companion object {}で囲うとbuilderが使用可能になる,Javaでいう所のstaticのようなもの?
    companion object {
        fun builder(): HouseBuilder {
            return HouseBuilder();
        }
    }

    fun printHouseDetail() {
        println(address + "の家")
        // floors != nullの時の処理
        floors?.let {
            println("階数:" + floors)
        }
        floorMaterial?.let {
            println("床材:" + floorMaterial)
        }
        wallMaterial?.let {
            println("壁材:" + wallMaterial)
        }
    }
}