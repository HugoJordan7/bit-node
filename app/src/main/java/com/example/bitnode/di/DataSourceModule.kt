package com.example.bitnode.di

import com.example.bitnode.feature.main.data.NodeRemoteDataSource
import com.example.bitnode.service.NodeService
import org.koin.dsl.module

val dataSourceModule = module {
    single { provideNodeRemoteDataSource(get()) }
}

private fun provideNodeRemoteDataSource(nodeService: NodeService) = NodeRemoteDataSource(nodeService)