package org.homework20250209.query

interface Query {

    val queryType : String
    val date: String
    fun execute()
}