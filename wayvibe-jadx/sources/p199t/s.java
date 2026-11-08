package p199t;

import N8.m;
import com.amazon.a.a.o.b.f;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f26321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f26322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26325f;

    public final int a(int i10) {
        int i11 = this.f26323d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26320a;
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

    public final Object b(long j10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f26323d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f26320a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f26321b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f26322c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, E.e(i10)) : 0;
        this.f26323d = iMax;
        if (iMax == 0) {
            jArr = E.f26264a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.q0(jArr);
        }
        this.f26320a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f26325f = E.c(this.f26323d) - this.f26324e;
        this.f26321b = new long[iMax];
        this.f26322c = new Object[iMax];
    }

    public final void d(long j10, w wVar) {
        long j11;
        int i10;
        int i11;
        long j12;
        int iNumberOfTrailingZeros;
        long[] jArr;
        long[] jArr2;
        int i12;
        int i13 = -862048943;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f26323d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f26320a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j13 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j14 = i16;
            int i23 = i19;
            int i24 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j16) >> 3)) & i17;
                int i25 = i13;
                if (this.f26321b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
                j16 &= j16 - 1;
                i13 = i25;
            }
            int i26 = i13;
            char c3 = '\b';
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iA = a(i15);
                long j17 = 255;
                if (this.f26325f != 0 || ((this.f26320a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    i10 = 0;
                    i11 = 1;
                    j12 = 128;
                } else {
                    int i27 = this.f26323d;
                    if (i27 <= 8 || Long.compare((((long) this.f26324e) * 32) ^ Long.MIN_VALUE, (((long) i27) * 25) ^ Long.MIN_VALUE) > 0) {
                        j11 = 255;
                        i10 = 0;
                        i11 = 1;
                        j12 = 128;
                        int iD = E.d(this.f26323d);
                        long[] jArr4 = this.f26320a;
                        long[] jArr5 = this.f26321b;
                        Object[] objArr = this.f26322c;
                        int i28 = this.f26323d;
                        c(iD);
                        long[] jArr6 = this.f26320a;
                        long[] jArr7 = this.f26321b;
                        Object[] objArr2 = this.f26322c;
                        int i29 = this.f26323d;
                        int i30 = 0;
                        while (i30 < i28) {
                            if (((jArr4[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < 128) {
                                long j18 = jArr5[i30];
                                int iHashCode2 = Long.hashCode(j18) * i26;
                                int i31 = iHashCode2 ^ (iHashCode2 << 16);
                                jArr = jArr6;
                                int iA2 = a(i31 >>> 7);
                                long j19 = i31 & 127;
                                int i32 = iA2 >> 3;
                                int i33 = (iA2 & 7) << 3;
                                long j20 = (jArr[i32] & (~(255 << i33))) | (j19 << i33);
                                jArr[i32] = j20;
                                jArr[(((iA2 - 7) & i29) + (i29 & 7)) >> 3] = j20;
                                jArr7[iA2] = j18;
                                objArr2[iA2] = objArr[i30];
                            } else {
                                jArr = jArr6;
                            }
                            i30++;
                            jArr6 = jArr;
                            jArr4 = jArr4;
                        }
                    } else {
                        long[] jArr8 = this.f26320a;
                        int i34 = this.f26323d;
                        long[] jArr9 = this.f26321b;
                        Object[] objArr3 = this.f26322c;
                        E.a(jArr8, i34);
                        int i35 = 0;
                        int iB = -1;
                        j12 = 128;
                        while (i35 != i34) {
                            int i36 = i35 >> 3;
                            int i37 = (i35 & 7) << 3;
                            long j21 = (jArr8[i36] >> i37) & j17;
                            if (j21 == 128) {
                                iB = i35;
                                i35++;
                            } else if (j21 != 254) {
                                i35++;
                            } else {
                                int iHashCode3 = Long.hashCode(jArr9[i35]) * i26;
                                int i38 = iHashCode3 ^ (iHashCode3 << 16);
                                char c9 = c3;
                                int i39 = i38 >>> 7;
                                int iA3 = a(i39);
                                int i40 = i39 & i34;
                                long j22 = j17;
                                if (((iA3 - i40) & i34) / 8 == ((i35 - i40) & i34) / 8) {
                                    int i41 = i24;
                                    int i42 = i22;
                                    jArr8[i36] = (((long) (i38 & 127)) << i37) | (jArr8[i36] & (~(j22 << i37)));
                                    jArr8[jArr8.length - i42] = (jArr8[i41] & 72057594037927935L) | Long.MIN_VALUE;
                                    i35++;
                                    i22 = i42;
                                    c3 = c9;
                                    j17 = j22;
                                    i24 = i41;
                                } else {
                                    int i43 = i24;
                                    int i44 = i22;
                                    int i45 = iA3 >> 3;
                                    long j23 = jArr8[i45];
                                    int i46 = (iA3 & 7) << 3;
                                    if (((j23 >> i46) & j22) == 128) {
                                        jArr2 = jArr9;
                                        int i47 = i35;
                                        jArr8[i45] = ((~(j22 << i46)) & j23) | (((long) (i38 & 127)) << i46);
                                        jArr8[i36] = (jArr8[i36] & (~(j22 << i37))) | (128 << i37);
                                        jArr2[iA3] = jArr2[i47];
                                        jArr2[i47] = 0;
                                        objArr3[iA3] = objArr3[i47];
                                        objArr3[i47] = null;
                                        i12 = i47;
                                        iB = i12;
                                    } else {
                                        int i48 = i35;
                                        jArr2 = jArr9;
                                        jArr8[i45] = ((~(j22 << i46)) & j23) | (((long) (i38 & 127)) << i46);
                                        if (iB == -1) {
                                            iB = E.b(jArr8, i48 + 1, i34);
                                        }
                                        jArr2[iB] = jArr2[iA3];
                                        jArr2[iA3] = jArr2[i48];
                                        jArr2[i48] = jArr2[iB];
                                        objArr3[iB] = objArr3[iA3];
                                        objArr3[iA3] = objArr3[i48];
                                        objArr3[i48] = objArr3[iB];
                                        i12 = i48 - 1;
                                    }
                                    jArr8[jArr8.length - 1] = (jArr8[i43] & 72057594037927935L) | Long.MIN_VALUE;
                                    i35 = i12 + 1;
                                    c3 = c9;
                                    jArr9 = jArr2;
                                    j17 = j22;
                                    i24 = i43;
                                    i22 = i44;
                                }
                            }
                        }
                        j11 = j17;
                        i10 = i24;
                        i11 = i22;
                        this.f26325f = E.c(this.f26323d) - this.f26324e;
                    }
                    iA = a(i15);
                }
                iNumberOfTrailingZeros = iA;
                this.f26324e++;
                int i49 = this.f26325f;
                long[] jArr10 = this.f26320a;
                int i50 = iNumberOfTrailingZeros >> 3;
                long j24 = jArr10[i50];
                int i51 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j24 >> i51) & j11) == j12) {
                    i10 = i11;
                }
                this.f26325f = i49 - i10;
                int i52 = this.f26323d;
                long j25 = (j24 & (~(j11 << i51))) | (j14 << i51);
                jArr10[i50] = j25;
                jArr10[(((iNumberOfTrailingZeros - 7) & i52) + (i52 & 7)) >> 3] = j25;
                break;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i26;
        }
        this.f26321b[iNumberOfTrailingZeros] = j10;
        this.f26322c[iNumberOfTrailingZeros] = wVar;
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        Object[] objArr;
        boolean z10;
        int i10;
        Object[] objArr2;
        long j10;
        char c3;
        long j11;
        long[] jArr2;
        int i11;
        if (obj != this) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (sVar.f26324e == this.f26324e) {
                    long[] jArr3 = this.f26321b;
                    Object[] objArr3 = this.f26322c;
                    long[] jArr4 = this.f26320a;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j12 = jArr4[i12];
                            char c9 = 7;
                            long j13 = -9187201950435737472L;
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8;
                                int i14 = 8 - ((~(i12 - length)) >>> 31);
                                int i15 = 0;
                                z10 = true;
                                while (i15 < i14) {
                                    if ((j12 & 255) < 128) {
                                        int i16 = (i12 << 3) + i15;
                                        objArr2 = objArr3;
                                        long j14 = jArr3[i16];
                                        c3 = c9;
                                        Object obj2 = objArr2[i16];
                                        if (obj2 != null) {
                                            i10 = i15;
                                            j10 = j12;
                                            j11 = j13;
                                            jArr2 = jArr3;
                                            if (!obj2.equals(sVar.b(j14))) {
                                                return false;
                                            }
                                        } else {
                                            if (sVar.b(j14) != null) {
                                                return false;
                                            }
                                            int iHashCode = Long.hashCode(j14) * (-862048943);
                                            int i17 = iHashCode ^ (iHashCode << 16);
                                            j11 = j13;
                                            int i18 = i17 & 127;
                                            int i19 = sVar.f26323d;
                                            int i20 = (i17 >>> 7) & i19;
                                            int i21 = 0;
                                            while (true) {
                                                long[] jArr5 = sVar.f26320a;
                                                int i22 = i20 >> 3;
                                                int i23 = (i20 & 7) << 3;
                                                long j15 = jArr5[i22] >>> i23;
                                                long j16 = jArr5[i22 + 1] << (64 - i23);
                                                i10 = i15;
                                                jArr2 = jArr3;
                                                long j17 = j15 | (j16 & ((-i23) >> 63));
                                                j10 = j12;
                                                long j18 = (((long) i18) * 72340172838076673L) ^ j17;
                                                for (long j19 = (j18 - 72340172838076673L) & (~j18) & j11; j19 != 0; j19 &= j19 - 1) {
                                                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j19) >> 3) + i20) & i19;
                                                    if (sVar.f26321b[iNumberOfTrailingZeros] == j14) {
                                                        i11 = iNumberOfTrailingZeros;
                                                        break;
                                                    }
                                                }
                                                if ((j17 & ((~j17) << 6) & j11) != 0) {
                                                    i11 = -1;
                                                    break;
                                                }
                                                i21 += 8;
                                                i20 = (i20 + i21) & i19;
                                                jArr3 = jArr2;
                                                i15 = i10;
                                                j12 = j10;
                                            }
                                            if (!(i11 >= 0)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        i10 = i15;
                                        objArr2 = objArr3;
                                        j10 = j12;
                                        c3 = c9;
                                        j11 = j13;
                                        jArr2 = jArr3;
                                    }
                                    j12 = j10 >> i13;
                                    i15 = i10 + 1;
                                    c9 = c3;
                                    jArr3 = jArr2;
                                    objArr3 = objArr2;
                                    j13 = j11;
                                    i13 = i13;
                                }
                                objArr = objArr3;
                                int i24 = i13;
                                jArr = jArr3;
                                if (i14 != i24) {
                                    return true;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                z10 = true;
                            }
                            if (i12 == length) {
                                return z10;
                            }
                            i12++;
                            jArr3 = jArr;
                            objArr3 = objArr;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f26321b;
        Object[] objArr = this.f26322c;
        long[] jArr2 = this.f26320a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        long j11 = jArr[i13];
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j11);
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

    public final String toString() {
        int i10;
        int i11;
        if (this.f26324e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f26321b;
        Object[] objArr = this.f26322c;
        long[] jArr2 = this.f26320a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j11 = jArr[i16];
                            Object obj = objArr[i16];
                            sb.append(j11);
                            sb.append(f.f16452b);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i13++;
                            if (i13 < this.f26324e) {
                                sb.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.e(string, "s.append('}').toString()");
        return string;
    }
}
