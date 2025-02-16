package org.homework20250209.query


import org.homework20250209.QUERY_LOG
import org.homework20250209.data.LogDatabase
import org.homework20250209.data.UserDatabase

class LogQuery(line: List<String>): Query {

    override val queryType: String = QUERY_LOG
    override val date: String

    init {
        date = "${line[IDX_DATE]} ${line[IDX_TIME]}"
    }

    override fun execute() {
        val logList = LogDatabase.getInstance().getLogList()
        println("-- log --")
        logList.forEach {
            println("${it.date}: ${it.queryType}")
        }
        println("----")
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
    }
}