package org.maplibre.android.location;

import p098j.HandlerC1993f;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f24657b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24660e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24659d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerC1993f f24658c = new HandlerC1993f(this);

    public I(q qVar, z zVar) {
        this.f24657b = qVar;
        this.f24656a = zVar.f24833u;
        this.f24660e = zVar.f24834v;
    }

    public final void a(boolean z10) {
        if (z10 != this.f24659d) {
            this.f24659d = z10;
            if (this.f24656a) {
                this.f24657b.a(z10);
            }
        }
    }
}
