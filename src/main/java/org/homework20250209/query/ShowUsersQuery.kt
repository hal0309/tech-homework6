package org.homework20250209.query

import org.homework20250209.data.UserDatabase
import org.homework20250209.util.Enum

class ShowUsersQuery(line: List<String>): Query {

    override val queryType: String = Enum.QUERY_SHOW_USERS.query
    override val date: String

    init {
        date = "${line[IDX_DATE]} ${line[IDX_TIME]}"
    }

    override fun execute() {
        val userList = UserDatabase.getInstance().getUserList()
        println("--users--")
        userList.forEach {
            println("${it.id}: ${it.username}")
        }
        println("----")
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
    }
}