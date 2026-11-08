package com.apple.android.music.playback.f;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return scheme == null || scheme.isEmpty() || "file".equals(scheme);
    }

    public static boolean b(Uri uri) {
        if (!a(uri)) {
            return false;
        }
        File file = new File(uri.getPath());
        return file.exists() && file.canRead();
    }
}
