package org.homework20250202.query

import org.homework20250202.data.UserDatabase
import org.homework20250202.util.UserUtil

class RemoveUserQuery(line: List<String>): Query {

    private var removeId = UserUtil.removeId(line[REMOVE_ID])
    override fun execute() {
        removeUser(removeId)
    }

    private fun removeUser(removeId: String) {
        val userDb = UserDatabase.getInstance()
        userDb.removeUser(removeId)
    }

    companion object {
        const val REMOVE_ID = 3
    }
}