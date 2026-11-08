package p199t;

import N8.m;
import U.U0;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26261e;

    public B(int i10) {
        this.f26257a = E.f26264a;
        this.f26258b = a.f27015c;
        if (i10 >= 0) {
            f(E.f(i10));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f26260d;
        this.f26258b[d(obj)] = obj;
        return this.f26260d != i10;
    }

    public final void b() {
        this.f26260d = 0;
        long[] jArr = this.f26257a;
        if (jArr != E.f26264a) {
            m.q0(jArr);
            long[] jArr2 = this.f26257a;
            int i10 = this.f26259c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m.p0(this.f26258b, 0, this.f26259c);
        this.f26261e = E.c(this.f26259c) - this.f26260d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f26259c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f26257a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.b(this.f26258b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        long j10;
        long j11;
        long j12;
        long[] jArr;
        Object[] objArr;
        int i10 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f26259c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f26257a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j13 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
            long j14 = i13;
            int i19 = i13;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j16) >> 3)) & i14;
                int i20 = i10;
                if (kotlin.jvm.internal.m.b(this.f26258b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i10 = i20;
            }
            int i21 = i10;
            char c3 = '\b';
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                long j17 = 128;
                long j18 = 255;
                if (this.f26261e != 0 || ((this.f26257a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j10 = 128;
                    j11 = 255;
                    j12 = j14;
                } else {
                    int i22 = this.f26259c;
                    if (i22 <= 8 || Long.compare((((long) this.f26260d) * 32) ^ Long.MIN_VALUE, (((long) i22) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = 128;
                        j11 = 255;
                        j12 = j14;
                        int iD = E.d(this.f26259c);
                        long[] jArr3 = this.f26257a;
                        Object[] objArr2 = this.f26258b;
                        int i23 = this.f26259c;
                        f(iD);
                        long[] jArr4 = this.f26257a;
                        Object[] objArr3 = this.f26258b;
                        int i24 = this.f26259c;
                        int i25 = 0;
                        while (i25 < i23) {
                            if (((jArr3[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i25];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i26 >>> 7);
                                long j19 = i26 & 127;
                                int i27 = iE2 >> 3;
                                int i28 = (iE2 & 7) << 3;
                                jArr = jArr4;
                                long j20 = (jArr4[i27] & (~(255 << i28))) | (j19 << i28);
                                jArr[i27] = j20;
                                jArr[(((iE2 - 7) & i24) + (i24 & 7)) >> 3] = j20;
                                objArr3[iE2] = obj2;
                            } else {
                                jArr = jArr4;
                            }
                            i25++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f26257a;
                        int i29 = this.f26259c;
                        Object[] objArr4 = this.f26258b;
                        E.a(jArr5, i29);
                        int i30 = 0;
                        int iB = -1;
                        while (i30 != i29) {
                            int i31 = i30 >> 3;
                            int i32 = (i30 & 7) << 3;
                            long j21 = (jArr5[i31] >> i32) & j18;
                            if (j21 == j17) {
                                iB = i30;
                                i30++;
                            } else if (j21 != 254) {
                                i30++;
                            } else {
                                Object obj3 = objArr4[i30];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i21;
                                int i33 = iHashCode3 ^ (iHashCode3 << 16);
                                char c9 = c3;
                                int i34 = i33 >>> 7;
                                int iE3 = e(i34);
                                int i35 = i34 & i29;
                                long j22 = j17;
                                if (((iE3 - i35) & i29) / 8 == ((i30 - i35) & i29) / 8) {
                                    long j23 = j18;
                                    jArr5[i31] = (((long) (i33 & 127)) << i32) | (jArr5[i31] & (~(j23 << i32)));
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30++;
                                    c3 = c9;
                                    j17 = j22;
                                    j18 = j23;
                                } else {
                                    long j24 = j18;
                                    int i36 = iE3 >> 3;
                                    long j25 = jArr5[i36];
                                    int i37 = (iE3 & 7) << 3;
                                    if (((j25 >> i37) & j24) == j22) {
                                        objArr = objArr4;
                                        jArr5[i36] = ((~(j24 << i37)) & j25) | (((long) (i33 & 127)) << i37);
                                        jArr5[i31] = (jArr5[i31] & (~(j24 << i32))) | (j22 << i32);
                                        objArr[iE3] = objArr[i30];
                                        objArr[i30] = null;
                                        iB = i30;
                                    } else {
                                        objArr = objArr4;
                                        jArr5[i36] = (((long) (i33 & 127)) << i37) | (j25 & (~(j24 << i37)));
                                        if (iB == -1) {
                                            iB = E.b(jArr5, i30 + 1, i29);
                                        }
                                        objArr[iB] = objArr[iE3];
                                        objArr[iE3] = objArr[i30];
                                        objArr[i30] = objArr[iB];
                                        i30--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30++;
                                    objArr4 = objArr;
                                    c3 = c9;
                                    j17 = j22;
                                    j18 = j24;
                                    j14 = j14;
                                }
                            }
                        }
                        j10 = j17;
                        j11 = j18;
                        j12 = j14;
                        this.f26261e = E.c(this.f26259c) - this.f26260d;
                    }
                    iE = e(i12);
                }
                this.f26260d++;
                int i38 = this.f26261e;
                long[] jArr6 = this.f26257a;
                int i39 = iE >> 3;
                long j26 = jArr6[i39];
                int i40 = (iE & 7) << 3;
                this.f26261e = i38 - (((j26 >> i40) & j11) == j10 ? 1 : 0);
                int i41 = this.f26259c;
                long j27 = (j26 & (~(j11 << i40))) | (j12 << i40);
                jArr6[i39] = j27;
                jArr6[(((iE - 7) & i41) + (i41 & 7)) >> 3] = j27;
                return iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f26259c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26257a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        if (b10.f26260d != this.f26260d) {
            return false;
        }
        Object[] objArr = this.f26258b;
        long[] jArr = this.f26257a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !b10.c(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, E.e(i10)) : 0;
        this.f26259c = iMax;
        if (iMax == 0) {
            jArr = E.f26264a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.q0(jArr);
        }
        this.f26257a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f26261e = E.c(this.f26259c) - this.f26260d;
        this.f26258b = new Object[iMax];
    }

    public final boolean g() {
        return this.f26260d == 0;
    }

    public final boolean h() {
        return this.f26260d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f26258b;
        long[] jArr = this.f26257a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final void i(B elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Object[] objArr = elements.f26258b;
        long[] jArr = elements.f26257a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        this.f26258b[d(obj)] = obj;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean j(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f26259c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f26257a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.b(this.f26258b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            k(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void k(int i10) {
        this.f26260d--;
        long[] jArr = this.f26257a;
        int i11 = this.f26259c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f26258b[i10] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:0: B:5:0x001b->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[SYNTHETIC] */
    public final String toString() {
        U0 u10 = new U0(this, 1);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f26258b;
        long[] jArr = this.f26257a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) u10.invoke(obj));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i10 == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i10++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ B() {
        this(6);
    }
}
