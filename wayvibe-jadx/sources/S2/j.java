package S2;

import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11080j;

    public j(D2.h hVar, D2.k kVar, C2339o c2339o, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, kVar, 1, c2339o, i10, obj, j10, j11);
        c2339o.getClass();
        this.f11080j = j12;
    }

    public long a() {
        long j10 = this.f11080j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
