package p143n0;

import B2.s;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends AbstractC2091s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22763a;

    public e0(long j10) {
        this.f22763a = j10;
    }

    @Override // p143n0.AbstractC2091s
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public final void mo913applyToPq9zytI(long j10, S s8, float f10) {
        s sVar = (s) s8;
        sVar.j(1.0f);
        long jB = this.f22763a;
        if (f10 != 1.0f) {
            jB = C2096x.b(C2096x.d(jB) * f10, jB);
        }
        sVar.l(jB);
        if (((Shader) sVar.f620c) != null) {
            sVar.o(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return C2096x.c(this.f22763a, ((e0) obj).f22763a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f22763a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C2096x.i(this.f22763a)) + ')';
    }
}
