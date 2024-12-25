package com.pppp.login.domain.models

data class CreateSession(
    val accessJwt: String,
    val refreshJwt: String,
    val email: String? = null,
    val emailConfirmed: Boolean? = null,
    val emailAuthFactor: Boolean? = null,
    val active: Boolean? = null,
)
