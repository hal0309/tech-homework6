package org.homework20250126

import java.io.File


fun main() {
    val pathPrefix = "src/main/resources/homeWork20250126/"
    val fileNameList = listOf("input1.txt", "input2.txt")

    fileNameList.forEach { fname ->
        println("\nFile: $fname")

        File(pathPrefix+fname).forEachLine { line ->
            println(line)  // 各行を処理
        }
    }
}
