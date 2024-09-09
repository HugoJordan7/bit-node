package com.example.bitnode.common.base

interface RequestCallback<T> {

    fun onSuccess(data: T)

    fun onFailure(message: String)

    fun onComplete(){}

}