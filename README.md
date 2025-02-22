# Color App

A simple yet dynamic Android app built with Jetpack Compose that allows users to generate, display, and refresh randomly colored cards. The app demonstrates the use of MVVM architecture, Hilt for dependency injection, and state management with Flow and ViewModel.
---

### Features :

- 📌 Dynamic Color Cards: Generate and display colored cards with a timestamp.

- 🔄 Refresh Colors: Refresh the list with a new set of random colors.

- ➕ Add Random Colors: Instantly generate new color cards with unique values.

- 🎨 Beautiful UI: Designed using Jetpack Compose with Material 3 styling.

- 🏗 MVVM Architecture: Proper separation of concerns with ViewModel and Repository.

- 🛠 Dependency Injection: Hilt is used for DI to manage dependencies efficiently.

- 🔥 State Management: Using Kotlin Flow and LiveData for seamless UI updates.

---

### Technologies and Libraries Used :

- Language: Kotlin

- Framework: Jetpack Compose

- Architecture: MVVM

- Dependency Injection: Hilt

- State Management: Flow, LiveData

---

### Dependencies Used :

- Add the following dependencies to your build.gradle file:
    ```
    implementation (libs.androidx.room.runtime)
    kapt("androidx.room:room-compiler:2.6.1")
    annotationProcessor (libs.androidx.room.compiler.v240beta01)
    implementation (libs.androidx.room.ktx)
    implementation(libs.firebase.database)
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.analytics)
    implementation(libs.androidx.runtime.livedata)
    implementation(libs.androidx.lifecycle.viewmodel.compose) // MVVM
    implementation(libs.kotlinx.coroutines.android)
    implementation (libs.androidx.material.icons.extended)

    // Dagger Hilt
    implementation (libs.hilt.android)
    kapt(libs.hilt.android.compiler)
    implementation(libs.hilt.compose.navigation)
    ```
---

### Project Structure :

```yaml
📂 com.example.janitriassignmentcolorapp  
 ├── 📂 data                  # Handles database and data-related operations  
 │   ├── 📄 AppDatabase.kt    # Room database setup  
 │   ├── 📄 CardDao.kt        # DAO for database operations  
 │   ├── 📄 CardEntity.kt     # Data entity definition  
 │   ├── 📄 ColorCard.kt      # Data model for color cards  
 │   ├── 📄 DatabaseModule.kt # Dependency injection module for database  
 │  
 ├── 📂 repo                  # Repository layer for managing data sources  
 │   ├── 📄 CardRepository.kt # Handles data operations from DB & ViewModel  
 │  
 ├── 📂 ui                    # UI-related components  
 │   ├── 📂 theme             # App theming  
 │   ├── 📂 view.components   # Reusable UI components  
 │   │   ├── 📄 CardApp.kt    # Main UI screen with Scaffold  
 │   │   ├── 📄 ColorCardItem.kt # UI representation of a color card  
 │   │  
 │   ├── 📄 MainActivity.kt   # Entry point of the app  
 │   ├── 📄 MyApp.kt          # Application class  
 │  
 ├── 📂 viewmodel             # ViewModel layer for business logic  
 │   ├── 📄 CardViewModel.kt  # ViewModel for managing UI state  
```

---

### How to Use :
1. Clone the repository
```git clone <repository-url>```

2. Open the project in Android Studio.

3. Add the required dependencies to your build.gradle file if not already included.

4. Run the app on an emulator or a physical device.

5. Use the app to manage your contacts by adding, editing, and deleting them.

---

### Screenshots & App Demo Video:

(Will upload these soon.)

---

### License

This project is open-source and available under the MIT License.
