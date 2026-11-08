package com.apple.android.music.playback.model;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class d extends IOException {
    public d(PlayerMediaItem playerMediaItem, int i10) {
        super("Can't read downloaded asset with item id: " + playerMediaItem.a() + " protectionType: " + i10 + " filePath: " + playerMediaItem.d());
    }
}
