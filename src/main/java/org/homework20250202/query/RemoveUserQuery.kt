package org.homework20250202.query

import org.homework20250202.data.UserDatabase
import org.homework20250202.entity.User
import org.homework20250202.exception.UserNotFoundException

class RemoveUserQuery(line: List<String>): Query {
    val userId: String
    init {
        userId = line[IDX_USERID]
    }

    override fun execute() {
        try {
            val removedUser = UserDatabase.getInstance().removeUser(userId)
            println("${removedUser.username} removed.")
        } catch (e: UserNotFoundException) {
            println("$userId not found.")
        }
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
        const val IDX_USERID = 3
    }
}