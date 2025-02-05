package org.homework20250209

import org.homework20250209.data.UserDatabase
import org.homework20250209.query.AddUserQuery
import org.homework20250209.query.Query
import org.homework20250209.query.RemoveUserQuery
import org.homework20250209.query.ShowUsersQuery
import java.io.File


fun main() {
    val pathPrefix = "src/main/resources/homeWork20250126/"
    val fileNameList = listOf("input1.txt", "input2.txt")

    val userDb = UserDatabase.getInstance()
    fileNameList.forEach { fname ->
        println("\nFile: $fname")

        File(pathPrefix+fname).forEachLine { line ->
            val lineList = line.split(" ")
            val queryType = lineList[0]

            val query: Query = when (queryType) {
                "add_user:" -> AddUserQuery(lineList)
                "remove_user:" -> RemoveUserQuery(lineList)
                "show_users:" -> ShowUsersQuery(lineList)
                else -> {
                    println(lineList)
                    throw IllegalArgumentException("Invalid query type: $queryType")
                }
            }

            query.execute()
        }

        userDb.clear()
    }
}
