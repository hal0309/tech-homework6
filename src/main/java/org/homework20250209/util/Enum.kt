package org.homework20250209.util

enum class Enum(val query: String) {
    QUERY_ADD_USER("add_user"),
    QUERY_REMOVE_USER("remove_user"),
    QUERY_SHOW_USERS("show_users"),
    QUERY_LOGIN_USER("login_user"),
    QUERY_LOG("log");


    companion object {
        fun toQueryEnum(query: String): String {
            // Enumの列挙に該当するものがあればそいつを返却
            for (item in enumValues<Enum>()) {
                if (item.query == query) {
                    return item.query
                }
            }

            // 該当するものがない場合は入力をそのまま返却
            return query
        }
    }

//    修正後
//    companion object {
//        fun String.toQueryEnum() {
//            // Enumの列挙に該当するものがあればそいつを返却
//            for (item in enumValues<Enum>()) {
//                if (item.query == this) {
//                    return query
//                }
//            }
//
//            // 該当するものがない場合は入力をそのまま返却
//           return query
//        }
//    }
}
