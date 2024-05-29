package com.infitelearning.development.infinitecinema.utils

sealed class ApiResult<out R> {
    data class Loading<out T>(val data: T? = null) : ApiResult<T>()
    data class Error(val message: String? = null): ApiResult<Nothing>()
    data class Success<out T>(val data: T): ApiResult<T>()
}
