package com.pppp.login.domain

import kotlinx.coroutines.flow.Flow
import com.pppp.Result
import com.pppp.login.domain.models.CreateSession

interface LoginRepository {

     fun createSession(username: String, password: String): Flow<Result<CreateSession>>
}