package org.homework20250209.query

import org.homework20250209.data.LogDatabase

class LogQuery(): Query {
    override fun execute() {
        val logList = LogDatabase.getInstance().getLogList()
        println("-- log --")
        logList.forEach {
            println("${it.date}: ${it.queryType}")
        }
        println("----")
    }
}