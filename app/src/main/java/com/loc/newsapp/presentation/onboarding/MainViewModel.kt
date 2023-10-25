package com.loc.newsapp.presentation.onboarding

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.loc.newsapp.domain.usecases.appentry.AppEntryUseCases
import com.loc.newsapp.presentation.navgraph.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    appEntryUseCases: AppEntryUseCases
): ViewModel() {

    private val _splashCondition = mutableStateOf(true)
    val splashCondition: State<Boolean> = _splashCondition

    var startDestination by mutableStateOf(Route.AppStartNavigation.route)

    init {
        appEntryUseCases.readAppEntry().onEach {
            startDestination = if (it) {
                Route.NewsNavigation.route
            } else {
                Route.AppStartNavigation.route
            }
            delay(300)
            _splashCondition.value = false
        }.launchIn(viewModelScope)
    }
}