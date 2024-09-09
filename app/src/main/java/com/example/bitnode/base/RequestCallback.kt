package com.example.bitnode.base

interface RequestCallback<T> {

    fun onSuccess(data: T)

    fun onFailure(message: String)

    fun onComplete(){}

}