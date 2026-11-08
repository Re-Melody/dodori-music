package p199t;

import com.amazon.a.a.o.b.f;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f26339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26342f;

    public v(int i10) {
        this.f26337a = E.f26264a;
        this.f26338b = a.f27015c;
        this.f26339c = j.f26292a;
        if (i10 >= 0) {
            d(E.f(i10));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i10) {
        int i11 = this.f26340d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26337a;
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

    public final int b(Object obj) {
        long j10;
        long j11;
        long[] jArr;
        Object[] objArr;
        int i10;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f26340d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f26337a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            int i20 = 1;
            long j12 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
            long j13 = i14;
            int i21 = i14;
            int i22 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j15) >> 3)) & i15;
                int i23 = i11;
                if (m.b(this.f26338b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i11 = i23;
            }
            int i24 = i11;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iA = a(i13);
                long j16 = 128;
                long j17 = 255;
                if (this.f26342f != 0 || ((this.f26337a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j10 = 128;
                    j11 = 255;
                } else {
                    int i25 = this.f26340d;
                    if (i25 <= 8 || Long.compare((((long) this.f26341e) * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = 128;
                        j11 = 255;
                        int iD = E.d(this.f26340d);
                        long[] jArr3 = this.f26337a;
                        Object[] objArr2 = this.f26338b;
                        int[] iArr = this.f26339c;
                        int i26 = this.f26340d;
                        d(iD);
                        long[] jArr4 = this.f26337a;
                        Object[] objArr3 = this.f26338b;
                        int[] iArr2 = this.f26339c;
                        int i27 = this.f26340d;
                        int i28 = 0;
                        while (i28 < i26) {
                            if (((jArr3[i28 >> 3] >> ((i28 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i28];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : i22) * i24;
                                int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                int iA2 = a(i29 >>> 7);
                                jArr = jArr4;
                                long j18 = i29 & 127;
                                int i30 = iA2 >> 3;
                                int i31 = (iA2 & 7) << 3;
                                long j19 = (jArr[i30] & (~(255 << i31))) | (j18 << i31);
                                jArr[i30] = j19;
                                jArr[(((iA2 - 7) & i27) + (i27 & 7)) >> 3] = j19;
                                objArr3[iA2] = obj2;
                                iArr2[iA2] = iArr[i28];
                            } else {
                                jArr = jArr4;
                            }
                            i28++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                            i22 = 0;
                        }
                    } else {
                        long[] jArr5 = this.f26337a;
                        int i32 = this.f26340d;
                        Object[] objArr4 = this.f26338b;
                        int[] iArr3 = this.f26339c;
                        E.a(jArr5, i32);
                        int i33 = 0;
                        int iB = -1;
                        while (i33 != i32) {
                            int i34 = i33 >> 3;
                            int i35 = (i33 & 7) << 3;
                            long j20 = (jArr5[i34] >> i35) & j17;
                            if (j20 == j16) {
                                int i36 = i33;
                                i33++;
                                iB = i36;
                            } else if (j20 != 254) {
                                i33++;
                            } else {
                                Object obj3 = objArr4[i33];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i24;
                                int i37 = iHashCode3 ^ (iHashCode3 << 16);
                                long j21 = j16;
                                int i38 = i37 >>> 7;
                                int iA3 = a(i38);
                                int i39 = i38 & i32;
                                long j22 = j17;
                                if (((iA3 - i39) & i32) / 8 == ((i33 - i39) & i32) / 8) {
                                    jArr5[i34] = (((long) (i37 & 127)) << i35) | (jArr5[i34] & (~(j22 << i35)));
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i33++;
                                    j16 = j21;
                                    j17 = j22;
                                } else {
                                    int i40 = i33;
                                    int i41 = iA3 >> 3;
                                    long j23 = jArr5[i41];
                                    int i42 = (iA3 & 7) << 3;
                                    if (((j23 >> i42) & j22) == j21) {
                                        objArr = objArr4;
                                        jArr5[i41] = ((~(j22 << i42)) & j23) | (((long) (i37 & 127)) << i42);
                                        jArr5[i34] = (jArr5[i34] & (~(j22 << i35))) | (j21 << i35);
                                        objArr[iA3] = objArr[i40];
                                        objArr[i40] = null;
                                        iArr3[iA3] = iArr3[i40];
                                        iArr3[i40] = 0;
                                        iB = i40;
                                        i10 = iB;
                                    } else {
                                        objArr = objArr4;
                                        jArr5[i41] = ((~(j22 << i42)) & j23) | (((long) (i37 & 127)) << i42);
                                        if (iB == -1) {
                                            iB = E.b(jArr5, i40 + 1, i32);
                                        }
                                        objArr[iB] = objArr[iA3];
                                        objArr[iA3] = objArr[i40];
                                        objArr[i40] = objArr[iB];
                                        iArr3[iB] = iArr3[iA3];
                                        iArr3[iA3] = iArr3[i40];
                                        iArr3[i40] = iArr3[iB];
                                        i10 = i40 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    objArr4 = objArr;
                                    j17 = j22;
                                    i33 = i10 + 1;
                                    j16 = j21;
                                }
                            }
                        }
                        j10 = j16;
                        j11 = j17;
                        this.f26342f = E.c(this.f26340d) - this.f26341e;
                    }
                    iA = a(i13);
                }
                this.f26341e++;
                int i43 = this.f26342f;
                long[] jArr6 = this.f26337a;
                int i44 = iA >> 3;
                long j24 = jArr6[i44];
                int i45 = (iA & 7) << 3;
                if (((j24 >> i45) & j11) != j10) {
                    i20 = 0;
                }
                this.f26342f = i43 - i20;
                int i46 = this.f26340d;
                long j25 = (j24 & (~(j11 << i45))) | (j13 << i45);
                jArr6[i44] = j25;
                jArr6[(((iA - 7) & i46) + (i46 & 7)) >> 3] = j25;
                return ~iA;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i21;
            i11 = i24;
        }
    }

    public final int c(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26340d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f26337a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (m.b(this.f26338b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, E.e(i10)) : 0;
        this.f26340d = iMax;
        if (iMax == 0) {
            jArr = E.f26264a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            N8.m.q0(jArr);
        }
        this.f26337a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f26342f = E.c(this.f26340d) - this.f26341e;
        this.f26338b = new Object[iMax];
        this.f26339c = new int[iMax];
    }

    public final void e(int i10) {
        this.f26341e--;
        long[] jArr = this.f26337a;
        int i11 = this.f26340d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f26338b[i10] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (vVar.f26341e == this.f26341e) {
                Object[] objArr = this.f26338b;
                int[] iArr = this.f26339c;
                long[] jArr = this.f26337a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj2 = objArr[i13];
                                int i14 = iArr[i13];
                                int iC = vVar.c(obj2);
                                if (iC < 0) {
                                    throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                                }
                                if (i14 != vVar.f26339c[iC]) {
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return true;
                        }
                    }
                    if (i10 == length) {
                        return true;
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            iB = ~iB;
        }
        this.f26338b[iB] = obj;
        this.f26339c[iB] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f26338b;
        int[] iArr = this.f26339c;
        long[] jArr = this.f26337a;
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
                        Object obj = objArr[i13];
                        iHashCode += Integer.hashCode(iArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f26341e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f26338b;
        int[] iArr = this.f26339c;
        long[] jArr = this.f26337a;
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
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(f.f16452b);
                            sb.append(i15);
                            i11++;
                            if (i11 < this.f26341e) {
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
        m.e(string, "s.append('}').toString()");
        return string;
    }

    public /* synthetic */ v() {
        this(6);
    }
}
