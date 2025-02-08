package org.homework20250202.util

object UserUtil {
    fun createId(date: String): String {
        return date
            .replace("-", "")
            .replace(":", "")
            .replace(" ", "")
    }

    fun removeId(date: String): String {
        return date
            .replace("-", "")
            .replace(":", "")
            .replace(" ", "")
    }

}