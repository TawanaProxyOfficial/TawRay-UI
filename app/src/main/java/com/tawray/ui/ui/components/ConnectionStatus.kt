package com.tawray.ui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PowerSettingsNew
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tawray.ui.R
import com.tawray.ui.ui.theme.PrimaryGreen
import com.tawray.ui.ui.theme.TextSecondary

@Composable
fun ConnectionStatus(
    isConnected: Boolean,
    serverName: String,
    serverSubtitle: String,
    protocol: String,
    onConnectionToggle: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Status indicator and text
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(if (isConnected) PrimaryGreen else TextSecondary)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = if (isConnected) stringResource(R.string.connected) else stringResource(R.string.disconnected),
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Medium
                ),
                color = if (isConnected) PrimaryGreen else TextSecondary
            )
        }

        // Protocol
        Text(
            text = protocol,
            style = MaterialTheme.typography.bodySmall,
            color = TextSecondary,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        // Server name
        Text(
            text = serverName,
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            ),
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(bottom = 2.dp)
        )

        // Server subtitle
        Text(
            text = serverSubtitle,
            style = MaterialTheme.typography.bodyMedium,
            color = TextSecondary,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        // Power button
        Surface(
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 16.dp),
            shape = CircleShape,
            color = if (isConnected) PrimaryGreen else MaterialTheme.colorScheme.surface,
            onClick = onConnectionToggle,
            shadowElevation = 8.dp
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.PowerSettingsNew,
                    contentDescription = stringResource(R.string.connection_button_description),
                    modifier = Modifier.size(48.dp),
                    tint = if (isConnected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface
                )
            }
        }

        // Network status indicator
        Surface(
            modifier = Modifier
                .padding(horizontal = 32.dp)
                .height(4.dp)
                .fillMaxWidth(0.6f),
            shape = RoundedCornerShape(2.dp),
            color = if (isConnected) PrimaryGreen else TextSecondary
        ) {}
    }
}
