package org.homework20250209.query

import org.homework20250209.data.UserDatabase

class ShowUsersQuery(line: List<String>): Query {
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