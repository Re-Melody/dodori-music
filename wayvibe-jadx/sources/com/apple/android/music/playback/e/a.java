package com.apple.android.music.playback.e;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f17248a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p256y4.d f17249b;

    public a(int i10) {
        p256y4.d dVar = new p256y4.d(2);
        this.f17249b = dVar;
        dVar.j(i10);
    }

    public void a() {
        this.f17248a.set(false);
        p256y4.d dVar = this.f17249b;
        p256y4.a aVar = dVar.f29073d;
        aVar.f29067a = null;
        aVar.f29068b = null;
        aVar.f29069c = 1;
        dVar.i();
    }

    public boolean b() {
        return this.f17248a.get();
    }

    public p256y4.d c() {
        return this.f17249b;
    }

    public void a(boolean z10) {
        this.f17248a.set(z10);
    }
}
