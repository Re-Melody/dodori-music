package O;

/* JADX INFO: renamed from: O.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0662o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0661n f8784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0661n f8785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8786c;

    public C0662o(C0661n c0661n, C0661n c0661n2, boolean z10) {
        this.f8784a = c0661n;
        this.f8785b = c0661n2;
        this.f8786c = z10;
    }

    public static C0662o a(C0662o c0662o, C0661n c0661n, C0661n c0661n2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            c0661n = c0662o.f8784a;
        }
        if ((i10 & 2) != 0) {
            c0661n2 = c0662o.f8785b;
        }
        c0662o.getClass();
        return new C0662o(c0661n, c0661n2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0662o)) {
            return false;
        }
        C0662o c0662o = (C0662o) obj;
        return kotlin.jvm.internal.m.b(this.f8784a, c0662o.f8784a) && kotlin.jvm.internal.m.b(this.f8785b, c0662o.f8785b) && this.f8786c == c0662o.f8786c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8786c) + ((this.f8785b.hashCode() + (this.f8784a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f8784a);
        sb.append(", end=");
        sb.append(this.f8785b);
        sb.append(", handlesCrossed=");
        return p134m1.b.o(sb, this.f8786c, ')');
    }
}
