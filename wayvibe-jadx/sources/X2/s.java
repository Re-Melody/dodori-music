package X2;

import B2.AbstractC0111a;
import B2.C;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f13158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f13159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f13160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f13162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f13165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f13166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13167j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f13173q;

    public s(Context context) {
        DisplayManager displayManager;
        g gVar = new g();
        gVar.f13090a = new f();
        gVar.f13091b = new f();
        gVar.f13093d = -9223372036854775807L;
        this.f13158a = gVar;
        q qVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new q(this, displayManager, 0);
        this.f13159b = qVar;
        this.f13160c = qVar != null ? r.f13153e : null;
        this.k = -9223372036854775807L;
        this.f13168l = -9223372036854775807L;
        this.f13163f = -1.0f;
        this.f13166i = 1.0f;
        this.f13167j = 0;
    }

    public static void a(s sVar, Display display) {
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            sVar.k = refreshRate;
            sVar.f13168l = (refreshRate * 80) / 100;
        } else {
            AbstractC0111a.x("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            sVar.k = -9223372036854775807L;
            sVar.f13168l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (C.f560a < 30 || (surface = this.f13162e) == null || this.f13167j == Integer.MIN_VALUE || this.f13165h == 0.0f) {
            return;
        }
        this.f13165h = 0.0f;
        p.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f10;
        float f11;
        if (C.f560a < 30 || this.f13162e == null) {
            return;
        }
        g gVar = this.f13158a;
        if (!gVar.f13090a.a()) {
            f10 = this.f13163f;
        } else if (gVar.f13090a.a()) {
            f fVar = gVar.f13090a;
            long j10 = fVar.f13086e;
            f10 = (float) (1.0E9d / (j10 != 0 ? fVar.f13087f / j10 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.f13164g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (gVar.f13090a.a()) {
                if ((gVar.f13090a.a() ? gVar.f13090a.f13087f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f10 - this.f13164g) < f11) {
                return;
            }
        } else if (f10 == -1.0f && gVar.f13094e < 30) {
            return;
        }
        this.f13164g = f10;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (C.f560a < 30 || (surface = this.f13162e) == null || this.f13167j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f13161d) {
            float f11 = this.f13164g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f13166i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f13165h != f10) {
            this.f13165h = f10;
            p.a(surface, f10);
        }
    }
}
