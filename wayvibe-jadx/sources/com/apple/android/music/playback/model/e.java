package com.apple.android.music.playback.model;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17441b;

    public e(int i10, int i11) {
        super(p134m1.b.j(i11, "DRM Error: "));
        this.f17440a = i10;
        this.f17441b = i11;
    }

    public int a() {
        return this.f17440a;
    }

    public int b() {
        return this.f17441b;
    }
}
