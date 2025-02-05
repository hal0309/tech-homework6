package org.homework20250209.util

object UserUtil {
    fun createId(date: String): String {
        return date
            .replace("-", "")
            .replace(":", "")
            .replace(" ", "")
    }
}