package com.aurora.bank.core.designsystem.component

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.aurora.bank.core.designsystem.theme.AuroraSizes
import com.aurora.bank.core.designsystem.theme.Spacing

@Composable
fun AuroraSkeletonBlock(
    modifier: Modifier = Modifier,
    height: Dp = BLOCK_HEIGHT,
    width: Dp? = null,
    reduceMotion: Boolean = false,
) {
    val sized = if (width != null) {
        modifier.width(width)
    } else {
        modifier.fillMaxWidth()
    }

    Box(
        modifier = sized.height(height)
            .clip(MaterialTheme.shapes.extraSmall)
            .alpha(shimmerAlpha(reduceMotion))
            .background(color = MaterialTheme.colorScheme.surfaceContainerHighest)
            .clearAndSetSemantics {},
    )
}

@Composable
fun AuroraSkeletonCircle(
    diameter: Dp,
    modifier: Modifier = Modifier,
    reducedMotion: Boolean = false,
) {
    Box(
        modifier = modifier
            .size(diameter)
            .clip(CircleShape)
            .alpha(shimmerAlpha(reducedMotion))
            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
            .clearAndSetSemantics { },
    )
}

@Composable
fun AuroraTransactionRowSkeleton(modifier: Modifier = Modifier, reduceMotion: Boolean = false) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(AuroraSizes.listRowMinHeight)
            .padding(horizontal = Spacing.screen, vertical = Spacing.m)
            .clearAndSetSemantics {},
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Spacing.m),
    ) {
        Box(
            modifier = Modifier.size(AVATAR)
                .clip(CircleShape)
                .alpha(shimmerAlpha(reduceMotion))
                .background(color = MaterialTheme.colorScheme.surfaceContainerHighest),
        )
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(Spacing.s),
        ) {
            AuroraSkeletonBlock(width = TITLE_WIDTH, reduceMotion = reduceMotion)
            AuroraSkeletonBlock(
                width = SUBTITLE_WIDTH,
                height = SMALL_BLOCK,
                reduceMotion = reduceMotion,
            )
            AuroraSkeletonBlock(
                width = AMOUNT_WIDTH,
                reduceMotion = reduceMotion,
            )
        }
    }
}

@Composable
fun shimmerAlpha(reducedMotion: Boolean): Float {
    if (reducedMotion) return MID_TONE_ALPHA
    val transition = rememberInfiniteTransition(label = "skeleton")
    val alpha by transition.animateFloat(
        initialValue = MIN_ALPHA,
        targetValue = MAX_ALPHA,
        animationSpec = infiniteRepeatable(
            animation = tween(SHIMMER_MILLIS, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "skeletonAlpha",
    )
    return alpha
}

private const val SHIMMER_MILLIS = 1400
private const val MIN_ALPHA = 0.4f
private const val MAX_ALPHA = 1f
private const val MID_TONE_ALPHA = 0.7f

private val BLOCK_HEIGHT = 16.dp
private val SMALL_BLOCK = 12.dp
private val AVATAR = 40.dp
private val TITLE_WIDTH = 140.dp
private val SUBTITLE_WIDTH = 96.dp
private val AMOUNT_WIDTH = 72.dp
