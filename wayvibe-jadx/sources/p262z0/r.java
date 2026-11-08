package p262z0;

import N8.s;
import java.util.ArrayList;
import p133m0.c;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f29772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f29773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f29775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f29776j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f29777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2444d f29778m;

    public r(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f29767a = j10;
        this.f29768b = j11;
        this.f29769c = j12;
        this.f29770d = z10;
        this.f29771e = f10;
        this.f29772f = j13;
        this.f29773g = j14;
        this.f29774h = z11;
        this.f29775i = i10;
        this.f29776j = j15;
        this.f29777l = 0L;
        C2444d c2444d = new C2444d();
        c2444d.f29735a = z12;
        c2444d.f29736b = z12;
        this.f29778m = c2444d;
    }

    public final void a() {
        C2444d c2444d = this.f29778m;
        c2444d.f29736b = true;
        c2444d.f29735a = true;
    }

    public final boolean b() {
        C2444d c2444d = this.f29778m;
        return c2444d.f29736b || c2444d.f29735a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) q.b(this.f29767a));
        sb.append(", uptimeMillis=");
        sb.append(this.f29768b);
        sb.append(", position=");
        sb.append((Object) c.j(this.f29769c));
        sb.append(", pressed=");
        sb.append(this.f29770d);
        sb.append(", pressure=");
        sb.append(this.f29771e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f29772f);
        sb.append(", previousPosition=");
        sb.append((Object) c.j(this.f29773g));
        sb.append(", previousPressed=");
        sb.append(this.f29774h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i10 = this.f29775i;
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
        sb.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = s.f8650a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) c.j(this.f29776j));
        sb.append(')');
        return sb.toString();
    }

    public r(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, ArrayList arrayList, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, j15);
        this.k = arrayList;
        this.f29777l = j16;
    }
}
