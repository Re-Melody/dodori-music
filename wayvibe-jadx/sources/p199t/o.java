package p199t;

import N8.m;
import com.amazon.a.a.o.b.f;
import java.util.NoSuchElementException;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26301a = E.f26264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f26302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f26303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26306f;

    public o() {
        int[] iArr = j.f26292a;
        this.f26302b = iArr;
        this.f26303c = iArr;
        f(E.f(6));
    }

    public final void a() {
        this.f26305e = 0;
        long[] jArr = this.f26301a;
        if (jArr != E.f26264a) {
            m.q0(jArr);
            long[] jArr2 = this.f26301a;
            int i10 = this.f26304d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f26306f = E.c(this.f26304d) - this.f26305e;
    }

    public final int b(int i10) {
        int i11 = this.f26304d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26301a;
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

    public final int c(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26304d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f26301a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f26302b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int d(int i10) {
        int iC = c(i10);
        if (iC >= 0) {
            return this.f26303c[iC];
        }
        throw new NoSuchElementException(b.j(i10, "Cannot find value for key "));
    }

    public final int e(int i10) {
        int iC = c(i10);
        if (iC >= 0) {
            return this.f26303c[iC];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0023->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.f26305e != this.f26305e) {
            return false;
        }
        int[] iArr = this.f26302b;
        int[] iArr2 = this.f26303c;
        long[] jArr = this.f26301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (iArr2[i13] != oVar.d(iArr[i13])) {
                                return false;
                            }
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
        this.f26304d = iMax;
        if (iMax == 0) {
            jArr = E.f26264a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.q0(jArr);
        }
        this.f26301a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f26306f = E.c(this.f26304d) - this.f26305e;
        this.f26302b = new int[iMax];
        this.f26303c = new int[iMax];
    }

    public final void g(int i10, int i11) {
        long j10;
        long j11;
        int i12;
        int i13;
        long j12;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i14;
        int i15 = i10;
        int i16 = -862048943;
        int iHashCode = Integer.hashCode(i15) * (-862048943);
        int i17 = iHashCode ^ (iHashCode << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = this.f26304d;
        int i21 = i18 & i20;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f26301a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            int i25 = 1;
            int i26 = i22;
            int i27 = 0;
            long j13 = (((-i24) >> 63) & (jArr2[i23 + 1] << (64 - i24))) | (jArr2[i23] >>> i24);
            long j14 = i19;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i21) & i20;
                int i28 = i16;
                if (this.f26302b[iNumberOfTrailingZeros] == i15) {
                    break loop0;
                }
                j16 &= j16 - 1;
                i16 = i28;
            }
            int i29 = i16;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i18);
                long j17 = 255;
                if (this.f26306f != 0 || ((this.f26301a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j10 = j14;
                    j11 = 255;
                    i12 = 1;
                    i13 = 0;
                    j12 = 128;
                } else {
                    int i30 = this.f26304d;
                    if (i30 > 8) {
                        j12 = 128;
                        if (Long.compare((((long) this.f26305e) * 32) ^ Long.MIN_VALUE, (((long) i30) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26301a;
                            int i31 = this.f26304d;
                            int[] iArr = this.f26302b;
                            int[] iArr2 = this.f26303c;
                            E.a(jArr3, i31);
                            int i32 = 0;
                            int iB2 = -1;
                            while (i32 != i31) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j18 = (jArr3[i33] >> i34) & j17;
                                if (j18 == 128) {
                                    int i35 = i32;
                                    i32++;
                                    iB2 = i35;
                                } else if (j18 != 254) {
                                    i32++;
                                } else {
                                    int iHashCode2 = Integer.hashCode(iArr[i32]) * i29;
                                    int i36 = iHashCode2 ^ (iHashCode2 << 16);
                                    long j19 = j17;
                                    int i37 = i36 >>> 7;
                                    int iB3 = b(i37);
                                    int i38 = i37 & i31;
                                    int i39 = i25;
                                    if (((iB3 - i38) & i31) / 8 == ((i32 - i38) & i31) / 8) {
                                        jArr3[i33] = (jArr3[i33] & (~(j19 << i34))) | (((long) (i36 & 127)) << i34);
                                        jArr3[jArr3.length - 1] = (jArr3[i27] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                    } else {
                                        int i40 = iB3 >> 3;
                                        long j20 = jArr3[i40];
                                        int i41 = (iB3 & 7) << 3;
                                        if (((j20 >> i41) & j19) == 128) {
                                            i14 = i27;
                                            jArr3[i40] = (((long) (i36 & 127)) << i41) | (j20 & (~(j19 << i41)));
                                            jArr3[i33] = (jArr3[i33] & (~(j19 << i34))) | (128 << i34);
                                            iArr[iB3] = iArr[i32];
                                            iArr[i32] = i14;
                                            iArr2[iB3] = iArr2[i32];
                                            iArr2[i32] = i14;
                                            iB2 = i32;
                                        } else {
                                            i14 = i27;
                                            jArr3[i40] = (((long) (i36 & 127)) << i41) | (j20 & (~(j19 << i41)));
                                            if (iB2 == -1) {
                                                iB2 = E.b(jArr3, i32 + 1, i31);
                                            }
                                            iArr[iB2] = iArr[iB3];
                                            iArr[iB3] = iArr[i32];
                                            iArr[i32] = iArr[iB2];
                                            iArr2[iB2] = iArr2[iB3];
                                            iArr2[iB3] = iArr2[i32];
                                            iArr2[i32] = iArr2[iB2];
                                            i32--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i14] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                        i27 = i14;
                                    }
                                    j17 = j19;
                                    i25 = i39;
                                    j14 = j14;
                                }
                            }
                            j10 = j14;
                            j11 = j17;
                            i12 = i25;
                            i13 = i27;
                            this.f26306f = E.c(this.f26304d) - this.f26305e;
                        }
                        iB = b(i18);
                    } else {
                        j12 = 128;
                    }
                    j10 = j14;
                    j11 = 255;
                    i12 = 1;
                    i13 = 0;
                    int iD = E.d(this.f26304d);
                    long[] jArr4 = this.f26301a;
                    int[] iArr3 = this.f26302b;
                    int[] iArr4 = this.f26303c;
                    int i42 = this.f26304d;
                    f(iD);
                    long[] jArr5 = this.f26301a;
                    int[] iArr5 = this.f26302b;
                    int[] iArr6 = this.f26303c;
                    int i43 = this.f26304d;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr4[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j12) {
                            int i45 = iArr3[i44];
                            int iHashCode3 = Integer.hashCode(i45) * i29;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i46 >>> 7);
                            jArr = jArr5;
                            long j21 = i46 & 127;
                            int i47 = iB4 >> 3;
                            int i48 = (iB4 & 7) << 3;
                            long j22 = (jArr[i47] & (~(255 << i48))) | (j21 << i48);
                            jArr[i47] = j22;
                            jArr[(((iB4 - 7) & i43) + (i43 & 7)) >> 3] = j22;
                            iArr5[iB4] = i45;
                            iArr6[iB4] = iArr4[i44];
                        } else {
                            jArr = jArr5;
                        }
                        i44++;
                        jArr5 = jArr;
                    }
                    iB = b(i18);
                }
                this.f26305e++;
                int i49 = this.f26306f;
                long[] jArr6 = this.f26301a;
                int i50 = iB >> 3;
                long j23 = jArr6[i50];
                int i51 = (iB & 7) << 3;
                if (((j23 >> i51) & j11) != j12) {
                    i12 = i13;
                }
                this.f26306f = i49 - i12;
                int i52 = this.f26304d;
                long j24 = (j23 & (~(j11 << i51))) | (j10 << i51);
                jArr6[i50] = j24;
                jArr6[(((iB - 7) & i52) + (i52 & 7)) >> 3] = j24;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i22 = i26 + 8;
            i21 = (i21 + i22) & i20;
            i15 = i10;
            i16 = i29;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f26302b[iNumberOfTrailingZeros] = i10;
        this.f26303c[iNumberOfTrailingZeros] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f26302b;
        int[] iArr2 = this.f26303c;
        long[] jArr = this.f26301a;
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
                        int i13 = (i10 << 3) + i12;
                        int i14 = iArr[i13];
                        iHashCode += Integer.hashCode(iArr2[i13]) ^ Integer.hashCode(i14);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f26305e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f26302b;
        int[] iArr2 = this.f26303c;
        long[] jArr = this.f26301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            sb.append(i15);
                            sb.append(f.f16452b);
                            sb.append(i16);
                            i11++;
                            if (i11 < this.f26305e) {
                                sb.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.e(string, "s.append('}').toString()");
        return string;
    }
}
