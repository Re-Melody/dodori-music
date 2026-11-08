package D0;

/* JADX INFO: renamed from: D0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0183i implements InterfaceC0185k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1799a;

    @Override // D0.InterfaceC0185k
    public final long a(long j10, long j11) {
        switch (this.f1799a) {
            case 0:
                float fMax = Math.max(p133m0.f.d(j11) / p133m0.f.d(j10), p133m0.f.b(j11) / p133m0.f.b(j10));
                return g0.b(fMax, fMax);
            case 1:
                float fMin = Math.min(p133m0.f.d(j11) / p133m0.f.d(j10), p133m0.f.b(j11) / p133m0.f.b(j10));
                return g0.b(fMin, fMin);
            default:
                if (p133m0.f.d(j10) <= p133m0.f.d(j11) && p133m0.f.b(j10) <= p133m0.f.b(j11)) {
                    return g0.b(1.0f, 1.0f);
                }
                float fMin2 = Math.min(p133m0.f.d(j11) / p133m0.f.d(j10), p133m0.f.b(j11) / p133m0.f.b(j10));
                return g0.b(fMin2, fMin2);
        }
    }
}
