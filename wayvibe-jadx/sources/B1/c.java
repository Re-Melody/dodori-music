package B1;

import V0.p;
import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f531e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f535d;

    public c(int i10, int i11, int i12, int i13) {
        this.f532a = i10;
        this.f533b = i11;
        this.f534c = i12;
        this.f535d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f532a, cVar2.f532a), Math.max(cVar.f533b, cVar2.f533b), Math.max(cVar.f534c, cVar2.f534c), Math.max(cVar.f535d, cVar2.f535d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f531e : new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f532a, this.f533b, this.f534c, this.f535d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f535d == cVar.f535d && this.f532a == cVar.f532a && this.f534c == cVar.f534c && this.f533b == cVar.f533b;
    }

    public final int hashCode() {
        return (((((this.f532a * 31) + this.f533b) * 31) + this.f534c) * 31) + this.f535d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f532a);
        sb.append(", top=");
        sb.append(this.f533b);
        sb.append(", right=");
        sb.append(this.f534c);
        sb.append(", bottom=");
        return p.q(sb, this.f535d, '}');
    }
}
