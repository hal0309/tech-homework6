package org.homework20250202.query

import org.homework20250202.data.UserDatabase

class ShowUserQuery(): Query {

    override fun execute() {
        showUser()
    }

    private fun showUser() {
        val userDb = UserDatabase.getInstance()
        userDb.showUser()
    }
}