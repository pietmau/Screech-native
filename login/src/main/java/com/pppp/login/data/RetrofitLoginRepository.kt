package com.pppp.login.data

import com.pppp.Result
import com.pppp.login.domain.CreateSessionResponse
import com.pppp.login.domain.LoginRepository
import kotlinx.coroutines.flow.Flow

class RetrofitLoginRepository : LoginRepository {
    override fun createSession(
        username: String,
        password: String
    ): Flow<Result<CreateSessionResponse>> {
        TODO("Not yet implemented")
    }
}