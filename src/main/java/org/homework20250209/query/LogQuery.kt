package org.homework20250209.query


import org.homework20250209.data.LogDatabase
import org.homework20250209.data.UserDatabase
import org.homework20250209.util.Enum
import java.util.Collections

class LogQuery(line: List<String>): Query {

    override val queryType: String = Enum.QUERY_LOG.query
    override val date: String
    private var queryName: String = ""

    init {
        date = "${line[IDX_DATE]} ${line[IDX_TIME]}"
        if(line.size==4) {
            queryName = line[IDX_NAME]
        }
    }

    override fun execute() {
        val logList = LogDatabase.getInstance().getLogList()
        println("-- log --")
        logList.forEach {
            if(it.queryType ==queryName){
            println("${it.date}: ${it.queryType}")
            }
        }
        println("----")
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
        const val IDX_NAME = 3
    }
}