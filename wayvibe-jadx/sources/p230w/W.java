package p230w;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC2280m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f27604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27605b;

    public W(C c3, long j10) {
        this.f27604a = c3;
        this.f27605b = j10;
    }

    @Override // p230w.InterfaceC2280m
    public final q0 a(o0 o0Var) {
        return new X(this.f27604a.a(o0Var), this.f27605b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return w10.f27605b == this.f27605b && m.b(w10.f27604a, this.f27604a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f27605b) + (this.f27604a.hashCode() * 31);
    }
}
