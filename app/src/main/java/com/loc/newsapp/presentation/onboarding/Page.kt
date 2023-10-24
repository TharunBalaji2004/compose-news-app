package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

// Defines model of Onboarding page
data class Page(
    val title: String,
    val desc: String,
    @DrawableRes val image: Int
)

// Contents for Onboarding page
val pages = listOf(
    Page(
        title = "Onboarding 1",
        desc = "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Onboarding 2",
        desc = "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Onboarding 3",
        desc = "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
        image = R.drawable.onboarding3
    ),
)