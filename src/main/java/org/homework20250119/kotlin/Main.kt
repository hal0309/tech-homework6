package org.homework20250119.kotlin;

import org.homework20250119.kotlin.Constants.UNKNOWN_AGE
import org.homework20250119.kotlin.Constants.UNKNOWN_EMAIL
import org.homework20250119.kotlin.Constants.UNKNOWN_USERNAME


fun main() {
    val users = arrayListOf<User>()
    users.add(User("Alice", 25, "alice@example.com"))
    users.add(User("", null, null))
    users.add(User("Bob", null, "bob@example.com"))

    //以下、ユーザー情報の整理を5種類のスコープ関数を用いて行う
    // ユーザー情報の整理 (letを使って書き換え)
    users.forEach{user ->
        if (user.name?.isEmpty() == true) {
            user.name = UNKNOWN_USERNAME
        }
        // 年齢が null の場合は -1 に設定
        user.age?.let {user.age}?: run { user.age = UNKNOWN_AGE }
        // メールアドレスが null の場合は "unknown@example.com" に設定
        user.email?.let {user.email}?: run {user.email = UNKNOWN_EMAIL}

        // 下記の書き方だとすべて年齢がなぜか -1 に設定
//      user.age.let {
//          user.age = UNKNOWN_AGE
//      }
        // 下記の書き方だとすべて "unknown@example.com" に設定される
//      user.email.let {
//          user.email = UNKNOWN_EMAIL
//      }
        user.hello()
        println(user)
    }


//        for (User user : users) {
//            // 名前が空の場合は "Unknown" に設定
//            if (user.name.isEmpty()) {
//                user.name = UNKNOWN_USERNAME;
//            }
//
//            // 年齢が null の場合は -1 に設定
//            if (user.age == null) {
//                user.age = UNKNOWN_AGE;
//            }
//
//            // メールアドレスが null の場合は "unknown@example.com" に設定
//            if (user.email == null) {
//                user.email = UNKNOWN_EMAIL;
//            }
//
//            user.hello();
//            System.out.println(user);
//        }
//
//        // ユーザー情報の整理 (runを使って書き換え)
    users.forEach{user ->
        // 名前が空の場合は "Unknown" に設定
//        if (user.name?.isEmpty() == true) {
//            user.name = UNKNOWN_USERNAME
//        }
        user.name?.run {user.name}?: {user.name = UNKNOWN_USERNAME}
        // 年齢が null の場合は -1 に設定
        user.age?.run {user.age}?: {user.age = UNKNOWN_AGE}
        // メールアドレスが null の場合は "unknown@example.com" に設定
        user.email?.run {user.email}?: {user.email = UNKNOWN_EMAIL}

        user.hello()
        System.out.println(user)
    }


    // ユーザー情報の整理 (applyを使って書き換え)
    users.forEach{user ->
        // 名前が空の場合は "Unknown" に設定
        user.name?.apply {user.name}?: {user.name = UNKNOWN_USERNAME}
        // 年齢が null の場合は -1 に設定
        user.age?.apply {user.age}?: {user.age = UNKNOWN_AGE}
        // メールアドレスが null の場合は "unknown@example.com" に設定
        user.email?.apply {user.email}?: {user.email = UNKNOWN_EMAIL}
        user.hello();
        println(user);
    }
    // ユーザー情報の整理 (alsoを使って書き換え)
    users.forEach{user ->
        // 名前が空の場合は "Unknown" に設定
        user.name?.also {user.name}?: {user.name = UNKNOWN_USERNAME}
        // 年齢が null の場合は -1 に設定
        user.age?.also {user.age}?: {user.age = UNKNOWN_AGE}
        // メールアドレスが null の場合は "unknown@example.com" に設定
        user.email?.also {user.email}?: {user.email = UNKNOWN_EMAIL}
        user.hello();
        println(user);
    }
    // ユーザー情報の整理 (withを使って書き換え)
    users.forEach { user ->
        // 名前が空の場合は "Unknown" に設定
//        user.name = (null)
//        if (user.name.isEmpty()) {
//           user.name = UNKNOWN_USERNAME;
//        }
//        user.name = UNKNOWN_USERNAME
//        // 年齢が null の場合は -1 に設定
//        user.age?.with { user.age } ?: { user.age = UNKNOWN_AGE }
//        // メールアドレスが null の場合は "unknown@example.com" に設定
//        user.email?.with { user.email } ?: { user.email = UNKNOWN_EMAIL }
//        user.hello();
//        println(user);
    }

}
