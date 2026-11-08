package com.apple.android.music.playback.model;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class c extends IOException {
    public c(PlayerMediaItem playerMediaItem, int i10) {
        super("No downloaded asset found for item id: " + playerMediaItem.a() + " protectionType: " + i10 + " filePath: " + playerMediaItem.d());
    }
}
