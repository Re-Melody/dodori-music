package p089i1;

import D0.AbstractC0177c;
import D0.L;
import D0.X;
import D7.W;
import android.util.Log;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p011a7.z;
import p028c1.b;
import p100j1.c;
import p150n8.a;
import p174q1.f;
import p174q1.g;
import p174q1.h;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f20461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f20462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f20463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f20464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f20465g;

    public o(b bVar) {
        h hVar = new h(0, 0);
        hVar.f25583n0 = new ArrayList();
        a aVar = new a();
        aVar.f22979a = new ArrayList();
        aVar.f22980b = new p182r1.b();
        aVar.f22981c = hVar;
        hVar.f25584o0 = aVar;
        z zVar = new z();
        zVar.f14290a = true;
        zVar.f14293d = new ArrayList();
        new ArrayList();
        zVar.f14294e = null;
        zVar.f14295f = new p182r1.b();
        zVar.f14296g = new ArrayList();
        zVar.f14291b = hVar;
        zVar.f14292c = hVar;
        hVar.f25585p0 = zVar;
        hVar.f25587r0 = null;
        hVar.f25588s0 = new c();
        hVar.f25589t0 = 0;
        hVar.f25590u0 = 0;
        hVar.f25591v0 = new p174q1.b[4];
        hVar.f25592w0 = new p174q1.b[4];
        hVar.f25593x0 = 257;
        hVar.f25594y0 = null;
        hVar.f25595z0 = null;
        hVar.f25580A0 = null;
        hVar.f25581B0 = null;
        hVar.C0 = new HashSet();
        hVar.f25582D0 = new p182r1.b();
        hVar.f25587r0 = this;
        zVar.f14294e = this;
        this.f20459a = hVar;
        this.f20460b = new LinkedHashMap();
        this.f20461c = new LinkedHashMap();
        this.f20462d = new LinkedHashMap();
        this.f20463e = new q(bVar);
        this.f20464f = new int[2];
        this.f20465g = new int[2];
        new ArrayList();
    }

    public static void c(f fVar, int i10, int i11, int i12, boolean z10, boolean z11, int i13, int[] iArr) {
        int i14 = n.f20458a[fVar.ordinal()];
        if (i14 == 1) {
            iArr[0] = i10;
            iArr[1] = i10;
            return;
        }
        if (i14 == 2) {
            iArr[0] = 0;
            iArr[1] = i13;
            return;
        }
        if (i14 == 3) {
            boolean z12 = z11 || ((i12 == 1 || i12 == 2) && (i12 == 2 || i11 != 1 || z10));
            iArr[0] = z12 ? i10 : 0;
            if (!z12) {
                i10 = i13;
            }
            iArr[1] = i10;
            return;
        }
        if (i14 == 4) {
            iArr[0] = i13;
            iArr[1] = i13;
        } else {
            throw new IllegalStateException((fVar + " is not supported").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00a5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(g gVar, p182r1.b bVar) {
        int i10;
        int i11;
        Integer numValueOf;
        int i12;
        Integer numValueOf2;
        Integer num;
        int iIntValue;
        int i13;
        int i14;
        Integer numValueOf3;
        int iIntValue2;
        boolean z10;
        int iK0;
        char c3;
        Object obj;
        String str = gVar.k;
        LinkedHashMap linkedHashMap = this.f20461c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        f fVar = bVar.f25710a;
        int i15 = bVar.f25712c;
        int i16 = gVar.r;
        int i17 = bVar.f25719j;
        boolean z11 = (numArr != null ? numArr[1].intValue() : 0) == gVar.l();
        boolean zY = gVar.y();
        q qVar = this.f20463e;
        c(fVar, i15, i16, i17, z11, zY, p028c1.a.h(qVar.f20477l), this.f20464f);
        c(bVar.f25711b, bVar.f25713d, gVar.f25572s, bVar.f25719j, (numArr != null ? numArr[0].intValue() : 0) == gVar.o(), gVar.z(), p028c1.a.g(qVar.f20477l), this.f20465g);
        int[] iArr = this.f20464f;
        int i18 = iArr[0];
        int i19 = iArr[1];
        int[] iArr2 = this.f20465g;
        long jA = W.a(i18, i19, iArr2[0], iArr2[1]);
        int i20 = bVar.f25719j;
        if (i20 == 1 || i20 == 2) {
            long jB = b(gVar, jA);
            gVar.f25555g = false;
            i10 = (int) (jB >> 32);
            Integer numValueOf4 = Integer.valueOf(i10);
            i11 = gVar.f25574u;
            numValueOf = Integer.valueOf(i11);
            if (i11 <= 0) {
                numValueOf = null;
            }
            i12 = gVar.f25575v;
            numValueOf2 = Integer.valueOf(i12);
            if (i12 > 0) {
                num = numValueOf2;
            } else {
                num = null;
            }
            iIntValue = ((Number) R3.a.s(numValueOf4, numValueOf, num)).intValue();
            i13 = (int) (jB & 4294967295L);
            Integer numValueOf5 = Integer.valueOf(i13);
            i14 = gVar.f25577x;
            numValueOf3 = Integer.valueOf(i14);
            if (i14 <= 0) {
                numValueOf3 = null;
            }
            int i21 = gVar.f25578y;
            iIntValue2 = ((Number) R3.a.s(numValueOf5, numValueOf3, i21 > 0 ? Integer.valueOf(i21) : null)).intValue();
            if (iIntValue != i10) {
                jA = W.a(iIntValue, iIntValue, p028c1.a.i(jA), p028c1.a.g(jA));
                z10 = true;
            } else {
                z10 = false;
            }
            if (iIntValue2 != i13) {
                jA = W.a(p028c1.a.j(jA), p028c1.a.h(jA), iIntValue2, iIntValue2);
                z10 = true;
            }
            if (z10) {
                b(gVar, jA);
                gVar.f25555g = false;
            }
        } else {
            f fVar2 = bVar.f25710a;
            f fVar3 = f.MATCH_CONSTRAINT;
            if (fVar2 != fVar3 || gVar.r != 0 || bVar.f25711b != fVar3 || gVar.f25572s != 0) {
                long jB2 = b(gVar, jA);
                gVar.f25555g = false;
                i10 = (int) (jB2 >> 32);
                Integer numValueOf6 = Integer.valueOf(i10);
                i11 = gVar.f25574u;
                numValueOf = Integer.valueOf(i11);
                if (i11 <= 0) {
                    numValueOf = null;
                }
                i12 = gVar.f25575v;
                numValueOf2 = Integer.valueOf(i12);
                if (i12 > 0) {
                    num = numValueOf2;
                } else {
                    num = null;
                }
                iIntValue = ((Number) R3.a.s(numValueOf6, numValueOf, num)).intValue();
                i13 = (int) (jB2 & 4294967295L);
                Integer numValueOf7 = Integer.valueOf(i13);
                i14 = gVar.f25577x;
                numValueOf3 = Integer.valueOf(i14);
                if (i14 <= 0) {
                    numValueOf3 = null;
                }
                int i22 = gVar.f25578y;
                iIntValue2 = ((Number) R3.a.s(numValueOf7, numValueOf3, i22 > 0 ? Integer.valueOf(i22) : null)).intValue();
                if (iIntValue != i10) {
                    jA = W.a(iIntValue, iIntValue, p028c1.a.i(jA), p028c1.a.g(jA));
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (iIntValue2 != i13) {
                    jA = W.a(p028c1.a.j(jA), p028c1.a.h(jA), iIntValue2, iIntValue2);
                    z10 = true;
                }
                if (z10) {
                    b(gVar, jA);
                    gVar.f25555g = false;
                }
            }
        }
        X x10 = (X) this.f20460b.get(gVar.f25550d0);
        bVar.f25714e = x10 != null ? x10.f1762a : gVar.o();
        bVar.f25715f = x10 != null ? x10.f1763b : gVar.l();
        if (x10 != null) {
            boolean z12 = qVar.f20476j;
            ArrayList arrayList = qVar.f20475i;
            if (z12) {
                arrayList.clear();
                Iterator it = qVar.f20474h.iterator();
                while (it.hasNext()) {
                    g gVarB = ((p144n1.h) qVar.f20469c.get(it.next())).b();
                    if (gVarB != null) {
                        arrayList.add(gVarB);
                    }
                }
                qVar.f20476j = false;
            }
            if (arrayList.contains(gVar)) {
                iK0 = x10.k0(AbstractC0177c.f1777a);
            } else {
                iK0 = Integer.MIN_VALUE;
            }
        } else {
            iK0 = Integer.MIN_VALUE;
        }
        bVar.f25717h = iK0 != Integer.MIN_VALUE;
        bVar.f25716g = iK0;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            c3 = 0;
            Integer[] numArr2 = {0, 0, Integer.valueOf(MediaPlayerException.ERROR_UNKNOWN)};
            linkedHashMap.put(str, numArr2);
            obj = numArr2;
        } else {
            c3 = 0;
            obj = obj2;
        }
        Integer[] numArr3 = (Integer[]) obj;
        numArr3[c3] = Integer.valueOf(bVar.f25714e);
        numArr3[1] = Integer.valueOf(bVar.f25715f);
        numArr3[2] = Integer.valueOf(bVar.f25716g);
        bVar.f25718i = (bVar.f25714e == bVar.f25712c && bVar.f25715f == bVar.f25713d) ? c3 : 1;
    }

    public final long b(g gVar, long j10) {
        int i10;
        L l10 = gVar.f25550d0;
        String str = gVar.k;
        int i11 = 0;
        if (!(gVar instanceof p174q1.o)) {
            if (l10 != null) {
                X xE = l10.E(j10);
                this.f20460b.put(l10, xE);
                return (((long) xE.f1762a) << 32) | (((long) xE.f1763b) & 4294967295L);
            }
            Log.w("CCL", "Nothing to measure for widget: " + str);
            long j11 = (long) 0;
            return (j11 & 4294967295L) | (j11 << 32);
        }
        if (p028c1.a.f(j10)) {
            i10 = 1073741824;
        } else {
            i10 = p028c1.a.d(j10) ? Integer.MIN_VALUE : 0;
        }
        if (p028c1.a.e(j10)) {
            i11 = 1073741824;
        } else if (p028c1.a.c(j10)) {
            i11 = Integer.MIN_VALUE;
        }
        p174q1.o oVar = (p174q1.o) gVar;
        oVar.P(i10, p028c1.a.h(j10), i11, p028c1.a.g(j10));
        return (((long) oVar.f25650u0) << 32) | (((long) oVar.f25651v0) & 4294967295L);
    }
}
