package com.pppp.login.data

import com.atproto.server.CreateSessionRequest
import com.pppp.Result
import com.pppp.login.domain.models.CreateSession
import com.pppp.login.domain.LoginRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.screech.ScreechClientApi
import javax.inject.Inject

class RetrofitLoginRepository @Inject constructor(
    val api: ScreechClientApi,
    val mapper: CreateSessionResponseMapper
) : LoginRepository {

    override fun createSession(
        username: String,
        password: String
    ): Flow<Result<CreateSession>> =
        flow {
            val request = CreateSessionRequest(username, password)
            val result = api.createSession(request).map { mapper.map(it) }
            emit(result.fold(
                onSuccess = { Result.Success(it) },
                onFailure = { Result.Failure(it) }
            ))
        }
}