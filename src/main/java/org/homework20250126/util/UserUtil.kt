package org.homework20250126.util

object UserUtil {
    fun createId(date: String): String {
        return date.apply {
            replace("-", "")
            replace(":", "")
            replace(" ", "")
        }
    }
}