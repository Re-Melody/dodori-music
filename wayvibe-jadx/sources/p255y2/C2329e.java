package p255y2;

import B2.C;
import android.media.AudioAttributes;
import org.maplibre.android.location.v;
import p134m1.b;

/* JADX INFO: renamed from: y2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2329e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2329e f28869e = new C2329e(0, 0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f28873d;

    static {
        b.y(0, 1, 2, 3, 4);
    }

    public C2329e(int i10, int i11, int i12) {
        this.f28870a = i10;
        this.f28871b = i11;
        this.f28872c = i12;
    }

    public final v a() {
        if (this.f28873d == null) {
            v vVar = new v();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f28870a).setFlags(this.f28871b).setUsage(this.f28872c);
            int i10 = C.f560a;
            if (i10 >= 29) {
                AbstractC2327c.a(usage, 1);
            }
            if (i10 >= 32) {
                AbstractC2328d.a(usage, 0);
            }
            vVar.f24715a = usage.build();
            this.f28873d = vVar;
        }
        return this.f28873d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2329e.class != obj.getClass()) {
            return false;
        }
        C2329e c2329e = (C2329e) obj;
        return this.f28870a == c2329e.f28870a && this.f28871b == c2329e.f28871b && this.f28872c == c2329e.f28872c;
    }

    public final int hashCode() {
        return (((((((527 + this.f28870a) * 31) + this.f28871b) * 31) + this.f28872c) * 31) + 1) * 31;
    }
}
