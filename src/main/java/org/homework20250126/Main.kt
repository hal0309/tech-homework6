package org.homework20250126

import org.homework20250105.kotlin.animal.base.Animal
import java.io.File


fun main() {
    val pathPrefix = "src/main/resources/homeWork20250126/"
    val fileNameList = listOf("input1.txt", "input2.txt")

    var mojiSplitList: List<String> = emptyList()
    val hojiList: ArrayList<User> = arrayListOf()
    fileNameList.forEach { fname ->
        println("\nFile: $fname")


        File(pathPrefix + fname).forEachLine { line ->
            // add_user
            if (line.contains("add_user", true)) {
                mojiSplitList = line.split(" ")
                println("${mojiSplitList[3]} added.")  // 各行を処理
                var result = mojiSplitList[1].replace("-", "")
                result += mojiSplitList[2].replace(":", "")
                println("${result}: ${mojiSplitList[3]}")
                hojiList.add(User(
                        mojiSplitList[3],
                        mojiSplitList[4],
                        null,
                        null,
                        "${mojiSplitList[1]}${mojiSplitList[2]}".replace("-", "").replace(":", "")
                ))
            }

            // remove_user
            if (line.contains("remove_user", true)) {
                mojiSplitList = line.split(" ")
                // toSetしないとなぜかエラーになる
                hojiList.toSet().forEach { it ->
                    // [username] removed.
                    if (it.userId == mojiSplitList[3]) {
                        println("${mojiSplitList[3]} removed.")  // 各行を処理
                        removeUserId(hojiList,it.userId)
                    // [userid] not found.
                    } else {
                        println("${mojiSplitList[3]} not found.")
                    }
                }
            }

            // show_users
            if (line.contains("show_users", true)) {
                println("--users--")
                hojiList.forEach { it ->
                    // [username] removed.
                    println("${it.userId}: ${it.username}")
                }
            }


        }
    }
}

fun removeUserId(hojiList: ArrayList<User>,userId: String?) {
    hojiList.removeIf {
        it.userId == userId
    }

}


