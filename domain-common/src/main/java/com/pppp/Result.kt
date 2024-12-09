package com.pppp

sealed class Result<out T> {
    data class Success<out T>(val value: T) : Result<T>()
    data class Failure(val cause: Throwable? = null) : Result<Nothing>()

    val isSuccess get() = this is Success
    val isFailure get() = this is Failure

    val success get() = this as? Success
    val failure get() = this as? Failure

    inline fun onSuccess(block: (value: T) -> Unit) = apply {
        if (this is Success) block(this.value)
    }

    inline fun onFailure(block: (cause: Throwable?) -> Unit) = apply {
        if (this is Failure) block(this.cause)
    }

    inline fun handle(
        onSuccess: (value: T) -> Unit,
        onFailure: (cause: Throwable?) -> Unit,
    ): Result<T> = apply {
        when (this) {
            is Success -> onSuccess(value)
            is Failure -> onFailure(cause)
        }
    }

    inline fun <R> map(transform: (value: T) -> R): Result<R> {
        return when (this) {
            is Success -> Success(transform(value))
            is Failure -> this
        }
    }

    inline fun <R> mapOutcome(transform: (value: T) -> Result<R>): Result<R> {
        return when (this) {
            is Success -> transform(value)
            is Failure -> this
        }
    }

    @Suppress("UNCHECKED_CAST")
    inline fun <R> mapFailure(transform: (error: Throwable?) -> Result<R>): Result<R> {
        return when (this) {
            is Success -> this as Result<R>
            is Failure -> transform(cause)
        }
    }
}