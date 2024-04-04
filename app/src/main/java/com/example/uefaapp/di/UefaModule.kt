package com.example.uefaapp.di

import com.example.uefaapp.data.repositories.MockRepository

object UefaModule {

    fun provideMockRepository() = MockRepository()
}