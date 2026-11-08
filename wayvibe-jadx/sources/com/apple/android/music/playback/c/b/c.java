package com.apple.android.music.playback.c.b;

import W4.o;
import android.net.Uri;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f17095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f17097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f17098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final UUID f17100h = UUID.randomUUID();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CookieManager f17101i = new CookieManager(null, CookiePolicy.ACCEPT_ORIGINAL_SERVER);

    public c(String str, com.apple.android.music.playback.c.d dVar, o oVar, String str2, Uri uri, Uri uri2, boolean z10) {
        this.f17093a = str;
        this.f17094b = dVar;
        this.f17095c = oVar;
        this.f17096d = str2;
        this.f17097e = uri;
        this.f17098f = uri2;
        this.f17099g = z10;
    }

    public W4.c a(int i10) {
        if (i10 != 10001) {
            Objects.toString(this.f17100h);
            return new d(i10, this.f17093a, this.f17094b, this.f17101i, this.f17100h, this.f17095c);
        }
        Objects.toString(this.f17097e);
        Objects.toString(this.f17098f);
        return new b(this.f17094b, i10, this.f17096d, this.f17097e, this.f17098f, this.f17099g);
    }
}
