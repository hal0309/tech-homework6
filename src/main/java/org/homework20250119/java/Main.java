package org.homework20250119.java;


import java.util.ArrayList;
import java.util.List;
import static org.homework20250119.java.Constants.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 25, "alice@example.com"));
        users.add(new User("", null, null));
        users.add(new User("Bob", null, "bob@example.com"));


        //以下、ユーザー情報の整理を5種類のスコープ関数を用いて行う

        // ユーザー情報の整理 (letを使って書き換え)
        for (User user : users) {
            // 名前が空の場合は "Unknown" に設定
            if (user.name.isEmpty()) {
                user.name = UNKNOWN_USERNAME;
            }

            // 年齢が null の場合は -1 に設定
            if (user.age == null) {
                user.age = UNKNOWN_AGE;
            }

            // メールアドレスが null の場合は "unknown@example.com" に設定
            if (user.email == null) {
                user.email = UNKNOWN_EMAIL;
            }

            user.hello();
            System.out.println(user);
        }

        // ユーザー情報の整理 (runを使って書き換え)

        // ユーザー情報の整理 (applyを使って書き換え)

        // ユーザー情報の整理 (alsoを使って書き換え)

        // ユーザー情報の整理 (withを使って書き換え)


    }
}
