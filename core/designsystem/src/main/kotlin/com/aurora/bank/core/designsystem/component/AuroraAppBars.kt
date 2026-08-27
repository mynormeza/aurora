package com.aurora.bank.core.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuroraTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    onBack: (() -> Unit)? = null,
    @DrawableRes backIcon: Int? = null,
    backContentDescription: String? = null,
    actions: @Composable () -> Unit = {},
) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(text = title, maxLines = 1, overflow = TextOverflow.Ellipsis)
        },
        navigationIcon = {
            if (onBack != null && backIcon != null) {
                IconButton(onClick = onBack) {
                    AuroraIcon(
                        id = backIcon,
                        contentDescription = backContentDescription,

                    )
                }
            }
        },
        actions = {
            actions()
        },
    )
}
