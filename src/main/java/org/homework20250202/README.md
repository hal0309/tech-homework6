# Homework6

## 2024年2月2日

### 1. 演習内容
前回の課題と同一の内容ですが、もう少し設計を詰めましょう。

Mainクラス内に多くの処理が書かれているので、処理を他のクラスに分割しましょう。    
  - ユーザー情報を保持するクラス: `User`
  - クエリを処理するクラス: `Query`を継承した`AddUserQuery`, `RemoveUserQuery`, `ShowUsersQuery`
  - その他独自例外クラスや、ユーティリティクラスを作成する

`AddUser`のみに関して実装しました。その他2つのクエリについても参考に実装してください。
特に、`RemoveUser`に関しては、独自例外を作成した上で例外処理を行ってください。

### 2. 追加課題(余裕があれば)

- 定義したものに当てはまらないクエリが来た際、現状では異常終了しているが、エラー内容を表示したうえで処理続行
- 上記の独自例外を作成
- `add_user:`等、不変の文字列を定数として定義
- 日時を文字列では無く`DateTime`等で管理


## 2024年1月26日

### 1. 演習内容
今回の課題は、ユーザー管理システムの設計です。
クエリは以下の様にテキストで与えられます。
```
add_user: 2023-11-01 12:00:00 haruki 23 2525
show_users: 2023-11-02 12:03:35
remove_user: 2023-11-01 12:05:23 20231101120000
show_users: 2023-11-01 12:15:20
```

テキストを1行ずつ読み込み、クエリを実行していくプログラムを作成してください。  
返答は以下の様になります。
```
haruki added.
--users--
20231101120000: haruki
----
haruki removed.
--users--
----
```



クエリは`add_user`, `remove_user`, `show_users`の4種類です。

クエリの仕様は以下の通りです。

---
#### `add_user`
システムにユーザーを追加します。  
ユーザーは以下の情報を持ちます。
- ユーザー名
- 年齢
- パスワード
- 登録日時
- ユーザーID (登録日時の`YYMMDDhhmmss`をユーザーIDとします)

入力は以下の通りです。
```
add_user: YYYY-MM-DD hh:mm:ss [username] [age] [password]
```

返答は以下の通りです。
```
[username] added.
```

---
#### `remove_user`
システムカラユーザーを削除します。

入力は以下の通りです。
```
remove_user: YYYY-MM-DD hh:mm:ss [userid]
```

正常時の返答は以下の通りです。
```
[username] removed.
```
もし、対象のユーザーが存在しない場合は以下の通りです。
```
[userid] not found.
```

---
#### `show_users`
システムに登録されているユーザーを表示します。  

入力は以下の通りです。
```
show_users: YYYY-MM-DD hh:mm:ss
```

返答は以下の通りです。
```
--users--
[userid]: [username]
[userid]: [username]
...
----
```


### 2. 入出力例
以下の入出力例が満たされるようにプログラムを作成してください。

#### 入力例1
```
add_user: 2023-11-01 12:00:00 haruki 23 2525
show_users: 2023-11-02 12:03:35
remove_user: 2023-11-01 12:05:23 20231101120000
show_users: 2023-11-01 12:15:20
```
#### 出力例1
```
haruki added.
--users--
20231101120000: haruki
----
haruki removed.
--users--
----
```
---
#### 入力例2
```
add_user: 2023-11-01 12:00:00 haruki 23 2525
add_user: 2023-11-01 12:00:01 yamada 25 1234
add_user: 2023-11-01 12:00:02 tanaka 30 5325
show_users: 2023-11-02 12:03:35
remove_user: 2023-11-01 12:05:23 20231101120001
remove_user: 2023-11-01 12:05:25 20231101120001
show_users: 2023-11-01 12:15:20
```
#### 出力例2
```
haruki added.
yamada added.
tanaka added.
--users--
20231101120000: haruki
20231101120001: yamada
20231101120002: tanaka
----
yamada removed.
20231101120001 not found.
--users--
20231101120000: haruki
20231101120002: tanaka
----
```

---
現状でも、入力を読み込む部分だけプログラムが出来ているので、それを参考に処理を行ってください。

特に記載が無い部分の処理は自由に行ってください。  
(ユーザーの保持方法、クエリの処理方法など)

最終的な出力は以下のようになります。
```
File: input1.txt
haruki added.
--users--
20231101120000: haruki
----
haruki removed.
--users--
----

File: input2.txt
haruki added.
yamada added.
tanaka added.
--users--
20231101120000: haruki
20231101120001: yamada
20231101120002: tanaka
----
yamada removed.
20231101120001 not found.
--users--
20231101120000: haruki
20231101120002: tanaka
----
```