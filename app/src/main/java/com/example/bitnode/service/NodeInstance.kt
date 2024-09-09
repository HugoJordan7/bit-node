package com.example.bitnode.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val NODE_BASE_URL = "https://mempool.space/api/v1/"

val nodeRetrofit = Retrofit.Builder()
    .baseUrl(NODE_BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(NodeService::class.java)