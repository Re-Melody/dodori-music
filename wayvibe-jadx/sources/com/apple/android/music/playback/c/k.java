package com.apple.android.music.playback.c;

import V0.p;
import android.content.Context;
import android.os.Build;
import java.io.File;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
final class k extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.apple.android.music.playback.d.b f17224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f17225d;

    public k(Context context) {
        super(context);
        this.f17223b = A();
        this.f17224c = com.apple.android.music.playback.d.b.a(context);
    }

    private static String A() {
        return "Music/3.3 Android/" + Build.VERSION.RELEASE + " model/" + B() + " build/" + Build.VERSION.INCREMENTAL;
    }

    private static String B() {
        String str = Build.MANUFACTURER;
        String strN = Build.MODEL;
        if (!strN.startsWith(str)) {
            strN = p.n(str, strN);
        }
        return strN.replace(StringUtils.SPACE, "").replace("-", "");
    }

    @Override // com.apple.android.music.playback.c.a, com.apple.android.music.playback.c.d
    public boolean a() {
        return false;
    }

    @Override // com.apple.android.music.playback.c.a, com.apple.android.music.playback.c.d
    public File c() {
        return null;
    }

    @Override // com.apple.android.music.playback.c.a, com.apple.android.music.playback.c.d
    public boolean e() {
        return true;
    }

    @Override // com.apple.android.music.playback.c.a
    public File n() {
        return new File(this.f17021a.getCacheDir(), "com.apple.android.music");
    }

    @Override // com.apple.android.music.playback.c.d
    public String t() {
        return this.f17224c.b();
    }

    @Override // com.apple.android.music.playback.c.d
    public String u() {
        return this.f17224c.a();
    }

    @Override // com.apple.android.music.playback.c.d
    public String v() {
        return this.f17223b;
    }

    @Override // com.apple.android.music.playback.c.d
    public String w() {
        return "143441-1,31 t:music31";
    }

    @Override // com.apple.android.music.playback.c.d
    public String x() {
        return this.f17225d;
    }

    @Override // com.apple.android.music.playback.c.d
    public String y() {
        return "com.apple.android.music.playback_queue.sqlitedb";
    }

    @Override // com.apple.android.music.playback.c.d
    public String z() {
        return "com.apple.android.music.events.db";
    }

    @Override // com.apple.android.music.playback.c.d
    public void c(String str) {
        this.f17225d = str;
    }
}
