package D2;

import A6.W;
import B2.AbstractC0111a;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: D2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0202c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1844b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f1846d;

    public AbstractC0202c(boolean z10) {
        this.f1843a = z10;
    }

    public final void a(int i10) {
        k kVar = this.f1846d;
        int i11 = B2.C.f560a;
        for (int i12 = 0; i12 < this.f1845c; i12++) {
            B b10 = (B) this.f1844b.get(i12);
            boolean z10 = this.f1843a;
            V2.g gVar = (V2.g) b10;
            synchronized (gVar) {
                W w10 = V2.g.f12491n;
                if (z10 && (kVar.f1872h & 8) != 8) {
                    gVar.f12504h += (long) i10;
                }
            }
        }
    }

    public final void b() {
        k kVar = this.f1846d;
        int i10 = B2.C.f560a;
        for (int i11 = 0; i11 < this.f1845c; i11++) {
            B b10 = (B) this.f1844b.get(i11);
            boolean z10 = this.f1843a;
            V2.g gVar = (V2.g) b10;
            synchronized (gVar) {
                try {
                    W w10 = V2.g.f12491n;
                    if (z10 && (kVar.f1872h & 8) != 8) {
                        AbstractC0111a.h(gVar.f12502f > 0);
                        gVar.f12499c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (jElapsedRealtime - gVar.f12503g);
                        gVar.f12505i += (long) i12;
                        long j10 = gVar.f12506j;
                        long j11 = gVar.f12504h;
                        gVar.f12506j = j10 + j11;
                        if (i12 > 0) {
                            gVar.f12501e.a((j11 * 8000.0f) / i12, (int) Math.sqrt(j11));
                            if (gVar.f12505i >= 2000 || gVar.f12506j >= 524288) {
                                gVar.k = (long) gVar.f12501e.b();
                            }
                            gVar.b(i12, gVar.f12504h, gVar.k);
                            gVar.f12503g = jElapsedRealtime;
                            gVar.f12504h = 0L;
                        }
                        gVar.f12502f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f1846d = null;
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f1845c; i10++) {
            ((B) this.f1844b.get(i10)).getClass();
        }
    }

    public final void e(k kVar) {
        this.f1846d = kVar;
        for (int i10 = 0; i10 < this.f1845c; i10++) {
            B b10 = (B) this.f1844b.get(i10);
            boolean z10 = this.f1843a;
            V2.g gVar = (V2.g) b10;
            synchronized (gVar) {
                try {
                    W w10 = V2.g.f12491n;
                    if (z10 && (kVar.f1872h & 8) != 8) {
                        if (gVar.f12502f == 0) {
                            gVar.f12499c.getClass();
                            gVar.f12503g = SystemClock.elapsedRealtime();
                        }
                        gVar.f12502f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // D2.h
    public final void r(B b10) {
        b10.getClass();
        ArrayList arrayList = this.f1844b;
        if (arrayList.contains(b10)) {
            return;
        }
        arrayList.add(b10);
        this.f1845c++;
    }
}
