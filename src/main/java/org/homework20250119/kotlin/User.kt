package org.homework20250119.kotlin

class User(var name: String = "", var age: Int?, var email: String?) {
    private var status: Status? = null

    init {
        // 年齢によってステータスを設定
        status = if (age == null) {
            Status.UNKNOWN
        } else if (age!! < 20) {
            Status.JUNIOR
        } else {
            Status.SENIOR
        }
    }

    fun hello() {
        println("Hello, $name!")
    }

    override fun toString(): String {
        return "User($name, $age, $email, $status)"
    }
}