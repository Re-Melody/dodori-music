package com.apple.android.music.playback.c.c;

import android.util.SparseArray;
import p235w4.B;

/* JADX INFO: loaded from: classes.dex */
final class s implements J4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f17209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.queue.e f17210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<B> f17212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J4.f f17213e;

    public s(l lVar, com.apple.android.music.playback.queue.e eVar, int i10, SparseArray<B> sparseArray, J4.f fVar) {
        this.f17209a = lVar;
        this.f17210b = eVar;
        this.f17211c = i10;
        this.f17212d = sparseArray;
        this.f17213e = fVar;
    }

    @Override // J4.f
    public void a(J4.h hVar, B b10, Object obj) {
        this.f17212d.put(this.f17211c, b10);
        this.f17213e.a(this.f17209a, new m(this.f17210b, this.f17212d), null);
    }
}
