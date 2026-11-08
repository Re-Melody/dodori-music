package p048e0;

import N8.n;
import N8.o;
import java.util.ArrayList;
import java.util.Iterator;
import p013a9.a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f19501e = new m(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f19505d;

    public m(long j10, long j11, int i10, int[] iArr) {
        this.f19502a = j10;
        this.f19503b = j11;
        this.f19504c = i10;
        this.f19505d = iArr;
    }

    public final m a(m mVar) {
        m mVarC;
        int[] iArr;
        m mVar2 = f19501e;
        if (mVar == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVar2;
        }
        int i10 = mVar.f19504c;
        int[] iArr2 = mVar.f19505d;
        long j10 = mVar.f19503b;
        long j11 = mVar.f19502a;
        int i11 = this.f19504c;
        if (i10 == i11 && iArr2 == (iArr = this.f19505d)) {
            return new m(this.f19502a & (~j11), this.f19503b & (~j10), i11, iArr);
        }
        if (iArr2 != null) {
            mVarC = this;
            for (int i12 : iArr2) {
                mVarC = mVarC.c(i12);
            }
        } else {
            mVarC = this;
        }
        int i13 = mVar.f19504c;
        if (j10 != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if (((1 << i14) & j10) != 0) {
                    mVarC = mVarC.c(i14 + i13);
                }
            }
        }
        if (j11 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j11) != 0) {
                    mVarC = mVarC.c(i15 + 64 + i13);
                }
            }
        }
        return mVarC;
    }

    public final m c(int i10) {
        int[] iArr;
        int iB;
        int i11 = this.f19504c;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f19503b;
            if ((j11 & j10) != 0) {
                return new m(this.f19502a, j11 & (~j10), i11, this.f19505d);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f19502a;
            if ((j13 & j12) != 0) {
                return new m((~j12) & j13, this.f19503b, i11, this.f19505d);
            }
        } else if (i12 < 0 && (iArr = this.f19505d) != null && (iB = t.b(iArr, i10)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new m(this.f19502a, this.f19503b, this.f19504c, null);
            }
            int[] iArr2 = new int[i13];
            if (iB > 0) {
                N8.m.h0(0, 0, iB, iArr, iArr2);
            }
            if (iB < i13) {
                N8.m.h0(iB, iB + 1, length, iArr, iArr2);
            }
            return new m(this.f19502a, this.f19503b, this.f19504c, iArr2);
        }
        return this;
    }

    public final boolean d(int i10) {
        int[] iArr;
        int i11 = i10 - this.f19504c;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f19503b) != 0;
        }
        if (i11 < 64 || i11 >= 128) {
            return i11 <= 0 && (iArr = this.f19505d) != null && t.b(iArr, i10) >= 0;
        }
        return ((1 << (i11 - 64)) & this.f19502a) != 0;
    }

    public final m h(m mVar) {
        m mVarI;
        int[] iArr;
        m mVarI2 = mVar;
        m mVar2 = f19501e;
        if (mVarI2 == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVarI2;
        }
        int i10 = mVarI2.f19504c;
        long j10 = this.f19503b;
        long j11 = this.f19502a;
        int[] iArr2 = mVarI2.f19505d;
        long j12 = mVarI2.f19503b;
        long j13 = mVarI2.f19502a;
        int i11 = this.f19504c;
        if (i10 == i11 && iArr2 == (iArr = this.f19505d)) {
            return new m(j11 | j13, j10 | j12, i11, iArr);
        }
        int i12 = 0;
        int[] iArr3 = this.f19505d;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i13 : iArr3) {
                    mVarI2 = mVarI2.i(i13);
                }
            }
            int i14 = this.f19504c;
            if (j10 != 0) {
                for (int i15 = 0; i15 < 64; i15++) {
                    if (((1 << i15) & j10) != 0) {
                        mVarI2 = mVarI2.i(i15 + i14);
                    }
                }
            }
            if (j11 != 0) {
                while (i12 < 64) {
                    if (((1 << i12) & j11) != 0) {
                        mVarI2 = mVarI2.i(i12 + 64 + i14);
                    }
                    i12++;
                }
            }
            return mVarI2;
        }
        if (iArr2 != null) {
            mVarI = this;
            for (int i16 : iArr2) {
                mVarI = mVarI.i(i16);
            }
        } else {
            mVarI = this;
        }
        int i17 = mVarI2.f19504c;
        if (j12 != 0) {
            for (int i18 = 0; i18 < 64; i18++) {
                if (((1 << i18) & j12) != 0) {
                    mVarI = mVarI.i(i18 + i17);
                }
            }
        }
        if (j13 != 0) {
            while (i12 < 64) {
                if (((1 << i12) & j13) != 0) {
                    mVarI = mVarI.i(i12 + 64 + i17);
                }
                i12++;
            }
        }
        return mVarI;
    }

    public final m i(int i10) {
        long j10;
        int i11;
        long j11;
        int i12 = this.f19504c;
        int i13 = i10 - i12;
        long j12 = this.f19503b;
        long j13 = 1;
        if (i13 < 0 || i13 >= 64) {
            long j14 = this.f19502a;
            if (i13 < 64 || i13 >= 128) {
                int[] iArrV0 = this.f19505d;
                if (i13 < 128) {
                    if (iArrV0 == null) {
                        return new m(j14, j12, i12, new int[]{i10});
                    }
                    int iB = t.b(iArrV0, i10);
                    if (iB < 0) {
                        int i14 = -(iB + 1);
                        int length = iArrV0.length;
                        int[] iArr = new int[length + 1];
                        N8.m.h0(0, 0, i14, iArrV0, iArr);
                        N8.m.h0(i14 + 1, i14, length, iArrV0, iArr);
                        iArr[i14] = i10;
                        return new m(this.f19502a, this.f19503b, this.f19504c, iArr);
                    }
                } else if (!d(i10)) {
                    int i15 = ((i10 + 1) / 64) * 64;
                    int i16 = this.f19504c;
                    ArrayList arrayList = null;
                    long j15 = j14;
                    while (true) {
                        if (i16 >= i15) {
                            j10 = j12;
                            i11 = i16;
                            break;
                        }
                        if (j12 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrV0 != null) {
                                    int length2 = iArrV0.length;
                                    int i17 = 0;
                                    while (i17 < length2) {
                                        arrayList.add(Integer.valueOf(iArrV0[i17]));
                                        i17++;
                                        j13 = j13;
                                    }
                                }
                            }
                            j11 = j13;
                            for (int i18 = 0; i18 < 64; i18++) {
                                if (((j11 << i18) & j12) != 0) {
                                    arrayList.add(Integer.valueOf(i18 + i16));
                                }
                            }
                        } else {
                            j11 = j13;
                        }
                        if (j15 == 0) {
                            i11 = i15;
                            j10 = 0;
                            break;
                        }
                        i16 += 64;
                        j12 = j15;
                        j13 = j11;
                        j15 = 0;
                    }
                    if (arrayList != null) {
                        iArrV0 = n.V0(arrayList);
                    }
                    return new m(j15, j10, i11, iArrV0).i(i10);
                }
            } else {
                long j16 = 1 << (i13 - 64);
                if ((j14 & j16) == 0) {
                    return new m(j16 | j14, j12, i12, this.f19505d);
                }
            }
        } else {
            long j17 = 1 << i13;
            if ((j12 & j17) == 0) {
                return new m(this.f19502a, j12 | j17, i12, this.f19505d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return R3.a.S(new l(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(o.o0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
