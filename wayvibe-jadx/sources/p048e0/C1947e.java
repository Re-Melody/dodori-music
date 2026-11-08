package p048e0;

import M8.l;
import N8.n;
import N8.s;
import U.C0880d;
import W.f;
import Z8.c;
import Z8.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.m;
import p199t.B;
import p199t.F;

/* JADX INFO: renamed from: e0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1947e extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f19475n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f19476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f19477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B f19479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f19480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f19481j;
    public int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19483m;

    public C1947e(int i10, m mVar, c cVar, c cVar2) {
        super(i10, mVar);
        this.f19476e = cVar;
        this.f19477f = cVar2;
        this.f19481j = m.f19501e;
        this.k = f19475n;
        this.f19482l = 1;
    }

    public void A(B b10) {
        this.f19479h = b10;
    }

    public C1947e B(c cVar, c cVar2) throws Throwable {
        if (this.f19492c) {
            C0880d.T("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f19483m && this.f19493d < 0) {
            C0880d.U("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = o.f19510b;
        synchronized (obj) {
            try {
                int i10 = o.f19512d;
                o.f19512d = i10 + 1;
                o.f19511c = o.f19511c.i(i10);
                m mVarE = e();
                r(mVarE.i(i10));
                try {
                    C1948f c1948f = new C1948f(i10, o.e(mVarE, d() + 1, i10), o.l(true, cVar, f()), o.b(cVar2, i()), this);
                    if (this.f19483m || this.f19492c) {
                        return c1948f;
                    }
                    int iD = d();
                    synchronized (obj) {
                        int i11 = o.f19512d;
                        o.f19512d = i11 + 1;
                        q(i11);
                        o.f19511c = o.f19511c.i(d());
                    }
                    r(o.e(e(), iD + 1, d()));
                    return c1948f;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p048e0.i
    public final void b() {
        o.f19511c = o.f19511c.c(d()).a(this.f19481j);
    }

    @Override // p048e0.i
    public void c() {
        if (this.f19492c) {
            return;
        }
        this.f19492c = true;
        synchronized (o.f19510b) {
            int i10 = this.f19493d;
            if (i10 >= 0) {
                o.u(i10);
                this.f19493d = -1;
            }
        }
        l();
    }

    @Override // p048e0.i
    public boolean g() {
        return false;
    }

    @Override // p048e0.i
    public int h() {
        return this.f19478g;
    }

    @Override // p048e0.i
    public c i() {
        return this.f19477f;
    }

    @Override // p048e0.i
    public void k() {
        this.f19482l++;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[LOOP:0: B:19:0x0030->B:36:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[EDGE_INSN: B:44:0x0088->B:39:0x0088 BREAK  A[LOOP:0: B:19:0x0030->B:36:0x007f], SYNTHETIC] */
    @Override // p048e0.i
    public void l() {
        int i10 = this.f19482l;
        if (!(i10 > 0)) {
            C0880d.T("no pending nested snapshots");
            throw null;
        }
        int i11 = i10 - 1;
        this.f19482l = i11;
        if (i11 != 0 || this.f19483m) {
            return;
        }
        B bW = w();
        if (bW != null) {
            if (this.f19483m) {
                C0880d.U("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int iD = d();
            Object[] objArr = bW.f26258b;
            long[] jArr = bW.f26257a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((255 & j10) < 128) {
                                for (C cK = ((A) objArr[(i12 << 3) + i14]).k(); cK != null; cK = cK.f19454b) {
                                    int i15 = cK.f19453a;
                                    if (i15 == iD || n.w0(this.f19481j, Integer.valueOf(i15))) {
                                        cK.f19453a = 0;
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // p048e0.i
    public void m() {
        if (this.f19483m || this.f19492c) {
            return;
        }
        u();
    }

    @Override // p048e0.i
    public void n(A a10) {
        B bW = w();
        if (bW == null) {
            int i10 = F.f26265a;
            bW = new B();
            A(bW);
        }
        bW.a(a10);
    }

    @Override // p048e0.i
    public final void o() {
        int length = this.k.length;
        for (int i10 = 0; i10 < length; i10++) {
            o.u(this.k[i10]);
        }
        int i11 = this.f19493d;
        if (i11 >= 0) {
            o.u(i11);
            this.f19493d = -1;
        }
    }

    @Override // p048e0.i
    public void s(int i10) {
        this.f19478g = i10;
    }

    @Override // p048e0.i
    public i t(c cVar) {
        g gVar;
        if (this.f19492c) {
            C0880d.T("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f19483m && this.f19493d < 0) {
            C0880d.U("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int iD = d();
        z(d());
        Object obj = o.f19510b;
        synchronized (obj) {
            int i10 = o.f19512d;
            o.f19512d = i10 + 1;
            o.f19511c = o.f19511c.i(i10);
            gVar = new g(i10, o.e(e(), iD + 1, i10), o.l(true, cVar, f()), this);
        }
        if (this.f19483m || this.f19492c) {
            return gVar;
        }
        int iD2 = d();
        synchronized (obj) {
            int i11 = o.f19512d;
            o.f19512d = i11 + 1;
            q(i11);
            o.f19511c = o.f19511c.i(d());
        }
        r(o.e(e(), iD2 + 1, d()));
        return gVar;
    }

    public final void u() {
        z(d());
        if (this.f19483m || this.f19492c) {
            return;
        }
        int iD = d();
        synchronized (o.f19510b) {
            int i10 = o.f19512d;
            o.f19512d = i10 + 1;
            q(i10);
            o.f19511c = o.f19511c.i(d());
        }
        r(o.e(e(), iD + 1, d()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015e A[EDGE_INSN: B:101:0x015e->B:77:0x015e BREAK  A[LOOP:4: B:66:0x012f->B:76:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x011c A[Catch: all -> 0x0112, LOOP:2: B:48:0x00ea->B:60:0x011c, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ea, B:50:0x00f6, B:52:0x0100, B:54:0x0106, B:57:0x0114, B:63:0x0125, B:66:0x012f, B:68:0x0139, B:70:0x0143, B:72:0x0149, B:73:0x0153, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:81:0x0169, B:82:0x0175, B:60:0x011c), top: B:90:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b A[Catch: all -> 0x0112, LOOP:4: B:66:0x012f->B:76:0x015b, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ea, B:50:0x00f6, B:52:0x0100, B:54:0x0106, B:57:0x0114, B:63:0x0125, B:66:0x012f, B:68:0x0139, B:70:0x0143, B:72:0x0149, B:73:0x0153, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:81:0x0169, B:82:0x0175, B:60:0x011c), top: B:90:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0123 A[EDGE_INSN: B:96:0x0123->B:62:0x0123 BREAK  A[LOOP:2: B:48:0x00ea->B:60:0x011c], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public t v() {
        HashMap mapC;
        B b10;
        ?? r10;
        long j10;
        long j11;
        B bW = w();
        if (bW != null) {
            AtomicReference atomicReference = o.f19517i;
            mapC = o.c((C1947e) atomicReference.get(), this, o.f19511c.c(((C1946d) atomicReference.get()).f19491b));
        } else {
            mapC = null;
        }
        s sVar = s.f8650a;
        synchronized (o.f19510b) {
            try {
                o.d(this);
                if (bW == null || bW.f26260d == 0) {
                    b();
                    C1946d c1946d = (C1946d) o.f19517i.get();
                    o.v(c1946d, n.f19507c);
                    b10 = c1946d.f19479h;
                    if (b10 == null || !b10.h()) {
                        b10 = null;
                        r10 = sVar;
                    } else {
                        r10 = o.f19515g;
                    }
                } else {
                    C1946d c1946d2 = (C1946d) o.f19517i.get();
                    t tVarY = y(o.f19512d, mapC, o.f19511c.c(c1946d2.f19491b));
                    if (!tVarY.equals(k.f19494c)) {
                        return tVarY;
                    }
                    b();
                    o.v(c1946d2, n.f19507c);
                    b10 = c1946d2.f19479h;
                    A(null);
                    c1946d2.f19479h = null;
                    r10 = o.f19515g;
                }
                this.f19483m = true;
                if (b10 != null) {
                    f fVar = new f(b10);
                    if (!b10.g()) {
                        int size = r10.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((e) r10.get(i10)).invoke(fVar, this);
                        }
                    }
                }
                if (bW != null && bW.h()) {
                    f fVar2 = new f(bW);
                    int size2 = r10.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((e) r10.get(i11)).invoke(fVar2, this);
                    }
                }
                synchronized (o.f19510b) {
                    try {
                        o();
                        o.g();
                        if (b10 != null) {
                            Object[] objArr = b10.f26258b;
                            long[] jArr = b10.f26257a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                j10 = 128;
                                while (true) {
                                    long j12 = jArr[i12];
                                    j11 = 255;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j12 & 255) < 128) {
                                                o.q((A) objArr[(i12 << 3) + i14]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                j10 = 128;
                                j11 = 255;
                            }
                        } else {
                            j10 = 128;
                            j11 = 255;
                        }
                        if (bW != null) {
                            Object[] objArr2 = bW.f26258b;
                            long[] jArr2 = bW.f26257a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j13 = jArr2[i15];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 != length2) {
                                            break;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j13 & j11) < j10) {
                                                o.q((A) objArr2[(i15 << 3) + i17]);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f19480i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                o.q((A) arrayList.get(i18));
                            }
                        }
                        this.f19480i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return k.f19494c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public B w() {
        return this.f19479h;
    }

    @Override // p048e0.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c f() {
        return this.f19476e;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182 A[LOOP:3: B:74:0x0180->B:75:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final t y(int i10, HashMap map, m mVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListM0;
        ArrayList arrayList3;
        int size;
        int i11;
        ArrayList arrayList4;
        int size2;
        int i12;
        A a10;
        C c3;
        m mVar2;
        Object[] objArr;
        long[] jArr;
        m mVar3;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        int i14;
        C cS;
        C cP;
        m mVarH = e().i(d()).h(this.f19481j);
        B bW = w();
        m.c(bW);
        Object[] objArr3 = bW.f26258b;
        long[] jArr3 = bW.f26257a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i15 = 0;
            arrayList3 = null;
            arrayListM0 = null;
            while (true) {
                long j10 = jArr3[i15];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j10 & 255) < 128) {
                            A a11 = (A) objArr3[(i15 << 3) + i18];
                            i14 = i16;
                            C cK = a11.k();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i13 = i18;
                            C cS2 = o.s(cK, i10, mVar);
                            if (cS2 == null || (cS = o.s(cK, d(), mVarH)) == null) {
                                mVar3 = mVarH;
                            } else {
                                mVar3 = mVarH;
                                if (cS.f19453a != 1 && !cS2.equals(cS)) {
                                    C cS3 = o.s(cK, d(), e());
                                    if (cS3 == null) {
                                        o.r();
                                        throw null;
                                    }
                                    if (map == null || (cP = (C) map.get(cS2)) == null) {
                                        cP = a11.p(cS, cS2, cS3);
                                    }
                                    if (cP == null) {
                                        return new j();
                                    }
                                    if (!cP.equals(cS3)) {
                                        if (cP.equals(cS2)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new l(a11, cS2.b()));
                                            if (arrayListM0 == null) {
                                                arrayListM0 = new ArrayList();
                                            }
                                            arrayListM0.add(a11);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!cP.equals(cS) ? new l(a11, cP) : new l(a11, cS.b()));
                                        }
                                    }
                                }
                            }
                        } else {
                            mVar3 = mVarH;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i13 = i18;
                            i14 = i16;
                        }
                        j10 >>= i14;
                        i18 = i13 + 1;
                        i16 = i14;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        mVarH = mVar3;
                    }
                    mVar2 = mVarH;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i17 != i16) {
                        break;
                    }
                } else {
                    mVar2 = mVarH;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i15 != length) {
                    i15++;
                    objArr3 = objArr;
                    jArr3 = jArr;
                    mVarH = mVar2;
                } else {
                    arrayList2 = arrayList3;
                    arrayList = arrayListM0;
                }
            }
            if (arrayList3 != null) {
                u();
                size2 = arrayList3.size();
                for (i12 = 0; i12 < size2; i12++) {
                    l lVar = (l) arrayList3.get(i12);
                    a10 = (A) lVar.f8413a;
                    c3 = (C) lVar.f8414b;
                    c3.f19453a = d();
                    synchronized (o.f19510b) {
                        c3.f19454b = a10.k();
                        a10.q(c3);
                    }
                }
            }
            if (arrayListM0 != null) {
                size = arrayListM0.size();
                for (i11 = 0; i11 < size; i11++) {
                    bW.j((A) arrayListM0.get(i11));
                }
                arrayList4 = this.f19480i;
                if (arrayList4 != null) {
                    arrayListM0 = n.M0(arrayList4, arrayListM0);
                }
                this.f19480i = arrayListM0;
            }
            return k.f19494c;
        }
        arrayList = null;
        arrayList2 = null;
        arrayList3 = arrayList2;
        arrayListM0 = arrayList;
        if (arrayList3 != null) {
            u();
            size2 = arrayList3.size();
            while (i12 < size2) {
                l lVar2 = (l) arrayList3.get(i12);
                a10 = (A) lVar2.f8413a;
                c3 = (C) lVar2.f8414b;
                c3.f19453a = d();
                synchronized (o.f19510b) {
                    c3.f19454b = a10.k();
                    a10.q(c3);
                }
            }
        }
        if (arrayListM0 != null) {
            size = arrayListM0.size();
            while (i11 < size) {
                bW.j((A) arrayListM0.get(i11));
            }
            arrayList4 = this.f19480i;
            if (arrayList4 != null) {
                arrayListM0 = n.M0(arrayList4, arrayListM0);
            }
            this.f19480i = arrayListM0;
        }
        return k.f19494c;
    }

    public final void z(int i10) {
        synchronized (o.f19510b) {
            this.f19481j = this.f19481j.i(i10);
        }
    }
}
