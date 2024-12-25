package com.pppp.login.domain

import com.pppp.login.domain.models.CreateSession
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.pppp.Result


class LoginUseCase @Inject constructor(private val repository: LoginRepository) {

    fun createSession(username: String, password: String): Flow<Result<CreateSession>> {
        return repository.createSession(username, password)
    }
}