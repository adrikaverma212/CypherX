package com.akv.cypherx.domain.usecase.accounts

import com.akv.cypherx.domain.model.AccountData
import com.akv.cypherx.domain.repository.AccountsRepository
import com.akv.cypherx.utils.ApiResponse
import kotlinx.coroutines.flow.Flow

class SearchByQuery(
    private val accountsRepository: AccountsRepository
) {
    operator fun invoke(query: String): Flow<ApiResponse<List<AccountData>>> {
        return accountsRepository.searchByQuery(query)
    }
}