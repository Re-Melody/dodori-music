package p235w4;

import J4.g;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f28028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f28030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f28033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f28034g;

    public s(B b10, long j10) {
        this(b10, null, new g(0, -1, -1), j10, -9223372036854775807L);
    }

    public final s a(g gVar, long j10, long j11) {
        return new s(this.f28028a, this.f28029b, gVar, j10, j11);
    }

    public final s b(B b10, Object obj) {
        s sVar = new s(b10, obj, this.f28030c, this.f28031d, this.f28032e);
        sVar.f28033f = this.f28033f;
        sVar.f28034g = this.f28034g;
        return sVar;
    }

    public s(B b10, Object obj, g gVar, long j10, long j11) {
        this.f28028a = b10;
        this.f28029b = obj;
        this.f28030c = gVar;
        this.f28031d = j10;
        this.f28032e = j11;
        this.f28033f = j10;
        this.f28034g = j10;
    }
}
