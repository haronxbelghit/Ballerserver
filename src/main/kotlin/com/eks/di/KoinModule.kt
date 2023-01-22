package com.eks.di

import com.eks.repository.PlayerRepository
import com.eks.repository.PlayerRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<PlayerRepository> {
        PlayerRepositoryImpl()
    }
}