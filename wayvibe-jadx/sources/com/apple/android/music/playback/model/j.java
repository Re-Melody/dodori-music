package com.apple.android.music.playback.model;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends IOException {
    public j(PlayerMediaItem playerMediaItem) {
        super("No asset found for item id: " + playerMediaItem.a());
    }
}
