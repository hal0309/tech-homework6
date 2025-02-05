package org.homework20250202.data

import org.homework20250202.entity.User
import org.homework20250202.exception.UserNotFoundException

class UserDatabase {
    private val userList = mutableListOf<User>()

    fun addUser(user: User) {
        userList.add(user)
    }

    fun removeUser(id: String): User {
        return userList.find { it.id == id }
            ?.also { userList.remove(it) }
            ?: throw UserNotFoundException()
    }

    fun getUserList(): List<User> {
        return userList
    }

    fun clear() {
        userList.clear()
    }

    companion object {
        private var INSTANCE: UserDatabase? = null
        fun getInstance(): UserDatabase {
            if (INSTANCE == null) {
                INSTANCE = UserDatabase()
            }
            return INSTANCE!!
        }
    }
}