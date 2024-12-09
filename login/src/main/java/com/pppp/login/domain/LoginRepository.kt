package com.pppp.login.domain

import kotlinx.coroutines.flow.Flow
import com.pppp.Result

interface LoginRepository {

    fun createSession(username: String, password: String): Flow<Result<CreateSessionResponse>>
}