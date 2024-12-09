package com.pppp.login.domain

public data class CreateSessionResponse(
    public val accessJwt: String,
    public val refreshJwt: String,
//    public val handle: Handle,
//    public val did: Did,
//    public val didDoc: JsonContent? = null,
    public val email: String? = null,
    public val emailConfirmed: Boolean? = null,
    public val emailAuthFactor: Boolean? = null,
    public val active: Boolean? = null,

    //public val status: CreateSessionStatus? = null,
)
