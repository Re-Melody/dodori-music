package G2;

import B2.C;
import R2.D;
import java.util.HashMap;
import java.util.Random;
import p255y2.M;
import p255y2.N;
import p255y2.O;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f5388h = new b(25);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f5389i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f5393d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5395f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f5390a = new N();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f5391b = new M();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5392c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public O f5394e = O.f28801a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5396g = -1;

    public final void a(g gVar) {
        long j10 = gVar.f5383c;
        if (j10 != -1) {
            this.f5396g = j10;
        }
        this.f5395f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final g b(int i10, D d10) {
        long j10;
        long j11;
        HashMap map = this.f5392c;
        g gVar = null;
        long j12 = Long.MAX_VALUE;
        for (g gVar2 : map.values()) {
            if (gVar2.f5383c == -1 && i10 == gVar2.f5382b && d10 != null) {
                h hVar = gVar2.f5387g;
                g gVar3 = (g) hVar.f5392c.get(hVar.f5395f);
                if (gVar3 != null) {
                    j11 = gVar3.f5383c;
                    if (j11 == -1) {
                        j11 = 1 + hVar.f5396g;
                    }
                } else {
                    j11 = 1 + hVar.f5396g;
                }
                long j13 = d10.f10654d;
                if (j13 >= j11) {
                    gVar2.f5383c = j13;
                }
            }
            D d11 = gVar2.f5384d;
            if (d10 != null) {
                long j14 = d10.f10654d;
                if (d11 == null) {
                    if (!d10.b() && j14 == gVar2.f5383c) {
                        j10 = gVar2.f5383c;
                        if (j10 != -1) {
                        }
                        gVar = gVar2;
                        j12 = j10;
                    }
                } else if (j14 == d11.f10654d && d10.f10652b == d11.f10652b && d10.f10653c == d11.f10653c) {
                    j10 = gVar2.f5383c;
                    if (j10 != -1) {
                    }
                    gVar = gVar2;
                    j12 = j10;
                }
            } else if (i10 == gVar2.f5382b) {
                j10 = gVar2.f5383c;
                if (j10 != -1 || j10 < j12) {
                    gVar = gVar2;
                    j12 = j10;
                } else if (j10 == j12) {
                    int i11 = C.f560a;
                    if (gVar.f5384d != null && d11 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str = (String) f5388h.get();
        g gVar4 = new g(this, str, i10, d10);
        map.put(str, gVar4);
        return gVar4;
    }

    public final synchronized String c(O o10, D d10) {
        return b(o10.g(d10.f10651a, this.f5391b).f28780c, d10).f5381a;
    }

    public final void d(a aVar) {
        D d10;
        boolean zP = aVar.f5352b.p();
        HashMap map = this.f5392c;
        if (zP) {
            String str = this.f5395f;
            if (str != null) {
                g gVar = (g) map.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) map.get(this.f5395f);
        int i10 = aVar.f5353c;
        D d11 = aVar.f5354d;
        this.f5395f = b(i10, d11).f5381a;
        e(aVar);
        if (d11 == null || !d11.b()) {
            return;
        }
        long j10 = d11.f10654d;
        if (gVar2 != null && gVar2.f5383c == j10 && (d10 = gVar2.f5384d) != null && d10.f10652b == d11.f10652b && d10.f10653c == d11.f10653c) {
            return;
        }
        b(i10, new D(j10, d11.f10651a));
        this.f5393d.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    public final synchronized void e(a aVar) {
        long j10;
        this.f5393d.getClass();
        if (aVar.f5352b.p()) {
            return;
        }
        D d10 = aVar.f5354d;
        if (d10 != null) {
            long j11 = d10.f10654d;
            g gVar = (g) this.f5392c.get(this.f5395f);
            if (gVar != null) {
                j10 = gVar.f5383c;
                if (j10 == -1) {
                    j10 = this.f5396g + 1;
                }
            } else {
                j10 = this.f5396g + 1;
            }
            if (j11 < j10) {
                return;
            }
            g gVar2 = (g) this.f5392c.get(this.f5395f);
            if (gVar2 != null && gVar2.f5383c == -1 && gVar2.f5382b != aVar.f5353c) {
                return;
            }
        }
        g gVarB = b(aVar.f5353c, aVar.f5354d);
        if (this.f5395f == null) {
            this.f5395f = gVarB.f5381a;
        }
        D d11 = aVar.f5354d;
        if (d11 != null && d11.b()) {
            D d12 = aVar.f5354d;
            g gVarB2 = b(aVar.f5353c, new D(d12.f10651a, d12.f10654d, d12.f10652b));
            if (!gVarB2.f5385e) {
                gVarB2.f5385e = true;
                aVar.f5352b.g(aVar.f5354d.f10651a, this.f5391b);
                this.f5391b.d(aVar.f5354d.f10652b);
                Math.max(0L, C.T(0L) + C.T(this.f5391b.f28782e));
                this.f5393d.getClass();
            }
        }
        if (!gVarB.f5385e) {
            gVarB.f5385e = true;
            this.f5393d.getClass();
        }
        if (gVarB.f5381a.equals(this.f5395f) && !gVarB.f5386f) {
            gVarB.f5386f = true;
            k kVar = this.f5393d;
            String str = gVarB.f5381a;
            kVar.getClass();
            D d13 = aVar.f5354d;
            if (d13 == null || !d13.b()) {
                kVar.b();
                kVar.f5406i = str;
                kVar.f5407j = j.f().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
                kVar.c(aVar.f5352b, aVar.f5354d);
            }
        }
    }
}
