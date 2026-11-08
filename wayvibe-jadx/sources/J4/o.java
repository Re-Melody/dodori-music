package J4;

import p235w4.A;
import p235w4.B;
import p235w4.z;

/* JADX INFO: loaded from: classes.dex */
public final class o extends B {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f6640j = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6646i;

    public o(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11) {
        this.f6641d = j12;
        this.f6642e = j13;
        this.f6643f = j14;
        this.f6644g = j15;
        this.f6645h = z10;
        this.f6646i = z11;
    }

    @Override // p235w4.B
    public final int a() {
        return 1;
    }

    @Override // p235w4.B
    public final int b() {
        return 1;
    }

    @Override // p235w4.B
    public final A a(int i10, A a10, boolean z10, long j10) {
        X4.a.h(i10, 1);
        Object obj = z10 ? f6640j : null;
        long j11 = this.f6642e;
        long j12 = this.f6644g;
        boolean z11 = this.f6646i;
        if (z11) {
            j12 += j10;
            if (j12 > j11) {
                j12 = -9223372036854775807L;
            }
        }
        a10.f27886a = obj;
        a10.f27887b = this.f6645h;
        a10.f27888c = z11;
        a10.f27891f = j12;
        a10.f27892g = j11;
        a10.f27889d = 0;
        a10.f27890e = 0;
        a10.f27893h = this.f6643f;
        return a10;
    }

    @Override // p235w4.B
    public final z a(int i10, z zVar, boolean z10) {
        X4.a.h(i10, 1);
        Object obj = z10 ? f6640j : null;
        long j10 = -this.f6643f;
        zVar.f28039a = obj;
        zVar.f28040b = obj;
        zVar.f28041c = 0;
        zVar.f28042d = this.f6641d;
        zVar.f28043e = j10;
        return zVar;
    }

    @Override // p235w4.B
    public final int a(Object obj) {
        return f6640j.equals(obj) ? 0 : -1;
    }
}
