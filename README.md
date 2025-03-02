📦 MvvmKmpLargeScale  # Root project directory
├── 📂 composeApp [module]              # Compose application module for shared UI across platforms
│   ├── 📂 androidMain                  # Android-specific implementation
│   │   ├── 📂 util                     # Utility classes for Android (e.g., context providers)
│   │   ├── KmpApp.kt                   # Main application class for Android (entry point)
│   │   ├── MainActivity.kt             # Main Activity for Android (UI entry point)
│   ├── 📂 commonMain                   # Common code shared across platforms
│   │   ├── 📂 di                       # Dependency injection module (provides app-wide DI)
│   │   ├── 📂 navigation               # Navigation logic for the app
│   │   ├── 📂 ui                       # Shared UI components for Compose
│   │   ├── 📂 util                     # Utility classes for common code (e.g., context providers)
│   ├── 📂 desktopMain                  # Desktop-specific implementation
│   │   ├── 📂 util                     # Utility classes for Desktop (e.g., context providers)
│   │   ├── Main.kt                     # Main entry point for Desktop (UI entry point)
│   ├── 📂 iosMain                      # iOS-specific implementation
│   │   ├── 📂 util                     # Utility classes for iOS (e.g., context providers)
│   │   ├── MainViewController.kt       # Main View Controller for iOS (UI entry point)
├── 📂 core [module]                    # Core module containing base functionalities
│   ├── 📂 baseUi [module]              # Base UI components shared across features
│   │   ├── 📂 component                # Reusable UI components (e.g., buttons, text fields)
│   │   ├── 📂 state                    # State management for UI components
│   ├── 📂 data [module]                # Data layer module for handling local and remote data
│   │   ├── 📂 local [module]           # Local data source module (uses SQLDelight for database)
│   │   │   ├── 📂 androidMain          # Android-specific local data (e.g., SQLDelight engine injection)
│   │   │   ├── 📂 commonMain           # Common local data logic
│   │   │   ├── 📂 desktopMain          # Desktop-specific local data (e.g., SQLDelight engine injection)
│   │   │   ├── 📂 iosMain              # iOS-specific local data (e.g., SQLDelight engine injection)
│   │   ├── 📂 remote [module]          # Remote data source module (uses Ktor for networking)
│   │   │   ├── 📂 androidMain          # Android-specific remote data (e.g., Ktor engine injection)
│   │   │   ├── 📂 commonMain           # Common remote data logic
│   │   │   ├── 📂 desktopMain          # Desktop-specific remote data (e.g., Ktor engine injection)
│   │   │   ├── 📂 iosMain              # iOS-specific remote data (e.g., Ktor engine injection)
│   │   ├── 📂 repository [module]      # Repository module for data handling (combines local and remote data)
│   ├── 📂 domain [module]              # Domain layer module for business logic and use cases
├── 📂 di [module]                      # Dependency injection module (uses Kodein for DI)
├── 📂 features [module]                # Module containing feature implementations
│   ├── 📂 feature1 [module]            # First feature module
│   │   ├── 📂 ui                       # UI components for feature1 (Compose-based)
│   │   ├── 📂 viewmodel                # ViewModel for feature1 (state management)
│   ├── 📂 feature2 [module]            # Second feature module
│   │   ├── 📂 ui                       # UI components for feature2 (Compose-based)
│   │   ├── 📂 viewmodel                # ViewModel for feature2 (state management)
├── 📂 foundation [module]              # Foundation module for shared utilities (e.g., logging, analytics)
├── 📂 iosApp [directory]               # iOS application directory (Xcode project integration)
├── 📂 gradle [directory]               # Gradle-related configuration files (e.g., build scripts, dependencies)