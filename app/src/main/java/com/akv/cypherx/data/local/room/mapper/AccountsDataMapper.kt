package com.akv.cypherx.data.local.room.mapper

import com.akv.cypherx.data.local.room.model.AccountEntity
import com.akv.cypherx.domain.model.AccountData

object AccountsDataMapper {

    fun AccountEntity.toAccountData(): AccountData {
        return AccountData(
            id = id,
            accountName = accountName,
            accountUsername = accountUsername,
            accountPassword = accountPassword
        )
    }

    fun AccountData.toAccountEntity(): AccountEntity {
        return AccountEntity(
            id = id,
            accountName = accountName,
            accountUsername = accountUsername,
            accountPassword = accountPassword
        )
    }
}