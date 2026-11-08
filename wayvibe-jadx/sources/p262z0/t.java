package p262z0;

import java.util.ArrayList;
import p133m0.c;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f29787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f29790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f29791j;
    public final long k;

    public t(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j14, long j15) {
        this.f29782a = j10;
        this.f29783b = j11;
        this.f29784c = j12;
        this.f29785d = j13;
        this.f29786e = z10;
        this.f29787f = f10;
        this.f29788g = i10;
        this.f29789h = z11;
        this.f29790i = arrayList;
        this.f29791j = j14;
        this.k = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return q.a(this.f29782a, tVar.f29782a) && this.f29783b == tVar.f29783b && c.b(this.f29784c, tVar.f29784c) && c.b(this.f29785d, tVar.f29785d) && this.f29786e == tVar.f29786e && Float.compare(this.f29787f, tVar.f29787f) == 0 && this.f29788g == tVar.f29788g && this.f29789h == tVar.f29789h && this.f29790i.equals(tVar.f29790i) && c.b(this.f29791j, tVar.f29791j) && c.b(this.k, tVar.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + b.g(this.f29791j, (this.f29790i.hashCode() + b.f(b.c(this.f29788g, b.b(this.f29787f, b.f(b.g(this.f29785d, b.g(this.f29784c, b.g(this.f29783b, Long.hashCode(this.f29782a) * 31, 31), 31), 31), 31, this.f29786e), 31), 31), 31, this.f29789h)) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) q.b(this.f29782a));
        sb.append(", uptime=");
        sb.append(this.f29783b);
        sb.append(", positionOnScreen=");
        sb.append((Object) c.j(this.f29784c));
        sb.append(", position=");
        sb.append((Object) c.j(this.f29785d));
        sb.append(", down=");
        sb.append(this.f29786e);
        sb.append(", pressure=");
        sb.append(this.f29787f);
        sb.append(", type=");
        int i10 = this.f29788g;
        if (i10 == 1) {
            str = "Touch";
        } else if (i10 == 2) {
            str = "Mouse";
        } else if (i10 != 3) {
            str = i10 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb.append((Object) str);
        sb.append(", activeHover=");
        sb.append(this.f29789h);
        sb.append(", historical=");
        sb.append(this.f29790i);
        sb.append(", scrollDelta=");
        sb.append((Object) c.j(this.f29791j));
        sb.append(", originalEventPosition=");
        sb.append((Object) c.j(this.k));
        sb.append(')');
        return sb.toString();
    }
}
