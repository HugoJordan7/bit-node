package com.example.bitnode.di

import com.example.bitnode.feature.main.data.NodeRemoteDataSource
import com.example.bitnode.feature.main.data.NodeRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { provideNodeRepository(get()) }
}

private fun provideNodeRepository(dataSource: NodeRemoteDataSource) = NodeRepository(dataSource)