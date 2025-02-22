package org.homework20250209.query

enum class QueryEnum(val queryString: String) {
    ADD_USER("add_user"),
    REMOVE_USER("remove_user"),
    SHOW_USERS("show_users"),
    LOGIN_USER("login_user"),
    LOG("log");

    companion object {
        fun String.toQueryEnum(): QueryEnum =
            entries.find { it.queryString == this }
                ?: throw IllegalArgumentException("Invalid query type: $this")
    }
}