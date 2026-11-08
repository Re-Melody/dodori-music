package io.flutter.view;

import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum k {
    HAS_CHECKED_STATE(1),
    IS_CHECKED(2),
    IS_SELECTED(4),
    IS_BUTTON(8),
    IS_TEXT_FIELD(16),
    IS_FOCUSED(32),
    HAS_ENABLED_STATE(64),
    IS_ENABLED(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD),
    IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
    IS_HEADER(512),
    IS_OBSCURED(1024),
    SCOPES_ROUTE(2048),
    NAMES_ROUTE(4096),
    IS_HIDDEN(8192),
    IS_IMAGE(16384),
    IS_LIVE_REGION(32768),
    HAS_TOGGLED_STATE(ETagPayloadStore.CHUNK_CHARS),
    IS_TOGGLED(131072),
    HAS_IMPLICIT_SCROLLING(ETagPayloadStore.WRITE_BUFFER_BYTES),
    IS_MULTILINE(524288),
    IS_READ_ONLY(1048576),
    IS_FOCUSABLE(2097152),
    IS_LINK(4194304),
    IS_SLIDER(8388608),
    IS_KEYBOARD_KEY(16777216),
    IS_CHECK_STATE_MIXED(33554432),
    HAS_EXPANDED_STATE(67108864),
    IS_EXPANDED(134217728),
    HAS_SELECTED_STATE(268435456),
    HAS_REQUIRED_STATE(536870912),
    IS_REQUIRED(1073741824),
    IS_ACCESSIBILITY_FOCUS_BLOCKED(MediaPlayerException.ERROR_UNKNOWN);

    final int value;

    k(int i10) {
        this.value = i10;
    }
}
