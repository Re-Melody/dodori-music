package p028c1;

import V0.p;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f15853e = new i(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15857d;

    public i(int i10, int i11, int i12, int i13) {
        this.f15854a = i10;
        this.f15855b = i11;
        this.f15856c = i12;
        this.f15857d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15854a == iVar.f15854a && this.f15855b == iVar.f15855b && this.f15856c == iVar.f15856c && this.f15857d == iVar.f15857d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15857d) + b.c(this.f15856c, b.c(this.f15855b, Integer.hashCode(this.f15854a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f15854a);
        sb.append(", ");
        sb.append(this.f15855b);
        sb.append(", ");
        sb.append(this.f15856c);
        sb.append(", ");
        return p.q(sb, this.f15857d, ')');
    }
}
