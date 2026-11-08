package F2;

import B2.AbstractC0111a;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: F2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0417j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V2.e f4166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f4174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4175j;

    public C0417j(V2.e eVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15) {
        a("bufferForPlaybackMs", i12, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i13, 0, "0");
        a("minBufferMs", i10, i12, "bufferForPlaybackMs");
        a("minBufferMs", i10, i13, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i11, i10, "minBufferMs");
        a("backBufferDurationMs", i15, 0, "0");
        this.f4166a = eVar;
        this.f4167b = B2.C.I(i10);
        this.f4168c = B2.C.I(i11);
        this.f4169d = B2.C.I(i12);
        this.f4170e = B2.C.I(i13);
        this.f4171f = i14;
        this.f4172g = z10;
        this.f4173h = B2.C.I(i15);
        this.f4174i = new HashMap();
        this.f4175j = -1L;
    }

    public static void a(String str, int i10, int i11, String str2) {
        AbstractC0111a.c(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final int b() {
        Iterator it = this.f4174i.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((C0416i) it.next()).f4159b;
        }
        return i10;
    }

    public final boolean c(M m8) {
        int i10;
        C0416i c0416i = (C0416i) this.f4174i.get(m8.f3977a);
        c0416i.getClass();
        V2.e eVar = this.f4166a;
        synchronized (eVar) {
            i10 = eVar.f12487d * eVar.f12485b;
        }
        boolean z10 = true;
        boolean z11 = i10 >= b();
        float f10 = m8.f3979c;
        long j10 = this.f4168c;
        long jMin = this.f4167b;
        if (f10 > 1.0f) {
            jMin = Math.min(B2.C.w(f10, jMin), j10);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = m8.f3978b;
        if (j11 < jMax) {
            if (!this.f4172g && z11) {
                z10 = false;
            }
            c0416i.f4158a = z10;
            if (!z10 && j11 < 500000) {
                AbstractC0111a.x("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || z11) {
            c0416i.f4158a = false;
        }
        return c0416i.f4158a;
    }

    public final void d() {
        if (!this.f4174i.isEmpty()) {
            this.f4166a.a(b());
            return;
        }
        V2.e eVar = this.f4166a;
        synchronized (eVar) {
            if (eVar.f12484a) {
                eVar.a(0);
            }
        }
    }
}
