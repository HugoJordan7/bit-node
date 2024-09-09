package com.example.bitnode.di

import com.example.bitnode.feature.main.data.NodeRepository
import com.example.bitnode.feature.main.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { provideMainViewModel(get()) }
}

private fun provideMainViewModel(repository: NodeRepository) = MainViewModel(repository)