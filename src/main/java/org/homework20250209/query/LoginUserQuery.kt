package org.homework20250209.query

import org.homework20250209.data.UserDatabase

class LoginUserQuery(line: List<String>): Query {

    var targetLine = line
    override fun execute() {
        val userList = UserDatabase.getInstance().getUserList()
        userList.forEach {
            if (targetLine[3] == it.username){
                println("welcome [${it.username}]")
                println("age: [${it.age}]")
                println("userid: [${it.id}]")
                println("registered at: [${it.date}]")
                println("goodbye [${it.username}]!")
            }
        }
    }

}