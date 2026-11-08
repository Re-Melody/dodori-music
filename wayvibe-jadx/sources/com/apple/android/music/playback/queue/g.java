package com.apple.android.music.playback.queue;

/* JADX INFO: loaded from: classes.dex */
final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17541b;

    public g(int i10) {
        this(0, i10);
    }

    @Override // com.apple.android.music.playback.queue.c
    public int a() {
        int i10 = this.f17540a;
        if (i10 <= 0) {
            return -1;
        }
        this.f17540a = i10 - 1;
        int i11 = this.f17541b;
        this.f17541b = i11 + 1;
        return i11;
    }

    public g(int i10, int i11) {
        this.f17541b = i10;
        this.f17540a = i11;
    }
}
