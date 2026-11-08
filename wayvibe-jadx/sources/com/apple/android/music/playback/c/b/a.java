package com.apple.android.music.playback.c.b;

import W4.o;
import java.net.CookieManager;
import java.net.CookiePolicy;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.c.a.b f17078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.apple.android.music.playback.c.a.a f17079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f17080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CookieManager f17081e = new CookieManager(null, CookiePolicy.ACCEPT_ORIGINAL_SERVER);

    public a(com.apple.android.music.playback.c.d dVar, com.apple.android.music.playback.c.a.b bVar, com.apple.android.music.playback.c.a.a aVar, o oVar) {
        this.f17077a = dVar;
        this.f17078b = bVar;
        this.f17079c = aVar;
        this.f17080d = oVar;
    }

    public String a() {
        return this.f17077a.v();
    }

    public com.apple.android.music.playback.c.d b() {
        return this.f17077a;
    }
}
