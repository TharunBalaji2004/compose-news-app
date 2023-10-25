package com.loc.newsapp.di

import android.app.Application
import com.loc.newsapp.data.manager.LocalUserManagerImpl
import com.loc.newsapp.domain.manager.LocalUserManager
import com.loc.newsapp.domain.usecases.appentry.AppEntryUseCases
import com.loc.newsapp.domain.usecases.appentry.ReadAppEntry
import com.loc.newsapp.domain.usecases.appentry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesLocalUserManager(application: Application): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun providesAppEntryUseCases(localUserManager: LocalUserManager) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}