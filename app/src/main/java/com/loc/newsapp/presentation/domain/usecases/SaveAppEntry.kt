package com.loc.newsapp.presentation.domain.usecases

import com.loc.newsapp.presentation.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}