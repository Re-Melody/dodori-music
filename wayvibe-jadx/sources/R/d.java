package R;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p133m0.d f10605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10609e;

    public d(p133m0.d dVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f10605a = dVar;
        this.f10606b = z10;
        this.f10607c = z11;
        this.f10608d = z12;
        this.f10609e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.b(this.f10605a, dVar.f10605a) && this.f10606b == dVar.f10606b && this.f10607c == dVar.f10607c && this.f10608d == dVar.f10608d && this.f10609e == dVar.f10609e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10609e) + p134m1.b.f(p134m1.b.f(p134m1.b.f(this.f10605a.hashCode() * 31, 31, this.f10606b), 31, this.f10607c), 31, this.f10608d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HingeInfo(bounds=");
        sb.append(this.f10605a);
        sb.append(", isFlat=");
        sb.append(this.f10606b);
        sb.append(", isVertical=");
        sb.append(this.f10607c);
        sb.append(", isSeparating=");
        sb.append(this.f10608d);
        sb.append(", isOccluding=");
        return p134m1.b.o(sb, this.f10609e, ')');
    }
}
