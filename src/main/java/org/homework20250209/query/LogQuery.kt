package org.homework20250209.query


import org.homework20250209.data.LogDatabase
import org.homework20250209.query.QueryEnum.Companion.toQueryEnum

class LogQuery(line: List<String>): Query {

    override val queryType = QueryEnum.LOG
    override val date: String

    var target: QueryEnum? = null

    init {
        date = "${line[IDX_DATE]} ${line[IDX_TIME]}"
        if(line.size > IDX_TARGET){
            target = line[IDX_TARGET].toQueryEnum()
        }
    }

    override fun execute() {
        var logList = LogDatabase.getInstance().getLogList()
        if(target != null){
            logList = logList.filter { it.queryType == target }
        }

        println("-- log --")
        logList.forEach {
            println("${it.date}: ${it.queryType.queryString}")
        }
        println("----")
    }

    companion object {
        const val IDX_DATE = 1
        const val IDX_TIME = 2
        const val IDX_TARGET = 3
    }
}