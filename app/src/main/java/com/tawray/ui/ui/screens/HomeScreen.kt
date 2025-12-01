package com.tawray.ui.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.tawray.ui.R
import com.tawray.ui.data.Server
import com.tawray.ui.data.ServerData
import com.tawray.ui.ui.components.ConnectionStatus
import com.tawray.ui.ui.components.ServerListItem
import com.tawray.ui.ui.components.TopBar
import com.tawray.ui.ui.components.UpgradeBanner
import com.tawray.ui.ui.theme.TextSecondary

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    var isConnected by remember { mutableStateOf(false) }
    var selectedServer by remember { mutableStateOf(ServerData.servers.first()) }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            TopBar(onMenuClick = { /* Handle menu click */ })
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            // Connection Status Section
            item {
                ConnectionStatus(
                    isConnected = isConnected,
                    serverName = selectedServer.name,
                    serverSubtitle = selectedServer.subtitle,
                    protocol = stringResource(R.string.protocol),
                    onConnectionToggle = { isConnected = !isConnected },
                    modifier = Modifier.padding(vertical = 24.dp)
                )
            }

            // Toolbar with icons
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(onClick = { /* Handle shield click */ }) {
                        Icon(
                            imageVector = Icons.Default.Shield,
                            contentDescription = "Shield",
                            tint = TextSecondary,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                    IconButton(onClick = { /* Handle favorite click */ }) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorites",
                            tint = TextSecondary,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                    IconButton(onClick = { /* Handle location click */ }) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Location",
                            tint = TextSecondary,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                    IconButton(onClick = { /* Handle terminal click */ }) {
                        Icon(
                            imageVector = Icons.Default.Terminal,
                            contentDescription = "Terminal",
                            tint = TextSecondary,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            }

            // Divider
            item {
                HorizontalDivider(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                    color = MaterialTheme.colorScheme.surface
                )
            }

            // Server List Header with Search
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "${stringResource(R.string.all_locations)} (${ServerData.servers.size})",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold
                        ),
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    IconButton(onClick = { /* Handle search click */ }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = stringResource(R.string.search_description),
                            tint = TextSecondary
                        )
                    }
                }
            }

            // Server List
            items(ServerData.servers) { server ->
                ServerListItem(
                    server = server,
                    onServerClick = { selectedServer = it }
                )
            }

            // Upgrade Banner
            item {
                Spacer(modifier = Modifier.height(16.dp))
                UpgradeBanner(
                    dataUsed = "11.00",
                    onUpgradeClick = { /* Handle upgrade click */ }
                )
            }
        }
    }
}
