package com.example.bitnode.di

import com.example.bitnode.service.NodeService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val NODE_BASE_URL = "https://mempool.space/api/v1/"

val serviceModule = module {
    single { provideNodeService() }
}

private fun provideNodeService() = Retrofit.Builder()
    .baseUrl(NODE_BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(NodeService::class.java)