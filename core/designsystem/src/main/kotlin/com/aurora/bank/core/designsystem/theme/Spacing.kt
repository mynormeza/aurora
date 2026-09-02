package com.aurora.bank.core.designsystem.theme

import androidx.compose.ui.unit.dp

object Spacing {
    val xs = 4.dp

    val s = 8.dp

    val m = 12.dp

    val l = 16.dp

    val xl = 24.dp

    val xxl = 32.dp

    val xxxl = 48.dp

    val screen = 16.dp
}

object AuroraSizes {
    val minTouchTarget = 48.dp
    val minTouchSpacing = 8.dp
    val buttonHeight = 48.dp
    val listRowMinHeight = 64.dp
    val quickActionTile = 56.dp
    val keypadKey = 72.dp
    val referenceWidth = 412.dp

    /** L1's 44 dp aurora-gradient brand tile (rev 3 · A-021). */
    val logoMark = 44.dp

    /** O1's larger 52 dp welcome tile — the frames draw the two sizes apart. */
    val welcomeLogoMark = 52.dp

    /** L1's 96 dp fingerprint circle and the 46 dp glyph inside it. */
    val biometricHalo = 96.dp
    val biometricGlyph = 46.dp

    /** O3's 64 dp section icon circle and the 40 dp inline-row ones. */
    val sectionIconHalo = 64.dp
    val inlineIconHalo = 40.dp

    /** S8's settings rows: 52 dp visual min-height (touch floor still 48) and
     *  the 20 dp radio control circle (S-038). */
    val settingsRowMinHeight = 52.dp
    val controlDiameter = 20.dp

    /** O1B/O1C's floating kit-illustration card width cap (rev 4 · S-038). */
    val welcomeIllustrationMaxWidth = 300.dp
}
