package com.loc.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow

// To save the entry of user (after Get Started)
interface LocalUserManager {
    suspend fun saveAppEntry()

    fun readAppEntry(): Flow<Boolean>
}