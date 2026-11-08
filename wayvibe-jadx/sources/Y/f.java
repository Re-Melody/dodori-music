package Y;

import M8.t;
import U.C0880d;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class f extends N8.g implements Collection, p013a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f13306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p016b0.b f13310e = new p016b0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f13311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f13312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13313h;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f13306a = cVar;
        this.f13307b = objArr;
        this.f13308c = objArr2;
        this.f13309d = i10;
        this.f13311f = objArr;
        this.f13312g = objArr2;
        this.f13313h = cVar.k();
    }

    public static void p(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final Object[] A() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f13310e;
        return objArr;
    }

    public final Object[] B(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f13310e;
        return objArr;
    }

    public final Object[] C(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            C0880d.T("shift should be positive");
            throw null;
        }
        if (i11 == 0) {
            return objArr;
        }
        int iT = S9.b.T(i10, i11);
        Object obj = objArr[iT];
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objC = C((Object[]) obj, i10, i11 - 5);
        if (iT < 31) {
            int i12 = iT + 1;
            if (objArr[i12] != null) {
                if (u(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrA = A();
                N8.m.k0(objArr, 0, objArrA, 0, i12);
                objArr = objArrA;
            }
        }
        if (objC == objArr[iT]) {
            return objArr;
        }
        Object[] objArrY = y(objArr);
        objArrY[iT] = objC;
        return objArrY;
    }

    public final Object[] D(Object[] objArr, int i10, int i11, K2.c cVar) {
        Object[] objArrD;
        int iT = S9.b.T(i11 - 1, i10);
        if (i10 == 5) {
            cVar.f7355a = objArr[iT];
            objArrD = null;
        } else {
            Object obj = objArr[iT];
            m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrD = D((Object[]) obj, i10 - 5, i11, cVar);
        }
        if (objArrD == null && iT == 0) {
            return null;
        }
        Object[] objArrY = y(objArr);
        objArrY[iT] = objArrD;
        return objArrY;
    }

    public final void E(Object[] objArr, int i10, int i11) {
        Object obj = null;
        if (i11 == 0) {
            this.f13311f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f13312g = objArr;
            this.f13313h = i10;
            this.f13309d = i11;
            return;
        }
        K2.c cVar = new K2.c(obj);
        m.c(objArr);
        Object[] objArrD = D(objArr, i11, i10, cVar);
        m.c(objArrD);
        Object obj2 = cVar.f7355a;
        m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f13312g = (Object[]) obj2;
        this.f13313h = i10;
        if (objArrD[1] == null) {
            this.f13311f = (Object[]) objArrD[0];
            this.f13309d = i11 - 5;
        } else {
            this.f13311f = objArrD;
            this.f13309d = i11;
        }
    }

    public final Object[] F(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            C0880d.T("invalid buffersIterator");
            throw null;
        }
        if (!(i11 >= 0)) {
            C0880d.T("negative shift");
            throw null;
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrY = y(objArr);
        int iT = S9.b.T(i10, i11);
        int i12 = i11 - 5;
        objArrY[iT] = F((Object[]) objArrY[iT], i10, i12, it);
        while (true) {
            iT++;
            if (iT >= 32 || !it.hasNext()) {
                break;
            }
            objArrY[iT] = F((Object[]) objArrY[iT], 0, i12, it);
        }
        return objArrY;
    }

    public final Object[] G(Object[] objArr, int i10, Object[][] objArr2) {
        t tVarI = m.i(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f13309d;
        Object[] objArrF = i11 < (1 << i12) ? F(objArr, i10, i12, tVarI) : y(objArr);
        while (tVarI.hasNext()) {
            this.f13309d += 5;
            objArrF = B(objArrF);
            int i13 = this.f13309d;
            F(objArrF, 1 << i13, i13, tVarI);
        }
        return objArrF;
    }

    public final void H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f13313h;
        int i11 = i10 >> 5;
        int i12 = this.f13309d;
        if (i11 > (1 << i12)) {
            this.f13311f = I(this.f13309d + 5, B(objArr), objArr2);
            this.f13312g = objArr3;
            this.f13309d += 5;
            this.f13313h++;
            return;
        }
        if (objArr == null) {
            this.f13311f = objArr2;
            this.f13312g = objArr3;
            this.f13313h = i10 + 1;
        } else {
            this.f13311f = I(i12, objArr, objArr2);
            this.f13312g = objArr3;
            this.f13313h++;
        }
    }

    public final Object[] I(int i10, Object[] objArr, Object[] objArr2) {
        int iT = S9.b.T(k() - 1, i10);
        Object[] objArrY = y(objArr);
        if (i10 == 5) {
            objArrY[iT] = objArr2;
            return objArrY;
        }
        objArrY[iT] = I(i10 - 5, (Object[]) objArrY[iT], objArr2);
        return objArrY;
    }

    public final int J(Z8.c cVar, Object[] objArr, int i10, int i11, K2.c cVar2, ArrayList arrayList, ArrayList arrayList2) {
        if (u(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = cVar2.f7355a;
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrA = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrA = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : A();
                    i11 = 0;
                }
                objArrA[i11] = obj2;
                i11++;
            }
        }
        cVar2.f7355a = objArrA;
        if (objArr2 != objArrA) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int K(Z8.c cVar, Object[] objArr, int i10, K2.c cVar2) {
        Object[] objArrY = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrY = y(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrY[i11] = obj;
                i11++;
            }
        }
        cVar2.f7355a = objArrY;
        return i11;
    }

    public final int L(Z8.c cVar, int i10, K2.c cVar2) {
        int iK = K(cVar, this.f13312g, i10, cVar2);
        if (iK == i10) {
            return i10;
        }
        Object obj = cVar2.f7355a;
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iK, i10, (Object) null);
        this.f13312g = objArr;
        this.f13313h -= i10 - iK;
        return iK;
    }

    public final boolean M(Z8.c cVar) {
        Object[] objArrF;
        int i10;
        Z8.c cVar2 = cVar;
        int iS = S();
        Object[] objArrC = null;
        K2.c cVar3 = new K2.c(objArrC);
        boolean z10 = false;
        if (this.f13311f != null) {
            a aVarX = x(0);
            int iK = 32;
            while (iK == 32 && aVarX.hasNext()) {
                iK = K(cVar2, (Object[]) aVarX.next(), 32, cVar3);
            }
            if (iK == 32) {
                int iL = L(cVar2, iS, cVar3);
                if (iL == 0) {
                    E(this.f13311f, this.f13313h, this.f13309d);
                }
                if (iL != iS) {
                }
            } else {
                int i11 = (aVarX.f13296a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iJ = iK;
                while (aVarX.hasNext()) {
                    iJ = J(cVar2, (Object[]) aVarX.next(), 32, iJ, cVar3, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int iJ2 = J(cVar, this.f13312g, iS, iJ, cVar3, arrayList2, arrayList);
                Object obj = cVar3.f7355a;
                m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iJ2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrF = this.f13311f;
                    m.c(objArrF);
                } else {
                    objArrF = F(this.f13311f, i11, this.f13309d, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C0880d.T("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f13309d = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.f13309d;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.f13309d = i10 - 5;
                        Object[] objArr2 = objArrF[0];
                        m.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrF = objArr2;
                    }
                    objArrC = C(objArrF, i12, i10);
                }
                this.f13311f = objArrC;
                this.f13312g = objArr;
                this.f13313h = size + iJ2;
            }
            z10 = true;
        } else if (L(cVar2, iS, cVar3) != iS) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] N(Object[] objArr, int i10, int i11, K2.c cVar) {
        int iT = S9.b.T(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iT];
            Object[] objArrY = y(objArr);
            N8.m.k0(objArr, iT, objArrY, iT + 1, 32);
            objArrY[31] = cVar.f7355a;
            cVar.f7355a = obj;
            return objArrY;
        }
        int iT2 = objArr[31] == null ? S9.b.T(P() - 1, i10) : 31;
        Object[] objArrY2 = y(objArr);
        int i12 = i10 - 5;
        int i13 = iT + 1;
        if (i13 <= iT2) {
            while (true) {
                Object obj2 = objArrY2[iT2];
                m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrY2[iT2] = N((Object[]) obj2, i12, 0, cVar);
                if (iT2 == i13) {
                    break;
                }
                iT2--;
            }
        }
        Object obj3 = objArrY2[iT];
        m.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrY2[iT] = N((Object[]) obj3, i12, i11, cVar);
        return objArrY2;
    }

    public final Object O(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f13313h - i10;
        if (i13 == 1) {
            Object obj = this.f13312g[0];
            E(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f13312g;
        Object obj2 = objArr2[i12];
        Object[] objArrY = y(objArr2);
        N8.m.k0(objArr2, i12, objArrY, i12 + 1, i13);
        objArrY[i13 - 1] = null;
        this.f13311f = objArr;
        this.f13312g = objArrY;
        this.f13313h = (i10 + i13) - 1;
        this.f13309d = i11;
        return obj2;
    }

    public final int P() {
        int i10 = this.f13313h;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] Q(Object[] objArr, int i10, int i11, Object obj, K2.c cVar) {
        int iT = S9.b.T(i11, i10);
        Object[] objArrY = y(objArr);
        if (i10 != 0) {
            Object obj2 = objArrY[iT];
            m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrY[iT] = Q((Object[]) obj2, i10 - 5, i11, obj, cVar);
            return objArrY;
        }
        if (objArrY != objArr) {
            ((AbstractList) this).modCount++;
        }
        cVar.f7355a = objArrY[iT];
        objArrY[iT] = obj;
        return objArrY;
    }

    public final void R(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrA;
        if (i12 < 1) {
            C0880d.T("requires at least one nullBuffer");
            throw null;
        }
        Object[] objArrY = y(objArr);
        objArr2[0] = objArrY;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            N8.m.k0(objArrY, size + 1, objArr3, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrA = objArrY;
            } else {
                objArrA = A();
                i12--;
                objArr2[i12] = objArrA;
            }
            int i16 = i11 - i15;
            N8.m.k0(objArrY, 0, objArr3, i16, i11);
            N8.m.k0(objArrY, size + 1, objArrA, i13, i16);
            objArr3 = objArrA;
        }
        Iterator it = collection.iterator();
        p(objArrY, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrA2 = A();
            p(objArrA2, 0, it);
            objArr2[i17] = objArrA2;
        }
        p(objArr3, 0, it);
    }

    public final int S() {
        int i10 = this.f13313h;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        p046da.b.h(i10, k());
        if (i10 == k()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iP = P();
        if (i10 >= iP) {
            t(obj, this.f13311f, i10 - iP);
            return;
        }
        K2.c cVar = new K2.c(null);
        Object[] objArr = this.f13311f;
        m.c(objArr);
        t(cVar.f7355a, s(objArr, this.f13309d, i10, obj, cVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrA;
        p046da.b.h(i10, this.f13313h);
        if (i10 == this.f13313h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f13313h - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f13312g;
            Object[] objArrY = y(objArr);
            N8.m.k0(objArr, size2 + 1, objArrY, i12, S());
            p(objArrY, i12, collection.iterator());
            this.f13312g = objArrY;
            this.f13313h = collection.size() + this.f13313h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iS = S();
        int size3 = collection.size() + this.f13313h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= P()) {
            objArrA = A();
            collection2 = collection;
            R(collection2, i10, this.f13312g, iS, objArr2, size, objArrA);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iS) {
                int i13 = size3 - iS;
                Object[] objArrZ = z(i13, fVar.f13312g);
                fVar.r(collection2, i10, i13, objArr2, size, objArrZ);
                objArr2 = objArr2;
                objArrA = objArrZ;
            } else {
                Object[] objArr3 = fVar.f13312g;
                objArrA = A();
                int i14 = iS - size3;
                N8.m.k0(objArr3, 0, objArrA, i14, iS);
                int i15 = 32 - i14;
                Object[] objArrZ2 = z(i15, fVar.f13312g);
                int i16 = size - 1;
                objArr2[i16] = objArrZ2;
                fVar.r(collection2, i10, i15, objArr2, i16, objArrZ2);
                collection2 = collection2;
            }
        }
        fVar.f13311f = G(fVar.f13311f, i11, objArr2);
        fVar.f13312g = objArrA;
        fVar.f13313h = collection2.size() + fVar.f13313h;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        p046da.b.g(i10, k());
        if (P() <= i10) {
            objArr = this.f13312g;
        } else {
            objArr = this.f13311f;
            m.c(objArr);
            for (int i11 = this.f13309d; i11 > 0; i11 -= 5) {
                Object obj = objArr[S9.b.T(i10, i11)];
                m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // N8.g
    public final int k() {
        return this.f13313h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        p046da.b.h(i10, this.f13313h);
        return new h(this, i10);
    }

    @Override // N8.g
    public final Object n(int i10) {
        p046da.b.g(i10, k());
        ((AbstractList) this).modCount++;
        int iP = P();
        if (i10 >= iP) {
            return O(this.f13311f, iP, this.f13309d, i10 - iP);
        }
        K2.c cVar = new K2.c(this.f13312g[0]);
        Object[] objArr = this.f13311f;
        m.c(objArr);
        O(N(objArr, this.f13309d, i10, cVar), iP, this.f13309d, 0);
        return cVar.f7355a;
    }

    public final c o() {
        c eVar;
        Object[] objArr = this.f13311f;
        if (objArr == this.f13307b && this.f13312g == this.f13308c) {
            eVar = this.f13306a;
        } else {
            this.f13310e = new p016b0.b();
            this.f13307b = objArr;
            Object[] objArr2 = this.f13312g;
            this.f13308c = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f13313h, this.f13309d);
            } else if (objArr2.length == 0) {
                eVar = i.f13320b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f13313h);
                m.e(objArrCopyOf, "copyOf(this, newSize)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f13306a = eVar;
        return eVar;
    }

    public final int q() {
        return ((AbstractList) this).modCount;
    }

    public final void r(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f13311f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarX = x(P() >> 5);
        int i14 = i12;
        Object[] objArrZ = objArr2;
        while (aVarX.f13296a - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarX.previous();
            N8.m.k0(objArr3, 0, objArrZ, 32 - i11, 32);
            objArrZ = z(i11, objArr3);
            i14--;
            objArr[i14] = objArrZ;
        }
        Object[] objArr4 = (Object[]) aVarX.previous();
        int iP = i12 - (((P() >> 5) - 1) - i13);
        if (iP < i12) {
            objArr2 = objArr[iP];
            m.c(objArr2);
        }
        R(collection, i10, objArr4, 32, objArr, iP, objArr2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return M(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i10, int i11, Object obj, K2.c cVar) {
        Object obj2;
        int iT = S9.b.T(i11, i10);
        if (i10 == 0) {
            cVar.f7355a = objArr[31];
            Object[] objArrY = y(objArr);
            N8.m.k0(objArr, iT + 1, objArrY, iT, 31);
            objArrY[iT] = obj;
            return objArrY;
        }
        Object[] objArrY2 = y(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrY2[iT];
        m.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrY2[iT] = s((Object[]) obj3, i12, i11, obj, cVar);
        while (true) {
            iT++;
            if (iT >= 32 || (obj2 = objArrY2[iT]) == null) {
                break;
            }
            objArrY2[iT] = s((Object[]) obj2, i12, 0, cVar.f7355a, cVar);
        }
        return objArrY2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        p046da.b.g(i10, k());
        if (P() > i10) {
            K2.c cVar = new K2.c(null);
            Object[] objArr = this.f13311f;
            m.c(objArr);
            this.f13311f = Q(objArr, this.f13309d, i10, obj, cVar);
            return cVar.f7355a;
        }
        Object[] objArrY = y(this.f13312g);
        if (objArrY != this.f13312g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrY[i11];
        objArrY[i11] = obj;
        this.f13312g = objArrY;
        return obj2;
    }

    public final void t(Object obj, Object[] objArr, int i10) {
        int iS = S();
        Object[] objArrY = y(this.f13312g);
        if (iS < 32) {
            N8.m.k0(this.f13312g, i10 + 1, objArrY, i10, iS);
            objArrY[i10] = obj;
            this.f13311f = objArr;
            this.f13312g = objArrY;
            this.f13313h++;
            return;
        }
        Object[] objArr2 = this.f13312g;
        Object obj2 = objArr2[31];
        N8.m.k0(objArr2, i10 + 1, objArrY, i10, 31);
        objArrY[i10] = obj;
        H(objArr, objArrY, B(obj2));
    }

    public final boolean u(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f13310e;
    }

    public final a x(int i10) {
        Object[] objArr = this.f13311f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iP = P() >> 5;
        p046da.b.h(i10, iP);
        int i11 = this.f13309d;
        return i11 == 0 ? new d(objArr, i10) : new j(objArr, i10, iP, i11 / 5);
    }

    public final Object[] y(Object[] objArr) {
        if (objArr == null) {
            return A();
        }
        if (u(objArr)) {
            return objArr;
        }
        Object[] objArrA = A();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        N8.m.m0(objArr, 0, objArrA, length, 6);
        return objArrA;
    }

    public final Object[] z(int i10, Object[] objArr) {
        if (u(objArr)) {
            N8.m.k0(objArr, i10, objArr, 0, 32 - i10);
            return objArr;
        }
        Object[] objArrA = A();
        N8.m.k0(objArr, i10, objArrA, 0, 32 - i10);
        return objArrA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iS = S();
        if (iS < 32) {
            Object[] objArrY = y(this.f13312g);
            objArrY[iS] = obj;
            this.f13312g = objArrY;
            this.f13313h = k() + 1;
        } else {
            H(this.f13311f, this.f13312g, B(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iS = S();
        Iterator it = collection.iterator();
        if (32 - iS >= collection.size()) {
            Object[] objArrY = y(this.f13312g);
            p(objArrY, iS, it);
            this.f13312g = objArrY;
            this.f13313h = collection.size() + this.f13313h;
            return true;
        }
        int size = ((collection.size() + iS) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrY2 = y(this.f13312g);
        p(objArrY2, iS, it);
        objArr[0] = objArrY2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrA = A();
            p(objArrA, 0, it);
            objArr[i10] = objArrA;
        }
        this.f13311f = G(this.f13311f, P(), objArr);
        Object[] objArrA2 = A();
        p(objArrA2, 0, it);
        this.f13312g = objArrA2;
        this.f13313h = collection.size() + this.f13313h;
        return true;
    }
}
