package Q;

import F0.InterfaceC0394l;
import p143n0.C2096x;

/* JADX INFO: renamed from: Q.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0772z0 implements p241x.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10545c;

    public C0772z0(boolean z10, float f10, long j10) {
        this.f10543a = z10;
        this.f10544b = f10;
        this.f10545c = j10;
    }

    @Override // p241x.f0
    public final InterfaceC0394l b(B.l lVar) {
        Q q5 = new Q(this);
        return new T(lVar, this.f10543a, this.f10544b, q5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0772z0)) {
            return false;
        }
        C0772z0 c0772z0 = (C0772z0) obj;
        if (this.f10543a == c0772z0.f10543a && p028c1.e.a(this.f10544b, c0772z0.f10544b)) {
            return C2096x.c(this.f10545c, c0772z0.f10545c);
        }
        return false;
    }

    public final int hashCode() {
        int iB = p134m1.b.b(this.f10544b, Boolean.hashCode(this.f10543a) * 31, 961);
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f10545c) + iB;
    }
}
