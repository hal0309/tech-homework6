package org.homework20250126

class User(
        var username: String?,
        val age: String?,
        val password: String?,
        val registrationDateTime: String?,
        val userId: String?
) {

    constructor(
        username: String?,
        age: String?,
        password: String?,
        registrationDateTime: String?
    ) : this(username, age, password, registrationDateTime, registrationDateTime!!.replace("-", "").replace(":", ""))


//    fun getUsername(): String? {
//        return username
//    }
//
//    private fun getAge(): String? {
//        return age
//    }
//
//    private fun getPassword(): String? {
//        return password
//    }
//    private fun getRegistrationDateTime(): String? {
//        return registrationDateTime
//    }
//    private fun getUserId(): String? {
//        return userId
//    }


}

