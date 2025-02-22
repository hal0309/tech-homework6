package org.homework20250209.query

interface Query {

    val queryType : QueryEnum
    val date: String
    fun execute()
}