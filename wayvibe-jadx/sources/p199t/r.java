package p199t;

import N8.m;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f26316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26319e;

    public r(int i10) {
        this.f26315a = E.f26264a;
        this.f26316b = j.f26292a;
        if (i10 >= 0) {
            e(E.f(i10));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final boolean a(int i10) {
        long j10;
        boolean z10;
        long j11;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i11 = this.f26318d;
        int i12 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f26317c;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f26315a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            boolean z11 = true;
            int i21 = i18;
            long j12 = (((-i20) >> 63) & (jArr2[i19 + 1] << (64 - i20))) | (jArr2[i19] >>> i20);
            long j13 = i15;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                int i22 = i12;
                if (this.f26316b[iNumberOfTrailingZeros] == i10) {
                    z10 = true;
                    break loop0;
                }
                j15 &= j15 - 1;
                i12 = i22;
            }
            int i23 = i12;
            long j16 = j12 & ((~j12) << 6) & (-9187201950435737472L);
            char c3 = '\b';
            if (j16 != 0) {
                int iD = d(i14);
                long j17 = 255;
                if (this.f26319e != 0 || ((this.f26315a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    z10 = true;
                    j11 = 128;
                } else {
                    int i24 = this.f26317c;
                    if (i24 > 8) {
                        j11 = 128;
                        if (Long.compare((((long) this.f26318d) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26315a;
                            int i25 = this.f26317c;
                            int[] iArr2 = this.f26316b;
                            E.a(jArr3, i25);
                            int i26 = 0;
                            int iB = -1;
                            while (i26 != i25) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j18 = (jArr3[i27] >> i28) & j17;
                                if (j18 == 128) {
                                    iB = i26;
                                    i26++;
                                } else if (j18 != 254) {
                                    i26++;
                                } else {
                                    int iHashCode2 = Integer.hashCode(iArr2[i26]) * i23;
                                    int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                    c3 = c3;
                                    int i30 = i29 >>> 7;
                                    int iD2 = d(i30);
                                    int i31 = i30 & i25;
                                    long j19 = j17;
                                    if (((iD2 - i31) & i25) / 8 == ((i26 - i31) & i25) / 8) {
                                        jArr3[i27] = (jArr3[i27] & (~(j19 << i28))) | (((long) (i29 & 127)) << i28);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                    } else {
                                        int i32 = iD2 >> 3;
                                        long j20 = jArr3[i32];
                                        int i33 = (iD2 & 7) << 3;
                                        if (((j20 >> i33) & j19) == 128) {
                                            iArr = iArr2;
                                            jArr3[i32] = ((~(j19 << i33)) & j20) | (((long) (i29 & 127)) << i33);
                                            jArr3[i27] = (jArr3[i27] & (~(j19 << i28))) | (128 << i28);
                                            iArr[iD2] = iArr[i26];
                                            iArr[i26] = 0;
                                            iB = i26;
                                        } else {
                                            iArr = iArr2;
                                            jArr3[i32] = ((~(j19 << i33)) & j20) | (((long) (i29 & 127)) << i33);
                                            if (iB == -1) {
                                                iB = E.b(jArr3, i26 + 1, i25);
                                            }
                                            iArr[iB] = iArr[iD2];
                                            iArr[iD2] = iArr[i26];
                                            iArr[i26] = iArr[iB];
                                            i26--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        iArr2 = iArr;
                                    }
                                    j17 = j19;
                                }
                            }
                            j10 = j17;
                            this.f26319e = E.c(this.f26317c) - this.f26318d;
                        }
                        z10 = z11;
                        iD = d(i14);
                    } else {
                        j11 = 128;
                    }
                    j10 = 255;
                    int iD3 = E.d(this.f26317c);
                    long[] jArr4 = this.f26315a;
                    int[] iArr3 = this.f26316b;
                    int i34 = this.f26317c;
                    e(iD3);
                    long[] jArr5 = this.f26315a;
                    int[] iArr4 = this.f26316b;
                    int i35 = this.f26317c;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr4[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j11) {
                            int i37 = iArr3[i36];
                            int iHashCode3 = Integer.hashCode(i37) * i23;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD4 = d(i38 >>> 7);
                            jArr = jArr5;
                            long j21 = i38 & 127;
                            int i39 = iD4 >> 3;
                            int i40 = (iD4 & 7) << 3;
                            long j22 = (jArr[i39] & (~(255 << i40))) | (j21 << i40);
                            jArr[i39] = j22;
                            jArr[(((iD4 - 7) & i35) + (i35 & 7)) >> 3] = j22;
                            iArr4[iD4] = i37;
                        } else {
                            jArr = jArr5;
                        }
                        i36++;
                        z11 = z11;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    z10 = z11;
                    iD = d(i14);
                }
                iNumberOfTrailingZeros = iD;
                this.f26318d++;
                int i41 = this.f26319e;
                long[] jArr6 = this.f26315a;
                int i42 = iNumberOfTrailingZeros >> 3;
                long j23 = jArr6[i42];
                int i43 = (iNumberOfTrailingZeros & 7) << 3;
                this.f26319e = i41 - (((j23 >> i43) & j10) == j11 ? z10 : 0);
                int i44 = this.f26317c;
                long j24 = (j23 & (~(j10 << i43))) | (j13 << i43);
                jArr6[i42] = j24;
                jArr6[(((iNumberOfTrailingZeros - 7) & i44) + (i44 & 7)) >> 3] = j24;
                break;
            }
            i18 = i21 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i23;
        }
        this.f26316b[iNumberOfTrailingZeros] = i10;
        if (this.f26318d != i11) {
            return z10;
        }
        return false;
    }

    public final void b() {
        this.f26318d = 0;
        long[] jArr = this.f26315a;
        if (jArr != E.f26264a) {
            m.q0(jArr);
            long[] jArr2 = this.f26315a;
            int i10 = this.f26317c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f26319e = E.c(this.f26317c) - this.f26318d;
    }

    public final boolean c(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26317c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f26315a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f26316b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(int i10) {
        int i11 = this.f26317c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26315a;
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

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, E.e(i10)) : 0;
        this.f26317c = iMax;
        if (iMax == 0) {
            jArr = E.f26264a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.q0(jArr);
        }
        this.f26315a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f26319e = E.c(this.f26317c) - this.f26318d;
        this.f26316b = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f26318d != this.f26318d) {
            return false;
        }
        int[] iArr = this.f26316b;
        long[] jArr = this.f26315a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !rVar.c(iArr[(i10 << 3) + i12])) {
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
        this.f26318d--;
        long[] jArr = this.f26315a;
        int i11 = this.f26317c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final int hashCode() {
        int[] iArr = this.f26316b;
        long[] jArr = this.f26315a;
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
                        iHashCode = Integer.hashCode(iArr[(i10 << 3) + i12]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f26316b;
        long[] jArr = this.f26315a;
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
                        int i14 = iArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i14);
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

    public /* synthetic */ r() {
        this(6);
    }
}
