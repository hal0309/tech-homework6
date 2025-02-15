package org.homework20250209.data

import org.homework20250209.entity.User
import org.homework20250209.exception.UserNotFoundException
import org.homework20250209.query.Query

class LogDatabase {
    private val logList = mutableListOf<Query>()

    fun addLog(query: Query) {
        logList.add(query)
    }

    fun getLogList(): List<Query> {
        return logList
    }

    fun clear() {
        logList.clear()
    }

    companion object {
        private var INSTANCE: LogDatabase? = null
        fun getInstance(): LogDatabase {
            if (INSTANCE == null) {
                INSTANCE = LogDatabase()
            }
            return INSTANCE!!
        }
    }
}