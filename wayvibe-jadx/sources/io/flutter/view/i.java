package io.flutter.view;

import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum i {
    TAP(1),
    LONG_PRESS(2),
    SCROLL_LEFT(4),
    SCROLL_RIGHT(8),
    SCROLL_UP(16),
    SCROLL_DOWN(32),
    INCREASE(64),
    DECREASE(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD),
    SHOW_ON_SCREEN(256),
    MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
    MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
    SET_SELECTION(2048),
    COPY(4096),
    CUT(8192),
    PASTE(16384),
    DID_GAIN_ACCESSIBILITY_FOCUS(32768),
    DID_LOSE_ACCESSIBILITY_FOCUS(ETagPayloadStore.CHUNK_CHARS),
    CUSTOM_ACTION(131072),
    DISMISS(ETagPayloadStore.WRITE_BUFFER_BYTES),
    MOVE_CURSOR_FORWARD_BY_WORD(524288),
    MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
    SET_TEXT(2097152),
    FOCUS(4194304),
    SCROLL_TO_OFFSET(8388608),
    EXPAND(16777216),
    COLLAPSE(33554432);

    public final int value;

    i(int i10) {
        this.value = i10;
    }
}
