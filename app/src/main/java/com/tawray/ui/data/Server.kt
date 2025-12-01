package com.tawray.ui.data

data class Server(
    val name: String,
    val flag: String,
    val isBestLocation: Boolean = false,
    val subtitle: String = ""
)

object ServerData {
    val servers = listOf(
        Server(
            name = "Best Location",
            flag = "🌍",
            isBestLocation = true,
            subtitle = "Automatic"
        ),
        Server(
            name = "US Central",
            flag = "🇺🇸",
            subtitle = "Chicago"
        ),
        Server(
            name = "US East",
            flag = "🇺🇸",
            subtitle = "New York"
        ),
        Server(
            name = "US West",
            flag = "🇺🇸",
            subtitle = "Los Angeles"
        ),
        Server(
            name = "Canada East",
            flag = "🇨🇦",
            subtitle = "Toronto"
        ),
        Server(
            name = "Canada West",
            flag = "🇨🇦",
            subtitle = "Vancouver"
        ),
        Server(
            name = "Austria",
            flag = "🇦🇹",
            subtitle = "Vienna"
        ),
        Server(
            name = "Belgium",
            flag = "🇧🇪",
            subtitle = "Brussels"
        ),
        Server(
            name = "France",
            flag = "🇫🇷",
            subtitle = "Paris"
        ),
        Server(
            name = "Germany",
            flag = "🇩🇪",
            subtitle = "Frankfurt"
        )
    )
}
