package com.example.di

import com.example.repository.PlayerRepository
import com.example.repository.PlayerRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<PlayerRepository> {
        PlayerRepositoryImpl()
    }
}