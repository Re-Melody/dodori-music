package Z;

import U.C0880d;
import U.U;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f13438e = new m(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p016b0.b f13441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f13442d;

    public m(int i10, int i11, Object[] objArr, p016b0.b bVar) {
        this.f13439a = i10;
        this.f13440b = i11;
        this.f13441c = bVar;
        this.f13442d = objArr;
    }

    public static m j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, p016b0.b bVar) {
        if (i12 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iH = p206t6.b.H(i10, i12);
        int iH2 = p206t6.b.H(i11, i12);
        if (iH != iH2) {
            return new m((1 << iH) | (1 << iH2), 0, iH < iH2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << iH, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, p016b0.b bVar) {
        Object obj3 = this.f13442d[i10];
        m mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f13442d;
        Object[] objArr2 = new Object[objArr.length - 1];
        N8.m.m0(objArr, 0, objArr2, i10, 6);
        N8.m.k0(objArr, i10, objArr2, i10 + 2, i14);
        objArr2[iT - 1] = mVarJ;
        N8.m.k0(objArr, iT, objArr2, i14, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f13440b == 0) {
            return this.f13442d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f13439a);
        int length = this.f13442d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        p064f9.e eVarE0 = R3.a.e0(2, R3.a.j0(0, this.f13442d.length));
        int i10 = eVarE0.f19892a;
        int i11 = eVarE0.f19893b;
        int i12 = eVarE0.f19894c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!kotlin.jvm.internal.m.b(obj, this.f13442d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, Object obj, int i11) {
        int iH = 1 << p206t6.b.H(i10, i11);
        if (h(iH)) {
            return kotlin.jvm.internal.m.b(obj, this.f13442d[f(iH)]);
        }
        if (!i(iH)) {
            return false;
        }
        m mVarS = s(t(iH));
        return i11 == 30 ? mVarS.c(obj) : mVarS.d(i10, obj, i11 + 5);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f13440b != mVar.f13440b || this.f13439a != mVar.f13439a) {
            return false;
        }
        int length = this.f13442d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f13442d[i10] != mVar.f13442d[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f13439a) * 2;
    }

    public final Object g(int i10, Object obj, int i11) {
        int iH = 1 << p206t6.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (kotlin.jvm.internal.m.b(obj, this.f13442d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iH)) {
            return null;
        }
        m mVarS = s(t(iH));
        if (i11 != 30) {
            return mVarS.g(i10, obj, i11 + 5);
        }
        p064f9.e eVarE0 = R3.a.e0(2, R3.a.j0(0, mVarS.f13442d.length));
        int i12 = eVarE0.f19892a;
        int i13 = eVarE0.f19893b;
        int i14 = eVarE0.f19894c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!kotlin.jvm.internal.m.b(obj, mVarS.f13442d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return mVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f13439a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f13440b) != 0;
    }

    public final m k(int i10, e eVar) {
        eVar.b(eVar.f13425f - 1);
        eVar.f13423d = x(i10);
        Object[] objArr = this.f13442d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13441c != eVar.f13421b) {
            return new m(0, 0, p206t6.b.f(i10, objArr), eVar.f13421b);
        }
        this.f13442d = p206t6.b.f(i10, objArr);
        return this;
    }

    public final m l(int i10, Object obj, Object obj2, int i11, e eVar) {
        e eVar2;
        m mVarL;
        int iH = 1 << p206t6.b.H(i10, i11);
        boolean zH = h(iH);
        p016b0.b bVar = this.f13441c;
        if (zH) {
            int iF = f(iH);
            if (!kotlin.jvm.internal.m.b(obj, this.f13442d[iF])) {
                eVar.b(eVar.f13425f + 1);
                p016b0.b bVar2 = eVar.f13421b;
                if (bVar != bVar2) {
                    return new m(this.f13439a ^ iH, this.f13440b | iH, a(iF, iH, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f13442d = a(iF, iH, i10, obj, obj2, i11, bVar2);
                this.f13439a ^= iH;
                this.f13440b |= iH;
                return this;
            }
            eVar.f13423d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.f13421b) {
                this.f13442d[iF + 1] = obj2;
                return this;
            }
            eVar.f13424e++;
            Object[] objArr = this.f13442d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iF + 1] = obj2;
            return new m(this.f13439a, this.f13440b, objArrCopyOf, eVar.f13421b);
        }
        if (!i(iH)) {
            eVar.b(eVar.f13425f + 1);
            p016b0.b bVar3 = eVar.f13421b;
            int iF2 = f(iH);
            if (bVar != bVar3) {
                return new m(this.f13439a | iH, this.f13440b, p206t6.b.e(this.f13442d, iF2, obj, obj2), bVar3);
            }
            this.f13442d = p206t6.b.e(this.f13442d, iF2, obj, obj2);
            this.f13439a |= iH;
            return this;
        }
        int iT = t(iH);
        m mVarS = s(iT);
        if (i11 == 30) {
            p064f9.e eVarE0 = R3.a.e0(2, R3.a.j0(0, mVarS.f13442d.length));
            int i12 = eVarE0.f19892a;
            int i13 = eVarE0.f19893b;
            int i14 = eVarE0.f19894c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!kotlin.jvm.internal.m.b(obj, mVarS.f13442d[i12])) {
                        if (i12 == i13) {
                            eVar.b(eVar.f13425f + 1);
                            mVarL = new m(0, 0, p206t6.b.e(mVarS.f13442d, 0, obj, obj2), eVar.f13421b);
                            break;
                        }
                        i12 += i14;
                    } else {
                        eVar.f13423d = mVarS.x(i12);
                        if (mVarS.f13441c != eVar.f13421b) {
                            eVar.f13424e++;
                            Object[] objArr2 = mVarS.f13442d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            kotlin.jvm.internal.m.e(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[i12 + 1] = obj2;
                            mVarL = new m(0, 0, objArrCopyOf2, eVar.f13421b);
                            break;
                        }
                        mVarS.f13442d[i12 + 1] = obj2;
                        mVarL = mVarS;
                        break;
                    }
                }
            } else {
                eVar.b(eVar.f13425f + 1);
                mVarL = new m(0, 0, p206t6.b.e(mVarS.f13442d, 0, obj, obj2), eVar.f13421b);
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            mVarL = mVarS.l(i10, obj, obj2, i11 + 5, eVar2);
        }
        return mVarS == mVarL ? this : r(iT, mVarL, eVar2.f13421b);
    }

    public final m m(m mVar, int i10, p016b0.a aVar, e eVar) {
        m mVar2;
        int i11;
        m mVarJ;
        if (this == mVar) {
            aVar.f15713a += b();
            return this;
        }
        int i12 = 1;
        int i13 = 0;
        if (i10 > 30) {
            p016b0.b bVar = eVar.f13421b;
            int i14 = mVar.f13440b;
            Object[] objArr = this.f13442d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + mVar.f13442d.length);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(this, newSize)");
            int length = this.f13442d.length;
            p064f9.e eVarE0 = R3.a.e0(2, R3.a.j0(0, mVar.f13442d.length));
            int i15 = eVarE0.f19892a;
            int i16 = eVarE0.f19893b;
            int i17 = eVarE0.f19894c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (true) {
                    if (c(mVar.f13442d[i15])) {
                        aVar.f15713a++;
                    } else {
                        Object[] objArr2 = mVar.f13442d;
                        objArrCopyOf[length] = objArr2[i15];
                        objArrCopyOf[length + 1] = objArr2[i15 + 1];
                        length += 2;
                    }
                    if (i15 == i16) {
                        break;
                    }
                    i15 += i17;
                }
            }
            if (length != this.f13442d.length) {
                if (length == mVar.f13442d.length) {
                    return mVar;
                }
                if (length == objArrCopyOf.length) {
                    return new m(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                kotlin.jvm.internal.m.e(objArrCopyOf2, "copyOf(this, newSize)");
                return new m(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i18 = this.f13440b | mVar.f13440b;
            int i19 = this.f13439a;
            int i20 = mVar.f13439a;
            int i21 = (i19 ^ i20) & (~i18);
            int i22 = i19 & i20;
            int i23 = i21;
            while (i22 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i22);
                if (kotlin.jvm.internal.m.b(this.f13442d[f(iLowestOneBit)], mVar.f13442d[mVar.f(iLowestOneBit)])) {
                    i23 |= iLowestOneBit;
                } else {
                    i18 |= iLowestOneBit;
                }
                i22 ^= iLowestOneBit;
            }
            if (!((i18 & i23) == 0)) {
                C0880d.U("Check failed.");
                throw null;
            }
            if (kotlin.jvm.internal.m.b(this.f13441c, eVar.f13421b) && this.f13439a == i23 && this.f13440b == i18) {
                mVar2 = this;
            } else {
                mVar2 = new m(i23, i18, new Object[Integer.bitCount(i18) + (Integer.bitCount(i23) * 2)], null);
            }
            int i24 = i18;
            int i25 = 0;
            while (i24 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i24);
                Object[] objArr3 = mVar2.f13442d;
                int length2 = (objArr3.length - i12) - i25;
                if (i(iLowestOneBit2)) {
                    mVarJ = s(t(iLowestOneBit2));
                    if (mVar.i(iLowestOneBit2)) {
                        mVarJ = mVarJ.m(mVar.s(mVar.t(iLowestOneBit2)), i10 + 5, aVar, eVar);
                    } else if (mVar.h(iLowestOneBit2)) {
                        int iF = mVar.f(iLowestOneBit2);
                        Object obj = mVar.f13442d[iF];
                        Object objX = mVar.x(iF);
                        i11 = i12;
                        int i26 = eVar.f13425f;
                        int iHashCode = obj != null ? obj.hashCode() : i13;
                        objArr3 = objArr3;
                        iLowestOneBit2 = iLowestOneBit2;
                        mVarJ = mVarJ.l(iHashCode, obj, objX, i10 + 5, eVar);
                        if (eVar.f13425f == i26) {
                            aVar.f15713a++;
                        }
                    }
                    i11 = i12;
                } else {
                    iLowestOneBit2 = iLowestOneBit2;
                    objArr3 = objArr3;
                    i11 = i12;
                    if (mVar.i(iLowestOneBit2)) {
                        m mVarS = mVar.s(mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f13442d[iF2];
                            int i27 = i10 + 5;
                            if (mVarS.d(obj2 != null ? obj2.hashCode() : 0, obj2, i27)) {
                                aVar.f15713a++;
                                mVarJ = mVarS;
                            } else {
                                mVarJ = mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i27, eVar);
                            }
                        } else {
                            mVarJ = mVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f13442d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = mVar.f(iLowestOneBit2);
                        Object obj4 = mVar.f13442d[iF4];
                        mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(iF4), i10 + 5, eVar.f13421b);
                    }
                }
                objArr3[length2] = mVarJ;
                i25++;
                i24 ^= iLowestOneBit2;
                i12 = i11;
                i13 = 0;
            }
            int i28 = 0;
            while (i23 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i23);
                int i29 = i28 * 2;
                if (mVar.h(iLowestOneBit3)) {
                    int iF5 = mVar.f(iLowestOneBit3);
                    Object[] objArr4 = mVar2.f13442d;
                    objArr4[i29] = mVar.f13442d[iF5];
                    objArr4[i29 + 1] = mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f15713a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr5 = mVar2.f13442d;
                    objArr5[i29] = this.f13442d[iF6];
                    objArr5[i29 + 1] = x(iF6);
                }
                i28++;
                i23 ^= iLowestOneBit3;
            }
            if (!e(mVar2)) {
                return mVar.e(mVar2) ? mVar : mVar2;
            }
        }
        return this;
    }

    public final m n(int i10, Object obj, int i11, e eVar) {
        m mVarN;
        int iH = 1 << p206t6.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (kotlin.jvm.internal.m.b(obj, this.f13442d[iF])) {
                return p(iF, iH, eVar);
            }
        } else if (i(iH)) {
            int iT = t(iH);
            m mVarS = s(iT);
            if (i11 == 30) {
                p064f9.e eVarE0 = R3.a.e0(2, R3.a.j0(0, mVarS.f13442d.length));
                int i12 = eVarE0.f19892a;
                int i13 = eVarE0.f19893b;
                int i14 = eVarE0.f19894c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.b(obj, mVarS.f13442d[i12])) {
                            if (i12 == i13) {
                                mVarN = mVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            mVarN = mVarS.k(i12, eVar);
                            break;
                        }
                    }
                } else {
                    mVarN = mVarS;
                    break;
                }
            } else {
                mVarN = mVarS.n(i10, obj, i11 + 5, eVar);
            }
            return q(mVarS, mVarN, iT, iH, eVar.f13421b);
        }
        return this;
    }

    public final m o(int i10, Object obj, Object obj2, int i11, e eVar) {
        m mVar;
        m mVarO;
        int iH = 1 << p206t6.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (kotlin.jvm.internal.m.b(obj, this.f13442d[iF]) && kotlin.jvm.internal.m.b(obj2, x(iF))) {
                return p(iF, iH, eVar);
            }
        } else if (i(iH)) {
            int iT = t(iH);
            m mVarS = s(iT);
            if (i11 == 30) {
                p064f9.e eVarE0 = R3.a.e0(2, R3.a.j0(0, mVarS.f13442d.length));
                int i12 = eVarE0.f19892a;
                int i13 = eVarE0.f19893b;
                int i14 = eVarE0.f19894c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.b(obj, mVarS.f13442d[i12]) || !kotlin.jvm.internal.m.b(obj2, mVarS.x(i12))) {
                            if (i12 == i13) {
                                mVarO = mVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            mVarO = mVarS.k(i12, eVar);
                            break;
                        }
                    }
                } else {
                    mVarO = mVarS;
                    break;
                }
                mVar = mVarS;
            } else {
                mVar = mVarS;
                mVarO = mVar.o(i10, obj, obj2, i11 + 5, eVar);
            }
            return q(mVar, mVarO, iT, iH, eVar.f13421b);
        }
        return this;
    }

    public final m p(int i10, int i11, e eVar) {
        eVar.b(eVar.f13425f - 1);
        eVar.f13423d = x(i10);
        Object[] objArr = this.f13442d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13441c != eVar.f13421b) {
            return new m(i11 ^ this.f13439a, this.f13440b, p206t6.b.f(i10, objArr), eVar.f13421b);
        }
        this.f13442d = p206t6.b.f(i10, objArr);
        this.f13439a ^= i11;
        return this;
    }

    public final m q(m mVar, m mVar2, int i10, int i11, p016b0.b bVar) {
        p016b0.b bVar2 = this.f13441c;
        if (mVar2 != null) {
            return (bVar2 == bVar || mVar != mVar2) ? r(i10, mVar2, bVar) : this;
        }
        Object[] objArr = this.f13442d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new m(this.f13439a, i11 ^ this.f13440b, p206t6.b.g(i10, objArr), bVar);
        }
        this.f13442d = p206t6.b.g(i10, objArr);
        this.f13440b ^= i11;
        return this;
    }

    public final m r(int i10, m mVar, p016b0.b bVar) {
        Object[] objArr = this.f13442d;
        if (objArr.length == 1 && mVar.f13442d.length == 2 && mVar.f13440b == 0) {
            mVar.f13439a = this.f13440b;
            return mVar;
        }
        if (this.f13441c == bVar) {
            objArr[i10] = mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = mVar;
        return new m(this.f13439a, this.f13440b, objArrCopyOf, bVar);
    }

    public final m s(int i10) {
        Object obj = this.f13442d[i10];
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i10) {
        return (this.f13442d.length - 1) - Integer.bitCount((i10 - 1) & this.f13440b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r14.f117c = w(r12, r4, (Z.m) r14.f117c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A1.d u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.m.u(java.lang.Object, int, int, java.lang.Object):A1.d");
    }

    public final m v(int i10, U u10, int i11) {
        m mVarV;
        int iH = 1 << p206t6.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (kotlin.jvm.internal.m.b(u10, this.f13442d[iF])) {
                Object[] objArr = this.f13442d;
                if (objArr.length != 2) {
                    return new m(this.f13439a ^ iH, this.f13440b, p206t6.b.f(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iH)) {
            int iT = t(iH);
            m mVarS = s(iT);
            if (i11 == 30) {
                p064f9.e eVarE0 = R3.a.e0(2, R3.a.j0(0, mVarS.f13442d.length));
                int i12 = eVarE0.f19892a;
                int i13 = eVarE0.f19893b;
                int i14 = eVarE0.f19894c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.b(u10, mVarS.f13442d[i12])) {
                            if (i12 == i13) {
                                mVarV = mVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            Object[] objArr2 = mVarS.f13442d;
                            if (objArr2.length != 2) {
                                mVarV = new m(0, 0, p206t6.b.f(i12, objArr2), null);
                                break;
                            }
                            mVarV = null;
                            break;
                        }
                    }
                } else {
                    mVarV = mVarS;
                    break;
                }
            } else {
                mVarV = mVarS.v(i10, u10, i11 + 5);
            }
            if (mVarV == null) {
                Object[] objArr3 = this.f13442d;
                if (objArr3.length != 1) {
                    return new m(this.f13439a, iH ^ this.f13440b, p206t6.b.g(iT, objArr3), null);
                }
                return null;
            }
            if (mVarS != mVarV) {
                return w(iT, iH, mVarV);
            }
        }
        return this;
    }

    public final m w(int i10, int i11, m mVar) {
        Object[] objArr = mVar.f13442d;
        if (objArr.length != 2 || mVar.f13440b != 0) {
            Object[] objArr2 = this.f13442d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = mVar;
            return new m(this.f13439a, this.f13440b, objArrCopyOf, null);
        }
        if (this.f13442d.length == 1) {
            mVar.f13439a = this.f13440b;
            return mVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f13442d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.m.e(objArrCopyOf2, "copyOf(this, newSize)");
        N8.m.k0(objArrCopyOf2, i10 + 2, objArrCopyOf2, i10 + 1, objArr3.length);
        N8.m.k0(objArrCopyOf2, iF + 2, objArrCopyOf2, iF, i10);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m(this.f13439a ^ i11, i11 ^ this.f13440b, objArrCopyOf2, null);
    }

    public final Object x(int i10) {
        return this.f13442d[i10 + 1];
    }
}
