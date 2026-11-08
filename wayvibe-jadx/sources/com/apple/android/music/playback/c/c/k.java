package com.apple.android.music.playback.c.c;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class k implements Callable<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f17153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17154c;

    public k(com.apple.android.music.playback.c.d dVar, j jVar, boolean z10) {
        this.f17152a = dVar;
        this.f17153b = jVar;
        this.f17154c = z10;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        Boolean bool = Boolean.FALSE;
        return (this.f17152a.e() && this.f17152a.i()) ? Boolean.valueOf(this.f17153b.a(this.f17154c)) : bool;
    }
}
