package p036d;

import V0.p;
import android.window.BackEvent;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1894b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18976d;

    public C1894b(BackEvent backEvent) {
        C1893a c1893a = C1893a.f18972a;
        float fD = c1893a.d(backEvent);
        float fE = c1893a.e(backEvent);
        float fB = c1893a.b(backEvent);
        int iC = c1893a.c(backEvent);
        this.f18973a = fD;
        this.f18974b = fE;
        this.f18975c = fB;
        this.f18976d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f18973a);
        sb.append(", touchY=");
        sb.append(this.f18974b);
        sb.append(", progress=");
        sb.append(this.f18975c);
        sb.append(", swipeEdge=");
        return p.q(sb, this.f18976d, '}');
    }
}
