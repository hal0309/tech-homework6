package org.homework20250126.data

import org.homework20250202.entity.User
import org.homework20250202.data.UserDatabase

class UserDatabase {
    private val userList = mutableListOf<User>()

    fun addUser(user: User) {
        userList.add(user)
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