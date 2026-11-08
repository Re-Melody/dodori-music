package p230w;

import F.Z;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC2280m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2292z f27557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f27558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27559c;

    public G(InterfaceC2292z interfaceC2292z, S s8, long j10) {
        this.f27557a = interfaceC2292z;
        this.f27558b = s8;
        this.f27559c = j10;
    }

    @Override // p230w.InterfaceC2280m
    public final q0 a(o0 o0Var) {
        r0 r0VarA = this.f27557a.a(o0Var);
        long j10 = this.f27559c;
        S s8 = this.f27558b;
        Z z10 = new Z();
        z10.f3514c = r0VarA;
        z10.f3515d = s8;
        z10.f3512a = ((long) (r0VarA.l() + r0VarA.i())) * 1000000;
        z10.f3513b = j10 * 1000000;
        return z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G) {
            G g3 = (G) obj;
            if (m.b(g3.f27557a, this.f27557a) && g3.f27558b == this.f27558b && g3.f27559c == this.f27559c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27559c) + ((this.f27558b.hashCode() + (this.f27557a.hashCode() * 31)) * 31);
    }
}
