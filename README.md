# NewsApp 📰📱
This app is designed to provide a seamless and user-friendly news reading experience. It features a modern UI built with Jetpack Compose, and it uses MVVM + MVI architecture to ensure separation of concerns and testability. Paging3 is used to efficiently handle large datasets of news articles, and Retrofit is used to fetch news articles from a remote API. Room is used to store news articles locally, and DataStore is used to store user preferences. Dagger Hilt is used to provide dependency injection, making the code more modular and maintainable.

# Clean Architecture 🏗️

The core principles of the clean approach can be summarized as followed:

#### 1. The application code is separated into layers.

These layers define the separation of concerns inside the code base.

#### 2. The layers follow a strict dependency rule.

Each layer can only interact with the layers below it.

#### 3. As we move toward the bottom layer — the code becomes generic.

The bottom layers dictate policies and rules, and the upper layers dictate implementation details such as the database, Loca User manager, and UI.

<p align="center">
<img width="80%" src="https://raw.githubusercontent.com/AliAsadi/Android-Clean-Architecture/master/screenshot/architecture0.png">
</p>

# Architecture Layers 🎯

<p align="center">
<img width="80%" src="https://raw.githubusercontent.com/AliAsadi/Android-Clean-Architecture/master/screenshot/structure0.png">
</p>

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development
- [Jetpack Compose](https://developer.android.com/jetpack/compose) - Modern Android UI Library for building seemless applications
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception

- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps
  - [Paging3](https://kotlinlang.org/) - Load and display small chunks of data at a time.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes
  - [Navigation Components](https://developer.android.com/guide/navigation/navigation-getting-started) - Navigate fragments easier
  - [Room](https://developer.android.google.cn/jetpack/androidx/releases/room) - Persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.
  
- [Dependency Injection](https://developer.android.com/training/dependency-injection)
  - [Dagger](https://dagger.dev/) - Fundamental framework providing compiler time and full static dependency injection
  - [Hilt](https://dagger.dev/hilt) - Easier way to incorporate Dagger DI into Android application

- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java
