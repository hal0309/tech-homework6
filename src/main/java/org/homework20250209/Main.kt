package org.homework20250209

import org.homework20250209.data.LogDatabase
import org.homework20250209.data.UserDatabase
import org.homework20250209.query.*
import org.homework20250209.util.Enum
import org.homework20250209.util.Enum.Companion.toQueryEnum
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

            //　拡張関数
            // val queryType = lineList.extractQueryType()

//            logDb.addLog(when(queryType) {
            // 修正前　whenのelse節消すとエラーになる
            logDb.addLog(when(toQueryEnum(queryType)) {
                Enum.QUERY_ADD_USER.query ->AddUserQuery(lineList)
                Enum.QUERY_REMOVE_USER.query  -> RemoveUserQuery(lineList)
                Enum.QUERY_SHOW_USERS.query  -> ShowUsersQuery(lineList)
                Enum.QUERY_LOGIN_USER.query  -> LoginUserQuery(lineList)
                Enum.QUERY_LOG.query  -> LogQuery(lineList)
                else -> {
                    throw IllegalArgumentException("Invalid query type: $queryType")
                }
            }.apply { execute() })

            // 修正後　4. 拡張メソッドの利用
//            logDb.addLog(when(queryType.toQueryEnum()) {
//                Enum.QUERY_ADD_USER.query ->AddUserQuery(lineList)
//                Enum.QUERY_REMOVE_USER.query  -> RemoveUserQuery(lineList)
//                Enum.QUERY_SHOW_USERS.query  -> ShowUsersQuery(lineList)
//                Enum.QUERY_LOGIN_USER.query  -> LoginUserQuery(lineList)
//                Enum.QUERY_LOG.query  -> LogQuery(lineList)
//                else -> {
//                    throw IllegalArgumentException("Invalid query type: $queryType")
//                }
//            }.apply { execute() })
        }

        userDb.clear()
        logDb.clear()

    }
}

// 拡張関数
fun List<String>.extractQueryType(){
    this[0].dropLast(1)
}

fun List<String>.misete(){
    println(this)
}
fun extractQueryType(line: List<String>): String {
    return line[0].dropLast(1)
}
