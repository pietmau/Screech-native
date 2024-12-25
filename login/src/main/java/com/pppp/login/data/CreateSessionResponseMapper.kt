package com.pppp.login.data

import com.pppp.login.domain.models.CreateSession
import javax.inject.Inject

class CreateSessionResponseMapper @Inject constructor() {

    fun map(response: com.atproto.server.CreateSessionResponse): CreateSession =
        CreateSession(
            accessJwt = response.accessJwt,
            refreshJwt = response.refreshJwt,
            email = response.email,
            emailConfirmed = response.emailConfirmed,
            emailAuthFactor = response.emailAuthFactor,
            active = response.active
        )
}