# TawRay VPN UI Design Preview

## Visual Structure

When built and run on an Android device, the TawRay app will display the following UI:

```
┌─────────────────────────────────────────┐
│  ☰                TawRay             [ ]│  ← Top Bar (Dark #0D1117)
├─────────────────────────────────────────┤
│                                         │
│          ● Connected                    │  ← Status Indicator (Green #00C853)
│          IKEv2 500                      │  ← Protocol
│                                         │
│         Best Location                   │  ← Server Name (Bold, White)
│           Automatic                     │  ← Server Subtitle (Gray #8B949E)
│                                         │
│            ┌───────┐                    │
│            │   ⏻   │                    │  ← Power Button (Green when connected)
│            └───────┘                    │
│                                         │
│          ─────────────                  │  ← Network Status Line (Green)
│                                         │
├─────────────────────────────────────────┤
│                                         │
│    🛡️      ❤️      📍      🖥️          │  ← Toolbar Icons
│                                         │
├─────────────────────────────────────────┤
│                                         │
│  All locations (10)              🔍     │  ← Server List Header
│                                         │
│  🌍  Best Location            ➡️       │
│     Automatic                           │
│                                         │
│  🇺🇸  US Central              ➕       │
│     Chicago                             │
│                                         │
│  🇺🇸  US East                 ➕       │
│     New York                            │
│                                         │
│  🇺🇸  US West                 ➕       │
│     Los Angeles                         │
│                                         │
│  🇨🇦  Canada East             ➕       │
│     Toronto                             │
│                                         │
│  🇨🇦  Canada West             ➕       │
│     Vancouver                           │
│                                         │
│  🇦🇹  Austria                 ➕       │
│     Vienna                              │
│                                         │
│  [More servers scroll...]               │
│                                         │
├─────────────────────────────────────────┤
│ ┌─────────────────────────────────────┐│
│ │ Upgrade to Pro    11.00 GB      ➡️ ││  ← Upgrade Banner (Surface #161B22)
│ │ Unlock full access                 ││     Gold text (#FFD700)
│ └─────────────────────────────────────┘│
└─────────────────────────────────────────┘
```

## Color Scheme Applied

### Dark Theme Base
- **Background**: #0D1117 (Deep dark blue/black) - Main screen background
- **Surface**: #161B22 (Slightly lighter) - Cards and elevated elements
- **Text Primary**: #FFFFFF (Pure white) - Main headings and labels
- **Text Secondary**: #8B949E (Muted gray) - Subtitles and secondary info

### Accent Colors
- **Primary Green**: #00C853 - Connection status, power button when ON, indicators
- **Secondary Gold**: #FFD700 - "Upgrade to Pro" text, premium features
- **Black**: #000000 - Icon overlays on colored buttons
- **White**: #FFFFFF - General text

## Component Breakdown

### 1. Top Bar
- **Background**: Dark (#0D1117)
- **Left**: Hamburger menu icon (☰)
- **Center**: "TawRay" branding in bold white
- **Right**: Empty space (for future profile/settings)

### 2. Connection Status Section
- **Status Indicator**: Small circle (green when connected, gray when disconnected)
- **Protocol Display**: "IKEv2 500" in gray text
- **Server Name**: Large bold white text (e.g., "Best Location")
- **Server Subtitle**: Smaller gray text (e.g., "Automatic")
- **Power Button**: Large circular button (100dp diameter)
  - Green background when connected
  - Dark surface when disconnected
  - White power icon
- **Network Line**: Horizontal line indicator below button

### 3. Toolbar
Four evenly spaced icons:
- 🛡️ Shield (security features)
- ❤️ Heart (favorites)
- 📍 Location (map view)
- 🖥️ Terminal (advanced settings)

### 4. Server List
- **Header**: "All locations (10)" with search icon
- **List Items**: Each server shows:
  - Country flag emoji (🇺🇸, 🇨🇦, etc.)
  - Server name (bold white)
  - Server subtitle/city (gray)
  - Action icon (➡️ for Best Location, ➕ for others)
- **Scrollable**: User can scroll through all servers

### 5. Upgrade Banner
- **Background**: Surface color (#161B22) with elevation
- **Left Side**:
  - "Upgrade to Pro" in gold (#FFD700)
  - "11.00 GB" data usage in gray
  - "Unlock full access" subtitle in gray
- **Right Side**: Arrow icon (➡️)
- **Interactive**: Tappable to open upgrade screen

## Interaction States

### Connection Toggle
**Disconnected State:**
- Power button: Dark surface (#161B22)
- Status dot: Gray
- Status text: "Disconnected" in gray
- Network line: Gray

**Connected State:**
- Power button: Green (#00C853)
- Status dot: Green (#00C853)
- Status text: "Connected" in green
- Network line: Green (#00C853)

### Server Selection
- User taps a server from the list
- Selected server name updates in connection status section
- Connection remains in same state (doesn't auto-connect)

### List Interactions
- Scroll to view more servers
- Tap ➡️ on Best Location to view details
- Tap ➕ on other servers to connect or add to favorites

## Responsive Design

### Portrait Mode (Default)
- Single column layout
- Power button centered
- Full server list below

### Landscape Mode (Not yet implemented)
- Would show split view
- Connection status on left
- Server list on right

## Material 3 Features

### Elevation
- Top bar: No elevation (flat)
- Power button: 8dp elevation
- Upgrade banner: 4dp elevation
- Cards: Standard Material 3 elevation

### Ripple Effects
- All interactive elements have ripple feedback
- Color matches theme (green ripples on primary actions)

### Shape System
- Circular: Power button
- Rounded corners (2dp): Network status line
- Default rounded: Upgrade banner

## Typography Hierarchy

### Display (Large Bold)
- App name in top bar (24sp)
- Server name in connection status (20sp)

### Body (Regular)
- Server list items (16sp)
- Subtitles and descriptions (16sp)

### Label (Small)
- Protocol text (11sp)
- Data usage in banner (11sp)

## Accessibility

### Content Descriptions
- Menu icon: "Menu"
- Power button: "Connection button"
- Search icon: "Search"
- All interactive elements properly labeled

### Contrast Ratios
- White text on dark background: 21:1 (excellent)
- Gray text on dark background: 7:1 (good)
- Green on dark background: 5:1 (sufficient for large text)

### Touch Targets
- All buttons minimum 48dp touch target
- Adequate spacing between interactive elements

## Future Enhancements

### Animations (Not yet implemented)
- Power button pulse animation when connecting
- Smooth transitions between connection states
- Server list item expansion
- Shimmer effect while loading servers

### Additional Screens (Planned)
- Settings screen
- Server details screen
- Statistics/usage screen
- Profile/account screen

## Building and Running

To see this UI in action:

1. Open the project in Android Studio
2. Connect an Android device or start an emulator
3. Click Run (Shift+F10)
4. The app will install and launch showing this UI

The UI is fully functional with:
- ✅ Connection toggle (simulated)
- ✅ Server selection
- ✅ Scrollable server list
- ✅ Interactive toolbar buttons
- ✅ Responsive layout

Note: Actual VPN functionality is not yet implemented - this is the UI foundation.
