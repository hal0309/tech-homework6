package org.homework20250209.data

import org.homework20250209.entity.Log

class LogDatabase {
    private val logList = mutableListOf<Log>()

    fun addLog(log: Log) {
        logList.add(log)
    }

    fun getLogList(): List<Log> {
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