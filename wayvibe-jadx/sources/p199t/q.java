package p199t;

import N8.m;
import com.amazon.a.a.o.b.f;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f26310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f26311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26314f;

    public q(int i10) {
        this.f26309a = E.f26264a;
        this.f26310b = j.f26292a;
        this.f26311c = a.f27015c;
        if (i10 >= 0) {
            g(E.f(i10));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f26313e = 0;
        long[] jArr = this.f26309a;
        if (jArr != E.f26264a) {
            m.q0(jArr);
            long[] jArr2 = this.f26309a;
            int i10 = this.f26312d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m.p0(this.f26311c, 0, this.f26312d);
        this.f26314f = E.c(this.f26312d) - this.f26313e;
    }

    public final boolean b(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26312d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f26309a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f26310b[iNumberOfTrailingZeros] == i10) {
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

    public final boolean c(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26312d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f26309a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f26310b[iNumberOfTrailingZeros] == i10) {
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
        long j10;
        int i11;
        long j11;
        long[] jArr;
        int[] iArr;
        int i12 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f26312d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr2 = this.f26309a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j12 = ((jArr2[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr2[i19] >>> i20);
            long j13 = i15;
            int i22 = i18;
            int i23 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j15) >> 3)) & i16;
                int i24 = i12;
                int i25 = i23;
                if (this.f26310b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i12 = i24;
                i23 = i25;
            }
            int i26 = i12;
            int i27 = i23;
            char c3 = '\b';
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i14);
                long j16 = 255;
                if (this.f26314f != 0 || ((this.f26309a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    i11 = 1;
                    j11 = 128;
                } else {
                    int i28 = this.f26312d;
                    if (i28 <= 8 || Long.compare((((long) this.f26313e) * 32) ^ Long.MIN_VALUE, (((long) i28) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = 255;
                        i11 = 1;
                        j11 = 128;
                        int iD = E.d(this.f26312d);
                        long[] jArr3 = this.f26309a;
                        int[] iArr2 = this.f26310b;
                        Object[] objArr = this.f26311c;
                        int i29 = this.f26312d;
                        g(iD);
                        long[] jArr4 = this.f26309a;
                        int[] iArr3 = this.f26310b;
                        Object[] objArr2 = this.f26311c;
                        int i30 = this.f26312d;
                        int i31 = i27;
                        while (i31 < i29) {
                            if (((jArr3[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                                int i32 = iArr2[i31];
                                int iHashCode2 = Integer.hashCode(i32) * i26;
                                int i33 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i33 >>> 7);
                                jArr = jArr4;
                                long j17 = i33 & 127;
                                int i34 = iE2 >> 3;
                                int i35 = (iE2 & 7) << 3;
                                long j18 = (jArr[i34] & (~(255 << i35))) | (j17 << i35);
                                jArr[i34] = j18;
                                jArr[(((iE2 - 7) & i30) + (i30 & 7)) >> 3] = j18;
                                iArr3[iE2] = i32;
                                objArr2[iE2] = objArr[i31];
                            } else {
                                jArr = jArr4;
                            }
                            i31++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f26309a;
                        int i36 = this.f26312d;
                        int[] iArr4 = this.f26310b;
                        Object[] objArr3 = this.f26311c;
                        E.a(jArr5, i36);
                        int i37 = i27;
                        int iB = -1;
                        j11 = 128;
                        while (i37 != i36) {
                            int i38 = i37 >> 3;
                            int i39 = (i37 & 7) << 3;
                            long j19 = (jArr5[i38] >> i39) & j16;
                            if (j19 == 128) {
                                int i40 = i37;
                                i37++;
                                iB = i40;
                            } else if (j19 != 254) {
                                i37++;
                            } else {
                                int iHashCode3 = Integer.hashCode(iArr4[i37]) * i26;
                                int i41 = iHashCode3 ^ (iHashCode3 << 16);
                                char c9 = c3;
                                int i42 = i41 >>> 7;
                                int iE3 = e(i42);
                                int i43 = i42 & i36;
                                long j20 = j16;
                                if (((iE3 - i43) & i36) / 8 == ((i37 - i43) & i36) / 8) {
                                    int i44 = i21;
                                    jArr5[i38] = (((long) (i41 & 127)) << i39) | (jArr5[i38] & (~(j20 << i39)));
                                    jArr5[jArr5.length - i44] = (jArr5[i27] & 72057594037927935L) | Long.MIN_VALUE;
                                    i37++;
                                    i21 = i44;
                                    c3 = c9;
                                    j16 = j20;
                                } else {
                                    int i45 = i21;
                                    int i46 = iE3 >> 3;
                                    long j21 = jArr5[i46];
                                    int i47 = (iE3 & 7) << 3;
                                    if (((j21 >> i47) & j20) == 128) {
                                        iArr = iArr4;
                                        jArr5[i46] = ((~(j20 << i47)) & j21) | (((long) (i41 & 127)) << i47);
                                        jArr5[i38] = (jArr5[i38] & (~(j20 << i39))) | (128 << i39);
                                        iArr[iE3] = iArr[i37];
                                        iArr[i37] = i27;
                                        objArr3[iE3] = objArr3[i37];
                                        objArr3[i37] = null;
                                        iB = i37;
                                    } else {
                                        iArr = iArr4;
                                        jArr5[i46] = ((~(j20 << i47)) & j21) | (((long) (i41 & 127)) << i47);
                                        if (iB == -1) {
                                            iB = E.b(jArr5, i37 + 1, i36);
                                        }
                                        iArr[iB] = iArr[iE3];
                                        iArr[iE3] = iArr[i37];
                                        iArr[i37] = iArr[iB];
                                        objArr3[iB] = objArr3[iE3];
                                        objArr3[iE3] = objArr3[i37];
                                        objArr3[i37] = objArr3[iB];
                                        i37--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[i27] & 72057594037927935L) | Long.MIN_VALUE;
                                    i37++;
                                    c3 = c9;
                                    iArr4 = iArr;
                                    j16 = j20;
                                    i21 = i45;
                                }
                            }
                        }
                        j10 = j16;
                        i11 = i21;
                        this.f26314f = E.c(this.f26312d) - this.f26313e;
                    }
                    iE = e(i14);
                }
                this.f26313e++;
                int i48 = this.f26314f;
                long[] jArr6 = this.f26309a;
                int i49 = iE >> 3;
                long j22 = jArr6[i49];
                int i50 = (iE & 7) << 3;
                if (((j22 >> i50) & j10) != j11) {
                    i11 = i27;
                }
                this.f26314f = i48 - i11;
                int i51 = this.f26312d;
                long j23 = (j22 & (~(j10 << i50))) | (j13 << i50);
                jArr6[i49] = j23;
                jArr6[(((iE - 7) & i51) + (i51 & 7)) >> 3] = j23;
                return iE;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i26;
        }
    }

    public final int e(int i10) {
        int i11 = this.f26312d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26309a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qVar.f26313e != this.f26313e) {
            return false;
        }
        int[] iArr = this.f26310b;
        Object[] objArr = this.f26311c;
        long[] jArr = this.f26309a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            int i14 = iArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (qVar.f(i14) != null || !qVar.c(i14)) {
                                    return false;
                                }
                            } else if (!obj2.equals(qVar.f(i14))) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final Object f(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26312d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f26309a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f26310b[iNumberOfTrailingZeros] == i10) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f26311c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void g(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, E.e(i10)) : 0;
        this.f26312d = iMax;
        if (iMax == 0) {
            jArr = E.f26264a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.q0(jArr);
        }
        this.f26309a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f26314f = E.c(this.f26312d) - this.f26313e;
        this.f26310b = new int[iMax];
        this.f26311c = new Object[iMax];
    }

    public final Object h(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26312d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f26309a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f26310b[iNumberOfTrailingZeros] == i10) {
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
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f26313e--;
        long[] jArr2 = this.f26309a;
        int i18 = this.f26312d;
        int i19 = iNumberOfTrailingZeros >> 3;
        int i20 = (iNumberOfTrailingZeros & 7) << 3;
        long j13 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j13;
        jArr2[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j13;
        Object[] objArr = this.f26311c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f26310b;
        Object[] objArr = this.f26311c;
        long[] jArr = this.f26309a;
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
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i14);
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

    public final void i(int i10, Object obj) {
        int iD = d(i10);
        this.f26310b[iD] = i10;
        this.f26311c[iD] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f26313e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f26310b;
        Object[] objArr = this.f26311c;
        long[] jArr = this.f26309a;
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
                            Object obj = objArr[i14];
                            sb.append(i15);
                            sb.append(f.f16452b);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i11++;
                            if (i11 < this.f26313e) {
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

    public /* synthetic */ q() {
        this(6);
    }
}
