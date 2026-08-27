package com.aurora.bank.core.designsystem.component

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.unit.dp
import com.aurora.bank.core.designsystem.theme.AuroraSizes
import com.aurora.bank.core.designsystem.theme.Spacing

@Composable
fun AuroraButtons(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loading: Boolean = false,
    loadingText: String = text,
) {
    Button(
        onClick = onClick,
        modifier = modifier.heightIn(min = AuroraSizes.buttonHeight),
        enabled = enabled && !loading,
        shape = CircleShape,
    ) {
        ButtonContent(
            text = text,
            loading = loading,
            loadingText = loadingText,
        )
    }
}

@Composable
fun AuroraOutlinedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loading: Boolean = false,
    loadingText: String = text,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier.heightIn(min = AuroraSizes.buttonHeight),
        enabled = enabled && !loading,
        shape = CircleShape,
    ) {
        ButtonContent(
            text = text,
            loading = loading,
            loadingText = loadingText,
        )
    }
}

@Composable
fun AuroraTextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier.heightIn(min = AuroraSizes.buttonHeight),
        enabled = true,
        shape = CircleShape,
    ) {
        Text(text = text)
    }
}

@Composable
fun ButtonContent(text: String, loading: Boolean, loadingText: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Spacing.s),
    ) {
        Text(
            text = if (loading) {
                loadingText
            } else {
                text
            },
        )
        if (loading) {
            CircularProgressIndicator(
                modifier = Modifier.size(SPINNER_SIZE).clearAndSetSemantics {},
                strokeWidth = SPINNER_STROKE,
                color = LocalContentColor.current,
            )
        }
    }
}

private val SPINNER_SIZE = 16.dp
private val SPINNER_STROKE = 2.dp
