package org.homework20250209.entity

import org.homework20250209.util.UserUtil

data class User (
    val username: String,
    val age: Int,
    val password: String,
    val date: String,
    val id: String
){
    constructor(username: String, age: Int, password: String, date: String):
            this(username, age, password, date, UserUtil.createId(date))
}