package org.homework20250202

import org.homework20250202.data.UserDatabase
import org.homework20250202.query.AddUserQuery
import org.homework20250202.query.RemoveUserQuery
import org.homework20250202.query.ShowUserQuery
import java.io.File

fun main() {
    val pathPrefix = "src/main/resources/homeWork20250126/"
    val fileNameList = listOf("input1.txt", "input2.txt")


    // これなんでしたっけ？
    val userDb = UserDatabase.getInstance()
    fileNameList.forEach { fname ->
        println("\nFile: $fname")

        File(pathPrefix+fname).forEachLine { line ->
            val lineList = line.split(" ")
            val queryType = lineList[0]

            val query = when (queryType) {
                "add_user:" -> AddUserQuery(lineList)
                "remove_user:" -> RemoveUserQuery(lineList)
                "show_users:" -> ShowUserQuery()
                else -> throw IllegalArgumentException("Invalid query type: $queryType")
            }

            // これなんでしたっけ？
            query.execute()
        }

        // これなんでしたっけ？
        userDb.clear()
    }
}
