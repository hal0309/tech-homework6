package org.homework20250119.kotlin



fun main() {
    val users = mutableListOf(
        User("Alice", 25, "alice@example.com"),
        User("", null, null),
        User("Bob", null, "bob@example.com")
    )


    //以下、ユーザー情報の整理を5種類のスコープ関数を用いて行う

    // ユーザー情報の整理 (letを使って書き換え)
    users.forEach { user ->
        user.let {
            it.name = it.name.ifEmpty { UNKNOWN_USERNAME }
            it.age = it.age ?: UNKNOWN_AGE
            it.email = it.email ?: UNKNOWN_EMAIL

            println(it)
        }
    }

    // ユーザー情報の整理 (runを使って書き換え)
    users.forEach { user ->
        user.run {
            name = name.ifEmpty { UNKNOWN_USERNAME }
            age = age ?: UNKNOWN_AGE
            email = email ?: UNKNOWN_EMAIL
            println(this)
        }
    }

    // ユーザー情報の整理 (applyを使って書き換え)
    users.forEach { user ->
        user.apply {
            name = name.ifEmpty { UNKNOWN_USERNAME }
            age = age ?: UNKNOWN_AGE
            email = email ?: UNKNOWN_EMAIL
            println(this)
        }
    }

    // ユーザー情報の整理 (alsoを使って書き換え)
    users.forEach { user ->
        user.also {
            it.name = it.name.ifEmpty { UNKNOWN_USERNAME }
            it.age = it.age ?: UNKNOWN_AGE
            it.email = it.email ?: UNKNOWN_EMAIL
            println(it)
        }
    }

    // ユーザー情報の整理 (withを使って書き換え)
    users.forEach { user ->
        with(user) {
            name = name.ifEmpty { UNKNOWN_USERNAME }
            age = age ?: UNKNOWN_AGE
            email = email ?: UNKNOWN_EMAIL
            println(this)
        }
    }

}
