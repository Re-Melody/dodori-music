package com.apple.android.music.playback.c;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.apple.android.music.foothill.javanative.FootHillConfig;

/* JADX INFO: loaded from: classes.dex */
class g {
    public static void a(Context context) {
        String str = Build.VERSION.CODENAME;
        FootHillConfig.config(Settings.Secure.getString(context.getContentResolver(), "android_id"));
    }
}
