package io.flutter.view;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum h {
    ACCESSIBLE_NAVIGATION(1),
    INVERT_COLORS(2),
    DISABLE_ANIMATIONS(4),
    BOLD_TEXT(8),
    REDUCE_MOTION(16),
    HIGH_CONTRAST(32),
    ON_OFF_SWITCH_LABELS(64),
    NO_ANNOUNCE(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);

    final int value;

    h(int i10) {
        this.value = i10;
    }
}
