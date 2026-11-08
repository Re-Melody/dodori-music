package com.apple.android.music.playback.d;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f17246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f17247b;

    private b(Context context) {
        this.f17247b = context.getSharedPreferences("com.apple.android.music.auth_preferences", 0);
    }

    public static b a(Context context) {
        if (f17246a == null) {
            synchronized (b.class) {
                f17246a = new b(context.getApplicationContext());
            }
        }
        return f17246a;
    }

    public String b() {
        return this.f17247b.getString("user-token", null);
    }

    public void b(String str) {
        this.f17247b.edit().putString("user-token", str).apply();
    }

    public String a() {
        return this.f17247b.getString("developer-token", null);
    }

    public void a(String str) {
        this.f17247b.edit().putString("developer-token", str).apply();
    }
}
