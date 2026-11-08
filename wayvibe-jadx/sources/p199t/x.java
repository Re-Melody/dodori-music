package p199t;

import com.amazon.a.a.o.b.f;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26345a = E.f26264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26346b = a.f27015c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f26347c = k.f26293a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26350f;

    public x(int i10) {
        if (i10 >= 0) {
            d(E.f(i10));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i10) {
        int i11 = this.f26348d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26345a;
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
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f26348d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f26345a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (m.b(this.f26346b[iNumberOfTrailingZeros], obj)) {
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

    public final long c(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.f26347c[iB];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, E.e(i10)) : 0;
        this.f26348d = iMax;
        if (iMax == 0) {
            jArr = E.f26264a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            N8.m.q0(jArr);
        }
        this.f26345a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f26350f = E.c(this.f26348d) - this.f26349e;
        this.f26346b = new Object[iMax];
        this.f26347c = new long[iMax];
    }

    public final void e(long j10, Object obj) {
        long j11;
        long j12;
        int i10;
        int i11;
        long j13;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object obj2 = obj;
        int i12 = -862048943;
        int iHashCode = obj2.hashCode() * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f26348d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f26345a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            int i22 = i18;
            int i23 = 0;
            long j14 = (((-i20) >> 63) & (jArr2[i19 + 1] << (64 - i20))) | (jArr2[i19] >>> i20);
            long j15 = i15;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i17) & i16;
                int i24 = i12;
                if (m.b(this.f26346b[iNumberOfTrailingZeros], obj2)) {
                    break loop0;
                }
                j17 &= j17 - 1;
                i12 = i24;
            }
            int i25 = i12;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int iA = a(i14);
                long j18 = 255;
                if (this.f26350f != 0 || ((this.f26345a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j11 = j15;
                    j12 = 255;
                    i10 = 1;
                    i11 = 0;
                    j13 = 128;
                } else {
                    int i26 = this.f26348d;
                    if (i26 > 8) {
                        j13 = 128;
                        if (Long.compare((((long) this.f26349e) * 32) ^ Long.MIN_VALUE, (((long) i26) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26345a;
                            int i27 = this.f26348d;
                            Object[] objArr = this.f26346b;
                            long[] jArr4 = this.f26347c;
                            E.a(jArr3, i27);
                            int i28 = 0;
                            int iB = -1;
                            while (i28 != i27) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j19 = (jArr3[i29] >> i30) & j18;
                                if (j19 == 128) {
                                    int i31 = i28;
                                    i28++;
                                    iB = i31;
                                } else if (j19 != 254) {
                                    i28++;
                                } else {
                                    Object obj3 = objArr[i28];
                                    int iHashCode2 = (obj3 != null ? obj3.hashCode() : i23) * i25;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    long j20 = j18;
                                    int i33 = i32 >>> 7;
                                    int iA2 = a(i33);
                                    int i34 = i33 & i27;
                                    int i35 = i21;
                                    if (((iA2 - i34) & i27) / 8 == ((i28 - i34) & i27) / 8) {
                                        jArr3[i29] = (jArr3[i29] & (~(j20 << i30))) | (((long) (i32 & 127)) << i30);
                                        jArr3[jArr3.length - 1] = (jArr3[i23] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                    } else {
                                        int i36 = iA2 >> 3;
                                        long j21 = jArr3[i36];
                                        int i37 = (iA2 & 7) << 3;
                                        if (((j21 >> i37) & j20) == 128) {
                                            jArr3[i36] = (((long) (i32 & 127)) << i37) | (j21 & (~(j20 << i37)));
                                            jArr3[i29] = (jArr3[i29] & (~(j20 << i30))) | (128 << i30);
                                            objArr[iA2] = objArr[i28];
                                            objArr[i28] = null;
                                            jArr4[iA2] = jArr4[i28];
                                            jArr4[i28] = 0;
                                            iB = i28;
                                        } else {
                                            jArr3[i36] = (((long) (i32 & 127)) << i37) | (j21 & (~(j20 << i37)));
                                            if (iB == -1) {
                                                iB = E.b(jArr3, i28 + 1, i27);
                                            }
                                            objArr[iB] = objArr[iA2];
                                            objArr[iA2] = objArr[i28];
                                            objArr[i28] = objArr[iB];
                                            jArr4[iB] = jArr4[iA2];
                                            jArr4[iA2] = jArr4[i28];
                                            jArr4[i28] = jArr4[iB];
                                            i28--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i23] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                        i23 = i23;
                                    }
                                    j18 = j20;
                                    i21 = i35;
                                    j15 = j15;
                                }
                            }
                            j11 = j15;
                            j12 = j18;
                            i10 = i21;
                            i11 = i23;
                            this.f26350f = E.c(this.f26348d) - this.f26349e;
                        }
                        iA = a(i14);
                    } else {
                        j13 = 128;
                    }
                    j11 = j15;
                    j12 = 255;
                    i10 = 1;
                    i11 = 0;
                    int iD = E.d(this.f26348d);
                    long[] jArr5 = this.f26345a;
                    Object[] objArr2 = this.f26346b;
                    long[] jArr6 = this.f26347c;
                    int i38 = this.f26348d;
                    d(iD);
                    long[] jArr7 = this.f26345a;
                    Object[] objArr3 = this.f26346b;
                    long[] jArr8 = this.f26347c;
                    int i39 = this.f26348d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j13) {
                            Object obj4 = objArr2[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i25;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i41 >>> 7);
                            jArr = jArr7;
                            long j22 = i41 & 127;
                            int i42 = iA3 >> 3;
                            int i43 = (iA3 & 7) << 3;
                            long j23 = (jArr[i42] & (~(255 << i43))) | (j22 << i43);
                            jArr[i42] = j23;
                            jArr[(((iA3 - 7) & i39) + (i39 & 7)) >> 3] = j23;
                            objArr3[iA3] = obj4;
                            jArr8[iA3] = jArr6[i40];
                        } else {
                            jArr = jArr7;
                        }
                        i40++;
                        jArr7 = jArr;
                    }
                    iA = a(i14);
                }
                this.f26349e++;
                int i44 = this.f26350f;
                long[] jArr9 = this.f26345a;
                int i45 = iA >> 3;
                long j24 = jArr9[i45];
                int i46 = (iA & 7) << 3;
                if (((j24 >> i46) & j12) == j13) {
                    i11 = i10;
                }
                this.f26350f = i44 - i11;
                int i47 = this.f26348d;
                long j25 = (j24 & (~(j12 << i46))) | (j11 << i46);
                jArr9[i45] = j25;
                jArr9[(((iA - 7) & i47) + (i47 & 7)) >> 3] = j25;
                iNumberOfTrailingZeros = ~iA;
                break;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            obj2 = obj;
            i12 = i25;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f26346b[iNumberOfTrailingZeros] = obj;
        this.f26347c[iNumberOfTrailingZeros] = j10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[LOOP:0: B:14:0x0023->B:26:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f26349e != this.f26349e) {
            return false;
        }
        Object[] objArr = this.f26346b;
        long[] jArr = this.f26347c;
        long[] jArr2 = this.f26345a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (jArr[i13] != xVar.c(objArr[i13])) {
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

    public final int hashCode() {
        Object[] objArr = this.f26346b;
        long[] jArr = this.f26347c;
        long[] jArr2 = this.f26345a;
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
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i13]);
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
        if (this.f26349e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f26346b;
        long[] jArr = this.f26347c;
        long[] jArr2 = this.f26345a;
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
                            Object obj = objArr[i16];
                            i11 = i12;
                            long j11 = jArr[i16];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(f.f16452b);
                            sb.append(j11);
                            i13++;
                            if (i13 < this.f26349e) {
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
        m.e(string, "s.append('}').toString()");
        return string;
    }
}
