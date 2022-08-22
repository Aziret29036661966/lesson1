package com.example.lesson1.utils

sealed class Resource<out I>(
    val data: I? = null,
    val message: String? = null
){
    class Load<I> : Resource<I>()
    class Success <I>(data:I):Resource<I> (data = data)
    class Error<I>(message: String?
    ,data : I? = null) : Resource
    <I>(data = data, message = message)
}