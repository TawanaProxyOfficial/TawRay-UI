# TawRay VPN UI

TawRay is a modern VPN application UI built with Kotlin and Jetpack Compose, featuring a sleek dark theme design inspired by premium VPN applications.

## Features

- 🎨 Modern UI with Material 3 Design
- 🌙 Dark theme with custom color scheme
- 🌍 Server location selection
- 🔐 Connection status indicator
- 📊 Data usage tracking
- ⚡ Quick connect functionality

## Screenshots

*Screenshots will be added after the first build*

## Web Preview

You can preview the UI design in your browser without building the Android app!

**View the live preview:** [TawRay UI Preview](https://tawanaproxyofficial.github.io/TawRay-UI/)

### Enabling GitHub Pages

To enable GitHub Pages for this repository:

1. Go to your repository on GitHub
2. Navigate to **Settings** > **Pages**
3. Under **Source**, select:
   - Branch: `main` (or your default branch)
   - Folder: `/docs`
4. Click **Save**
5. GitHub will automatically publish the preview at: `https://tawanaproxyofficial.github.io/TawRay-UI/`

The web preview is a single HTML file located in `docs/index.html` that mimics the Android app UI using pure HTML and CSS.

## Technical Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Design**: Material 3
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

## Project Structure

```
app/
├── src/main/
│   ├── java/com/tawray/ui/
│   │   ├── MainActivity.kt
│   │   ├── ui/
│   │   │   ├── theme/
│   │   │   │   ├── Color.kt
│   │   │   │   ├── Theme.kt
│   │   │   │   └── Type.kt
│   │   │   ├── screens/
│   │   │   │   └── HomeScreen.kt
│   │   │   └── components/
│   │   │       ├── ServerListItem.kt
│   │   │       ├── ConnectionStatus.kt
│   │   │       ├── TopBar.kt
│   │   │       └── UpgradeBanner.kt
│   │   └── data/
│   │       └── Server.kt
│   └── res/
│       └── values/
│           ├── strings.xml
│           └── colors.xml
```

## Setup Instructions

### Prerequisites

- Android Studio Hedgehog (2023.1.1) or later
- JDK 8 or higher
- Android SDK with API level 34

### Building the Project

1. Clone the repository:
```bash
git clone https://github.com/TawanaProxyOfficial/TawRay-UI.git
cd TawRay-UI
```

2. Open the project in Android Studio

3. Sync project with Gradle files

4. Run the app on an emulator or physical device

### Using Gradle Command Line

```bash
# Build the project
./gradlew build

# Install on connected device
./gradlew installDebug

# Run tests
./gradlew test
```

## Color Scheme

The app uses a custom dark theme with the following colors:

- **Background**: #0D1117 (Dark blue/black)
- **Surface**: #161B22
- **Primary**: #00C853 (Green for connected state)
- **Secondary**: #FFD700 (Gold/yellow accent)
- **Text Primary**: #FFFFFF
- **Text Secondary**: #8B949E

## Dependencies

- Jetpack Compose BOM (2023.10.01)
- Material 3
- Navigation Compose
- Lifecycle ViewModel Compose
- AndroidX Core KTX

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Roadmap

- [ ] Implement actual VPN functionality
- [ ] Add server ping/latency information
- [ ] Implement favorites functionality
- [ ] Add settings screen
- [ ] Implement dark/light theme toggle
- [ ] Add connection history
- [ ] Implement protocol selection
- [ ] Add network statistics

## Support

For support, please open an issue in the GitHub repository.
