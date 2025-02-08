package org.homework20250209

import org.homework20250209.data.UserDatabase
import org.homework20250209.query.AddUserQuery
import org.homework20250209.query.Query
import org.homework20250209.query.RemoveUserQuery
import org.homework20250209.query.ShowUsersQuery
import java.io.File


fun main() {
    val pathPrefix = "src/main/resources/homeWork20250209/"
    val fileNameList = listOf("input3.txt", "input4.txt")

    val userDb = UserDatabase.getInstance()
    fileNameList.forEach { fname ->
        println("\nFile: $fname")

        File(pathPrefix+fname).forEachLine { line ->
            val lineList = line.split(" ")
            val queryType = lineList[0].dropLast(1)

            val query: Query = when (queryType) {
                QUERY_ADD_USER -> AddUserQuery(lineList)
                QUERY_REMOVE_USER -> RemoveUserQuery(lineList)
                QUERY_SHOW_USERS -> ShowUsersQuery(lineList)
                else -> {
                    throw IllegalArgumentException("Invalid query type: $queryType")
                }
            }

            query.execute()
        }

        userDb.clear()
    }
}
