package org.homework20250209.query

import org.homework20250209.QUERY_ADD_USER
import org.homework20250209.data.UserDatabase
import org.homework20250209.entity.User

class AddUserQuery(line: List<String>): Query {

    override val queryType = QUERY_ADD_USER
    override val date: String

    val user: User


    init {
        user = User(
            line[IDX_USERNAME],
            line[IDX_AGE].toInt(),
            line[IDX_PASSWORD],
            "${line[IDX_DATE]} ${line[IDX_TIME]}"
        )
        date = "${line[IDX_DATE]} ${line[IDX_TIME]}"
    }

    override fun execute() {
        UserDatabase.getInstance().addUser(user)
        println("${user.username} added.")
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
        const val IDX_USERNAME = 3
        const val IDX_AGE = 4
        const val IDX_PASSWORD = 5
    }
}