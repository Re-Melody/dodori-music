package p151n9;

import A9.A;
import B8.V;
import D7.W;
import M8.D;
import Q8.i;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import o9.b;
import o9.c;
import o9.d;
import o9.j;
import o9.p;
import p119k9.C2020j;
import p119k9.C2028n;
import p141m9.a;

/* JADX INFO: loaded from: classes2.dex */
public class I extends b implements C, InterfaceC2105g, p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f23059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f23060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f23062j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23063l;

    public I(int i10, int i11, a aVar) {
        this.f23057e = i10;
        this.f23058f = i11;
        this.f23059g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [n9.h] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o9.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [n9.I] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [n9.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o9.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [n9.K] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [n9.K] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static R8.a i(p151n9.I r8, p151n9.InterfaceC2106h r9, Q8.d r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p151n9.H
            if (r0 == 0) goto L13
            r0 = r10
            n9.H r0 = (p151n9.H) r0
            int r1 = r0.f23056g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23056g = r1
            goto L18
        L13:
            n9.H r0 = new n9.H
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f23054e
            R8.a r1 = R8.a.COROUTINE_SUSPENDED
            int r2 = r0.f23056g
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            k9.i0 r8 = r0.f23053d
            n9.K r9 = r0.f23052c
            n9.h r2 = r0.f23051b
            n9.I r5 = r0.f23050a
            Q5.b.T(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            k9.i0 r8 = r0.f23053d
            n9.K r9 = r0.f23052c
            n9.h r2 = r0.f23051b
            n9.I r5 = r0.f23050a
            Q5.b.T(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            n9.K r9 = r0.f23052c
            n9.h r8 = r0.f23051b
            n9.I r2 = r0.f23050a
            Q5.b.T(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            Q5.b.T(r10)
            o9.d r10 = r8.b()
            n9.K r10 = (p151n9.K) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            Q8.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            k9.z r5 = p119k9.C2041z.f21793b     // Catch: java.lang.Throwable -> Lb1
            Q8.g r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb1
            k9.i0 r2 = (p119k9.InterfaceC2019i0) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.r(r9)     // Catch: java.lang.Throwable -> L38
            A9.A r6 = p151n9.J.f23064a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f23050a = r5     // Catch: java.lang.Throwable -> L38
            r0.f23051b = r2     // Catch: java.lang.Throwable -> L38
            r0.f23052c = r9     // Catch: java.lang.Throwable -> L38
            r0.f23053d = r8     // Catch: java.lang.Throwable -> L38
            r0.f23056g = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f23050a = r5     // Catch: java.lang.Throwable -> L38
            r0.f23051b = r2     // Catch: java.lang.Throwable -> L38
            r0.f23052c = r9     // Catch: java.lang.Throwable -> L38
            r0.f23053d = r8     // Catch: java.lang.Throwable -> L38
            r0.f23056g = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return r1
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p151n9.I.i(n9.I, n9.h, Q8.d):R8.a");
    }

    @Override // o9.p
    public final InterfaceC2105g a(i iVar, int i10, a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == a.SUSPEND) ? this : new j(this, iVar, i10, aVar);
    }

    @Override // o9.b
    public final d c() {
        K k = new K();
        k.f23067a = -1L;
        return k;
    }

    @Override // p151n9.InterfaceC2105g
    public final Object collect(InterfaceC2106h interfaceC2106h, Q8.d dVar) {
        return i(this, interfaceC2106h, dVar);
    }

    @Override // o9.b
    public final d[] d() {
        return new K[2];
    }

    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, Q8.d dVar) throws Throwable {
        Throwable th;
        Q8.d[] dVarArrL;
        F f10;
        if (o(obj)) {
            return D.f8402a;
        }
        C2028n c2028n = new C2028n(1, W.K(dVar));
        c2028n.s();
        Q8.d[] dVarArrL2 = c.f23847a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        c2028n.resumeWith(D.f8402a);
                        dVarArrL = l(dVarArrL2);
                        f10 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        F f11 = new F(this, m() + ((long) (this.k + this.f23063l)), obj, c2028n);
                        k(f11);
                        this.f23063l++;
                        if (this.f23058f == 0) {
                            dVarArrL2 = l(dVarArrL2);
                        }
                        dVarArrL = dVarArrL2;
                        f10 = f11;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (f10 != null) {
                    c2028n.v(new C2020j(f10, 2));
                }
                for (Q8.d dVar2 : dVarArrL) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(D.f8402a);
                    }
                }
                Object objR = c2028n.r();
                R8.a aVar = R8.a.COROUTINE_SUSPENDED;
                if (objR != aVar) {
                    objR = D.f8402a;
                }
                return objR == aVar ? objR : D.f8402a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object g(K k, H h10) {
        C2028n c2028n = new C2028n(1, W.K(h10));
        c2028n.s();
        synchronized (this) {
            if (q(k) < 0) {
                k.f23068b = c2028n;
            } else {
                c2028n.resumeWith(D.f8402a);
            }
        }
        Object objR = c2028n.r();
        return objR == R8.a.COROUTINE_SUSPENDED ? objR : D.f8402a;
    }

    public final void h() {
        if (this.f23058f != 0 || this.f23063l > 1) {
            Object[] objArr = this.f23060h;
            m.c(objArr);
            while (this.f23063l > 0) {
                long jM = m();
                int i10 = this.k;
                int i11 = this.f23063l;
                if (objArr[((int) ((jM + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != J.f23064a) {
                    return;
                }
                this.f23063l = i11 - 1;
                J.d(objArr, m() + ((long) (this.k + this.f23063l)), null);
            }
        }
    }

    public final void j() {
        d[] dVarArr;
        Object[] objArr = this.f23060h;
        m.c(objArr);
        J.d(objArr, m(), null);
        this.k--;
        long jM = m() + 1;
        if (this.f23061i < jM) {
            this.f23061i = jM;
        }
        if (this.f23062j < jM) {
            if (this.f23844b != 0 && (dVarArr = this.f23843a) != null) {
                for (d dVar : dVarArr) {
                    if (dVar != null) {
                        K k = (K) dVar;
                        long j10 = k.f23067a;
                        if (j10 >= 0 && j10 < jM) {
                            k.f23067a = jM;
                        }
                    }
                }
            }
            this.f23062j = jM;
        }
    }

    public final void k(Object obj) {
        int i10 = this.k + this.f23063l;
        Object[] objArrN = this.f23060h;
        if (objArrN == null) {
            objArrN = n(null, 0, 2);
        } else if (i10 >= objArrN.length) {
            objArrN = n(objArrN, i10, objArrN.length * 2);
        }
        J.d(objArrN, m() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [Q8.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Q8.d[] l(Q8.d[] dVarArr) {
        d[] dVarArr2;
        K k;
        C2028n c2028n;
        int length = dVarArr.length;
        if (this.f23844b != 0 && (dVarArr2 = this.f23843a) != null) {
            int length2 = dVarArr2.length;
            int i10 = 0;
            while (i10 < length2) {
                d dVar = dVarArr2[i10];
                if (dVar == null || (c2028n = (k = (K) dVar).f23068b) == null || q(k) < 0) {
                    dVarArr = dVarArr;
                } else {
                    if (length >= dVarArr.length) {
                        dVarArr = dVarArr;
                        dVarArr = dVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        m.e(objArrCopyOf, "copyOf(...)");
                        dVarArr = objArrCopyOf;
                    }
                    dVarArr = dVarArr;
                    dVarArr = dVarArr;
                    ((Q8.d[]) dVarArr)[length] = c2028n;
                    k.f23068b = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
            dVarArr = dVarArr;
        }
        return (Q8.d[]) dVarArr;
    }

    public final long m() {
        return Math.min(this.f23062j, this.f23061i);
    }

    public final Object[] n(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f23060h = objArr2;
        if (objArr != null) {
            long jM = m();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jM;
                J.d(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean o(Object obj) {
        int i10;
        boolean z10;
        Q8.d[] dVarArrL = c.f23847a;
        synchronized (this) {
            if (p(obj)) {
                dVarArrL = l(dVarArrL);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Q8.d dVar : dVarArrL) {
            if (dVar != null) {
                dVar.resumeWith(D.f8402a);
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    public final boolean p(Object obj) {
        int i10;
        long jM;
        long j10;
        int i11 = this.f23844b;
        int i12 = this.f23057e;
        if (i11 != 0) {
            int i13 = this.k;
            int i14 = this.f23058f;
            if (i13 < i14 || this.f23062j > this.f23061i) {
                k(obj);
                i10 = this.k + 1;
                this.k = i10;
                if (i10 > i14) {
                    j();
                }
                jM = m() + ((long) this.k);
                j10 = this.f23061i;
                if (((int) (jM - j10)) > i12) {
                    s(1 + j10, this.f23062j, m() + ((long) this.k), m() + ((long) this.k) + ((long) this.f23063l));
                }
            } else {
                int i15 = G.f23049a[this.f23059g.ordinal()];
                if (i15 == 1) {
                    return false;
                }
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new V();
                    }
                    k(obj);
                    i10 = this.k + 1;
                    this.k = i10;
                    if (i10 > i14) {
                        j();
                    }
                    jM = m() + ((long) this.k);
                    j10 = this.f23061i;
                    if (((int) (jM - j10)) > i12) {
                        s(1 + j10, this.f23062j, m() + ((long) this.k), m() + ((long) this.k) + ((long) this.f23063l));
                    }
                }
            }
        } else if (i12 != 0) {
            k(obj);
            int i16 = this.k + 1;
            this.k = i16;
            if (i16 > i12) {
                j();
            }
            this.f23062j = m() + ((long) this.k);
            return true;
        }
        return true;
    }

    public final long q(K k) {
        long j10 = k.f23067a;
        if (j10 < m() + ((long) this.k)) {
            return j10;
        }
        if (this.f23058f <= 0 && j10 <= m() && this.f23063l != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object r(K k) {
        Object obj;
        Q8.d[] dVarArrT = c.f23847a;
        synchronized (this) {
            try {
                long jQ = q(k);
                if (jQ < 0) {
                    obj = J.f23064a;
                } else {
                    long j10 = k.f23067a;
                    Object[] objArr = this.f23060h;
                    m.c(objArr);
                    Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                    if (obj2 instanceof F) {
                        obj2 = ((F) obj2).f23047c;
                    }
                    k.f23067a = jQ + 1;
                    Object obj3 = obj2;
                    dVarArrT = t(j10);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Q8.d dVar : dVarArrT) {
            if (dVar != null) {
                dVar.resumeWith(D.f8402a);
            }
        }
        return obj;
    }

    public final void s(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jM = m(); jM < jMin; jM++) {
            Object[] objArr = this.f23060h;
            m.c(objArr);
            J.d(objArr, jM, null);
        }
        this.f23061i = j10;
        this.f23062j = j11;
        this.k = (int) (j12 - jMin);
        this.f23063l = (int) (j13 - j12);
    }

    public final Q8.d[] t(long j10) {
        long j11;
        long j12;
        long j13;
        Q8.d[] dVarArr;
        d[] dVarArr2;
        long j14 = this.f23062j;
        Q8.d[] dVarArr3 = c.f23847a;
        if (j10 <= j14) {
            long jM = m();
            long j15 = ((long) this.k) + jM;
            int i10 = this.f23058f;
            if (i10 == 0 && this.f23063l > 0) {
                j15++;
            }
            int i11 = 0;
            if (this.f23844b != 0 && (dVarArr2 = this.f23843a) != null) {
                for (d dVar : dVarArr2) {
                    if (dVar != null) {
                        long j16 = ((K) dVar).f23067a;
                        if (j16 >= 0 && j16 < j15) {
                            j15 = j16;
                        }
                    }
                }
            }
            if (j15 > this.f23062j) {
                long jM2 = m() + ((long) this.k);
                int iMin = this.f23844b > 0 ? Math.min(this.f23063l, i10 - ((int) (jM2 - j15))) : this.f23063l;
                long j17 = ((long) this.f23063l) + jM2;
                A a10 = J.f23064a;
                if (iMin > 0) {
                    Q8.d[] dVarArr4 = new Q8.d[iMin];
                    j13 = 1;
                    Object[] objArr = this.f23060h;
                    m.c(objArr);
                    long j18 = jM2;
                    while (true) {
                        if (jM2 >= j17) {
                            j11 = jM;
                            j12 = j15;
                            break;
                        }
                        j11 = jM;
                        Object obj = objArr[((int) jM2) & (objArr.length - 1)];
                        if (obj != a10) {
                            m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            F f10 = (F) obj;
                            int i12 = i11 + 1;
                            j12 = j15;
                            dVarArr4[i11] = f10.f23048d;
                            J.d(objArr, jM2, a10);
                            J.d(objArr, j18, f10.f23047c);
                            j18++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j12 = j15;
                        }
                        jM2++;
                        jM = j11;
                        j15 = j12;
                    }
                    jM2 = j18;
                    dVarArr = dVarArr4;
                } else {
                    j11 = jM;
                    j12 = j15;
                    j13 = 1;
                    dVarArr = dVarArr3;
                }
                int i13 = (int) (jM2 - j11);
                long j19 = this.f23844b == 0 ? jM2 : j12;
                long jMax = Math.max(this.f23061i, jM2 - ((long) Math.min(this.f23057e, i13)));
                if (i10 == 0 && jMax < j17) {
                    Object[] objArr2 = this.f23060h;
                    m.c(objArr2);
                    if (m.b(objArr2[((int) jMax) & (objArr2.length - 1)], a10)) {
                        jM2 += j13;
                        jMax += j13;
                    }
                }
                s(jMax, j19, jM2, j17);
                h();
                return dVarArr.length == 0 ? dVarArr : l(dVarArr);
            }
        }
        return dVarArr3;
    }
}
