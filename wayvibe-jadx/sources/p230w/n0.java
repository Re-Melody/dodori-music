package p230w;

import C4.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements InterfaceC2292z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f27753c;

    public n0(int i10, A a10, int i11) {
        this(i10, 0, (i11 & 4) != 0 ? B.f27546a : a10);
    }

    @Override // p230w.InterfaceC2280m
    public final q0 a(o0 o0Var) {
        return new f(this.f27751a, this.f27752b, this.f27753c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (n0Var.f27751a == this.f27751a && n0Var.f27752b == this.f27752b && m.b(n0Var.f27753c, this.f27753c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f27753c.hashCode() + (this.f27751a * 31)) * 31) + this.f27752b;
    }

    @Override // p230w.InterfaceC2292z, p230w.InterfaceC2280m
    public final r0 a(o0 o0Var) {
        return new f(this.f27751a, this.f27752b, this.f27753c);
    }

    public n0(int i10, int i11, A a10) {
        this.f27751a = i10;
        this.f27752b = i11;
        this.f27753c = a10;
    }
}
