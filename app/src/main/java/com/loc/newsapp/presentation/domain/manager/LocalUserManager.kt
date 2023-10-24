package com.loc.newsapp.presentation.domain.manager

import kotlinx.coroutines.flow.Flow

// To save the entry of user (after Get Started)
interface LocalUserManager {
    suspend fun saveAppEntry()

    fun readAppEntry(): Flow<Boolean>
}