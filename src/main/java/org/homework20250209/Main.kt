package org.homework20250209

import org.homework20250209.data.LogDatabase
import org.homework20250209.data.UserDatabase
import org.homework20250209.query.*
import java.io.File


fun main() {
    val pathPrefix = "src/main/resources/homeWork20250209/"
    val fileNameList = listOf("input3.txt", "input4.txt")

    val userDb = UserDatabase.getInstance()
    val logDb = LogDatabase.getInstance()

    fileNameList.forEach { fname ->
        println("\nFile: $fname")

        File(pathPrefix+fname).forEachLine { line ->
            val lineList = line.split(" ")
            val queryType = lineList[0].dropLast(1)

            logDb.addLog(when (queryType) {
                QUERY_ADD_USER -> AddUserQuery(lineList)
                QUERY_REMOVE_USER -> RemoveUserQuery(lineList)
                QUERY_SHOW_USERS -> ShowUsersQuery(lineList)
                QUERY_LOGIN_USER -> LoginUserQuery(lineList)
                QUERY_LOG -> LogQuery(lineList)
                else -> {
                    throw IllegalArgumentException("Invalid query type: $queryType")
                }
            }.apply { execute() })
        }

        userDb.clear()
        logDb.clear()
    }
}
