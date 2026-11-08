package O;

/* JADX INFO: renamed from: O.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a1.h f8781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8783c;

    public C0661n(p005a1.h hVar, int i10, long j10) {
        this.f8781a = hVar;
        this.f8782b = i10;
        this.f8783c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0661n)) {
            return false;
        }
        C0661n c0661n = (C0661n) obj;
        return this.f8781a == c0661n.f8781a && this.f8782b == c0661n.f8782b && this.f8783c == c0661n.f8783c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8783c) + p134m1.b.c(this.f8782b, this.f8781a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f8781a + ", offset=" + this.f8782b + ", selectableId=" + this.f8783c + ')';
    }
}
