package org.homework20250126.query

import org.homework20250202.data.UserDatabase
import org.homework20250202.entity.User
import org.homework20250202.query.Query

class AddUserQuery(line: List<String>): Query {
    val user: User

    init {
        user = User(
            line[IDX_USERNAME],
            line[IDX_AGE].toInt(),
            line[IDX_PASSWORD],
            "${line[IDX_DATE]} ${line[IDX_TIME]}"
        )
    }

    override fun execute() {
        addUser(user)
        println("${user.username} added.")
    }

    private fun addUser(user: User) {
        val userDb = UserDatabase.getInstance()
        userDb.addUser(user)
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
        const val IDX_USERNAME = 3
        const val IDX_AGE = 4
        const val IDX_PASSWORD = 5
    }
}