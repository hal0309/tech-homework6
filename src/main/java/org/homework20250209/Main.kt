package org.homework20250209

import org.homework20250209.data.LogDatabase
import org.homework20250209.data.UserDatabase
import org.homework20250209.query.*
import org.homework20250209.query.QueryEnum.*
import org.homework20250209.query.QueryEnum.Companion.toQueryEnum
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
            val queryType = lineList.extractQueryType()

            logDb.addLog(when (queryType) {
                ADD_USER -> AddUserQuery(lineList)
                REMOVE_USER -> RemoveUserQuery(lineList)
                SHOW_USERS -> ShowUsersQuery(lineList)
                LOGIN_USER -> LoginUserQuery(lineList)
                LOG -> LogQuery(lineList)
            }.apply { execute() })
        }

        userDb.clear()
        logDb.clear()
    }
}

fun List<String>.extractQueryType(): QueryEnum {
    return this[0].dropLast(1).toQueryEnum()
}