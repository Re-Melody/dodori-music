package com.apple.android.music.renderer.a;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f17649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f17650b = null;

    private b() {
    }

    public static b a() {
        synchronized (b.class) {
            try {
                if (f17649a == null) {
                    f17649a = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f17649a;
    }

    public a b() {
        a aVar;
        synchronized (b.class) {
            aVar = this.f17650b;
        }
        return aVar;
    }

    public a a(com.apple.android.music.playback.e.a.b bVar, Context context) {
        a aVar;
        synchronized (b.class) {
            try {
                if (this.f17650b == null) {
                    this.f17650b = new a(bVar, context);
                }
                aVar = this.f17650b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public a a(UUID uuid) {
        a aVar;
        synchronized (b.class) {
            try {
                a aVar2 = this.f17650b;
                if (aVar2 != null && !aVar2.d() && !this.f17650b.a().equals(uuid)) {
                    new IllegalArgumentException("Invalid audioSession id");
                }
                aVar = this.f17650b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
