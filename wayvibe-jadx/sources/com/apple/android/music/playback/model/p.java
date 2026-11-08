package com.apple.android.music.playback.model;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class p extends IOException {
    public p(PlayerMediaItem playerMediaItem, String str) {
        super("Sinf Extraction Error for item id: " + playerMediaItem.a() + " filePath: " + playerMediaItem.d() + " msg: " + str);
    }
}
