package p005a1;

import kotlin.jvm.internal.m;
import p143n0.AbstractC2091s;
import p143n0.C2096x;
import p143n0.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f14082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14083b;

    public b(a0 a0Var, float f10) {
        this.f14082a = a0Var;
        this.f14083b = f10;
    }

    @Override // p005a1.n
    public final float a() {
        return this.f14083b;
    }

    @Override // p005a1.n
    public final long b() {
        int i10 = C2096x.f22803n;
        return C2096x.f22802m;
    }

    @Override // p005a1.n
    public final AbstractC2091s c() {
        return this.f14082a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.b(this.f14082a, bVar.f14082a) && Float.compare(this.f14083b, bVar.f14083b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14083b) + (this.f14082a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f14082a);
        sb.append(", alpha=");
        return p134m1.b.l(sb, this.f14083b, ')');
    }
}
