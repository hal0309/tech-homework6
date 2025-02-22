package org.homework20250209.query

import org.homework20250209.QUERY_LOGIN_USER
import org.homework20250209.data.UserDatabase
import org.homework20250209.entity.User

class LoginUserQuery(line: List<String>): Query {

    override val queryType = QueryEnum.LOGIN_USER
    override val date: String

    val userName: String
    val password: String


    init {
        userName = line[IDX_USERNAME]
        password = line[IDX_PASSWORD]
        date = "${line[IDX_DATE]} ${line[IDX_TIME]}"
    }

    override fun execute() {
        UserDatabase.getInstance().getUser(userName).let {
            if (it.password == password) {
                println("welcome ${it.username}!")
                println("age: ${it.age}")
                println("userid: ${it.id}")
                println("registered at: ${it.date}")
                println("goodbye ${it.username}!")
            } else {
                println("Login failed.")
            }
        }
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
        const val IDX_USERNAME = 3
        const val IDX_PASSWORD = 4
    }
}