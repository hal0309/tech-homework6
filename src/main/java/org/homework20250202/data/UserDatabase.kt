package org.homework20250202.data

import org.homework20250202.entity.User

class UserDatabase {
    private val userList = mutableListOf<User>()

    fun addUser(user: User) {
        userList.add(user)
    }

    fun removeUser(removeId: String) {
        // removeIfの処理内に条件式と削除処理出来るのが違和感ある
        userList.removeIf {
            if (it.id == removeId){
                println("${it.username} removed.")
            }
            it.id.contains(removeId)
        }
    }

    fun showUser() {
        println("--users--")
        userList.forEach {
            println("${it.username}: ${it.id}")
        }
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