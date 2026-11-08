package F0;

import D0.C0189o;
import D0.InterfaceC0195v;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends D0.X implements D0.O, InterfaceC0384b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D0.J f3704i = new D0.J(this, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p199t.u f3705j;
    public p199t.u k;

    public static void A0(h0 h0Var) {
        I i10;
        h0 h0Var2 = h0Var.f3788m;
        H h10 = h0Var2 != null ? h0Var2.f3787l : null;
        H h11 = h0Var.f3787l;
        if (!kotlin.jvm.internal.m.b(h10, h11)) {
            h11.f3610z.r.f3666t.f();
            return;
        }
        InterfaceC0381a interfaceC0381aN = h11.f3610z.r.n();
        if (interfaceC0381aN == null || (i10 = ((P) interfaceC0381aN).f3666t) == null) {
            return;
        }
        i10.f();
    }

    public abstract void B0();

    @Override // D0.InterfaceC0191q
    public boolean M() {
        return false;
    }

    @Override // F0.InterfaceC0384b0
    public final void Z(boolean z10) {
        this.f3701f = z10;
    }

    @Override // D0.X
    public final int k0(C0189o c0189o) {
        int iR0;
        return (v0() && (iR0 = r0(c0189o)) != Integer.MIN_VALUE) ? iR0 + ((int) (this.f1766e & 4294967295L)) : MediaPlayerException.ERROR_UNKNOWN;
    }

    public abstract int r0(C0189o c0189o);

    /* JADX WARN: Code duplicated, block: B:71:0x0250  */
    /* JADX WARN: Code duplicated, block: B:73:0x0273  */
    /* JADX WARN: Code duplicated, block: B:75:0x0283  */
    /* JADX WARN: Code duplicated, block: B:77:0x0287  */
    /* JADX WARN: Code duplicated, block: B:78:0x028c  */
    /* JADX WARN: Code duplicated, block: B:80:0x02cb  */
    public final void s0(t0 t0Var) {
        long j10;
        int i10;
        long j11;
        long j12;
        Object obj;
        Object obj2;
        Object obj3;
        V vY0;
        r0 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        float[] fArr2;
        long[] jArr2;
        int i11;
        long j13;
        long j14;
        int i12;
        long[] jArr3;
        Object[] objArr2;
        float[] fArr3;
        int i13;
        long[] jArr4;
        Object[] objArr3;
        float[] fArr4;
        int i14;
        int i15;
        int i16;
        Object obj4;
        int iHashCode;
        int i17;
        if (this.f3703h || t0Var.f3841a.d() == null) {
            return;
        }
        p199t.u uVar = this.k;
        if (uVar == null) {
            uVar = new p199t.u();
            this.k = uVar;
        }
        p199t.u uVar2 = this.f3705j;
        if (uVar2 == null) {
            uVar2 = new p199t.u();
            this.f3705j = uVar2;
        }
        Object[] objArr4 = uVar2.f26332b;
        float[] fArr5 = uVar2.f26333c;
        long[] jArr5 = uVar2.f26331a;
        int length = jArr5.length - 2;
        long j15 = -9187201950435737472L;
        int i18 = 8;
        if (length >= 0) {
            int i19 = 0;
            i10 = 0;
            j11 = 128;
            while (true) {
                long j16 = jArr5[i19];
                j12 = 255;
                if ((((~j16) << 7) & j16 & j15) != j15) {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j16 & 255) < 128) {
                            int i22 = (i19 << 3) + i21;
                            j14 = j15;
                            Object obj5 = objArr4[i22];
                            float f10 = fArr5[i22];
                            int iHashCode2 = (obj5 != null ? obj5.hashCode() : 0) * (-862048943);
                            int i23 = iHashCode2 ^ (iHashCode2 << 16);
                            int i24 = i23 >>> 7;
                            int i25 = i23 & 127;
                            int i26 = uVar.f26334d;
                            int i27 = i24 & i26;
                            int i28 = 0;
                            while (true) {
                                long[] jArr6 = uVar.f26331a;
                                int i29 = i27 >> 3;
                                int i30 = (i27 & 7) << 3;
                                long j17 = jArr6[i29] >>> i30;
                                long j18 = jArr6[i29 + 1] << (64 - i30);
                                fArr2 = fArr5;
                                long j19 = j17 | (j18 & ((-i30) >> 63));
                                j13 = j16;
                                long j20 = i25;
                                long j21 = j19 ^ (j20 * 72340172838076673L);
                                long j22 = (j21 - 72340172838076673L) & (~j21) & j14;
                                while (j22 != 0) {
                                    int iNumberOfTrailingZeros = (i27 + (Long.numberOfTrailingZeros(j22) >> 3)) & i26;
                                    jArr2 = jArr5;
                                    if (kotlin.jvm.internal.m.b(uVar.f26332b[iNumberOfTrailingZeros], obj5)) {
                                        i12 = iNumberOfTrailingZeros;
                                        break;
                                    } else {
                                        j22 &= j22 - 1;
                                        jArr5 = jArr2;
                                    }
                                }
                                jArr2 = jArr5;
                                if ((j19 & ((~j19) << 6) & j14) != 0) {
                                    int iB = uVar.b(i24);
                                    if (uVar.f26336f == 0 && ((uVar.f26331a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                                        int i31 = uVar.f26334d;
                                        if (i31 <= 8) {
                                            int iD = p199t.E.d(uVar.f26334d);
                                            jArr3 = uVar.f26331a;
                                            objArr2 = uVar.f26332b;
                                            fArr3 = uVar.f26333c;
                                            i13 = uVar.f26334d;
                                            uVar.d(iD);
                                            jArr4 = uVar.f26331a;
                                            objArr3 = uVar.f26332b;
                                            fArr4 = uVar.f26333c;
                                            i14 = uVar.f26334d;
                                            i15 = 0;
                                            while (i15 < i13) {
                                                if (((jArr3[i15 >> 3] >> ((i15 & 7) << 3)) & 255) < 128) {
                                                    obj4 = objArr2[i15];
                                                    if (obj4 != null) {
                                                        iHashCode = obj4.hashCode();
                                                    } else {
                                                        iHashCode = 0;
                                                    }
                                                    int i32 = iHashCode * (-862048943);
                                                    int i33 = i32 ^ (i32 << 16);
                                                    i16 = i15;
                                                    int iB2 = uVar.b(i33 >>> 7);
                                                    int i34 = iB2 >> 3;
                                                    int i35 = (iB2 & 7) << 3;
                                                    long j23 = (jArr4[i34] & (~(255 << i35))) | (((long) (i33 & 127)) << i35);
                                                    jArr4[i34] = j23;
                                                    jArr4[(((iB2 - 7) & i14) + (i14 & 7)) >> 3] = j23;
                                                    objArr3[iB2] = obj4;
                                                    fArr4[iB2] = fArr3[i16];
                                                } else {
                                                    i16 = i15;
                                                }
                                                i15 = i16 + 1;
                                                jArr3 = jArr3;
                                            }
                                        } else if (Long.compare((((long) uVar.f26335e) * 32) ^ Long.MIN_VALUE, (((long) i31) * 25) ^ Long.MIN_VALUE) <= 0) {
                                            long[] jArr7 = uVar.f26331a;
                                            int i36 = uVar.f26334d;
                                            Object[] objArr5 = uVar.f26332b;
                                            float[] fArr6 = uVar.f26333c;
                                            p199t.E.a(jArr7, i36);
                                            int i37 = 0;
                                            int iB3 = -1;
                                            while (i37 != i36) {
                                                int i38 = i37 >> 3;
                                                int i39 = (i37 & 7) << 3;
                                                long j24 = (jArr7[i38] >> i39) & 255;
                                                if (j24 == 128) {
                                                    int i40 = i37;
                                                    i37++;
                                                    iB3 = i40;
                                                } else if (j24 != 254) {
                                                    i37++;
                                                } else {
                                                    Object obj6 = objArr5[i37];
                                                    int iHashCode3 = (obj6 != null ? obj6.hashCode() : 0) * (-862048943);
                                                    int i41 = iHashCode3 ^ (iHashCode3 << 16);
                                                    int i42 = i41 >>> 7;
                                                    int iB4 = uVar.b(i42);
                                                    int i43 = i42 & i36;
                                                    float[] fArr7 = fArr6;
                                                    if (((iB4 - i43) & i36) / 8 == ((i37 - i43) & i36) / 8) {
                                                        jArr7[i38] = (jArr7[i38] & (~(255 << i39))) | (((long) (i41 & 127)) << i39);
                                                        jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                                        i37++;
                                                    } else {
                                                        int i44 = i37;
                                                        int i45 = iB4 >> 3;
                                                        long j25 = jArr7[i45];
                                                        int i46 = (iB4 & 7) << 3;
                                                        if (((j25 >> i46) & 255) == 128) {
                                                            jArr7[i45] = (j25 & (~(255 << i46))) | (((long) (i41 & 127)) << i46);
                                                            jArr7[i38] = (jArr7[i38] & (~(255 << i39))) | (128 << i39);
                                                            objArr5[iB4] = objArr5[i44];
                                                            objArr5[i44] = null;
                                                            fArr7[iB4] = fArr7[i44];
                                                            fArr7[i44] = 0.0f;
                                                            iB3 = i44;
                                                            i17 = iB3;
                                                        } else {
                                                            jArr7[i45] = (j25 & (~(255 << i46))) | (((long) (i41 & 127)) << i46);
                                                            if (iB3 == -1) {
                                                                iB3 = p199t.E.b(jArr7, i44 + 1, i36);
                                                            }
                                                            objArr5[iB3] = objArr5[iB4];
                                                            objArr5[iB4] = objArr5[i44];
                                                            objArr5[i44] = objArr5[iB3];
                                                            fArr7[iB3] = fArr7[iB4];
                                                            fArr7[iB4] = fArr7[i44];
                                                            fArr7[i44] = fArr7[iB3];
                                                            i17 = i44 - 1;
                                                        }
                                                        jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                                        i37 = i17 + 1;
                                                    }
                                                    fArr6 = fArr7;
                                                }
                                            }
                                            uVar.f26336f = p199t.E.c(uVar.f26334d) - uVar.f26335e;
                                        } else {
                                            int iD2 = p199t.E.d(uVar.f26334d);
                                            jArr3 = uVar.f26331a;
                                            objArr2 = uVar.f26332b;
                                            fArr3 = uVar.f26333c;
                                            i13 = uVar.f26334d;
                                            uVar.d(iD2);
                                            jArr4 = uVar.f26331a;
                                            objArr3 = uVar.f26332b;
                                            fArr4 = uVar.f26333c;
                                            i14 = uVar.f26334d;
                                            i15 = 0;
                                            while (i15 < i13) {
                                                if (((jArr3[i15 >> 3] >> ((i15 & 7) << 3)) & 255) < 128) {
                                                    obj4 = objArr2[i15];
                                                    if (obj4 != null) {
                                                        iHashCode = obj4.hashCode();
                                                    } else {
                                                        iHashCode = 0;
                                                    }
                                                    int i310 = iHashCode * (-862048943);
                                                    int i311 = i310 ^ (i310 << 16);
                                                    i16 = i15;
                                                    int iB5 = uVar.b(i311 >>> 7);
                                                    int i312 = iB5 >> 3;
                                                    int i313 = (iB5 & 7) << 3;
                                                    long j26 = (jArr4[i312] & (~(255 << i313))) | (((long) (i311 & 127)) << i313);
                                                    jArr4[i312] = j26;
                                                    jArr4[(((iB5 - 7) & i14) + (i14 & 7)) >> 3] = j26;
                                                    objArr3[iB5] = obj4;
                                                    fArr4[iB5] = fArr3[i16];
                                                } else {
                                                    i16 = i15;
                                                }
                                                i15 = i16 + 1;
                                                jArr3 = jArr3;
                                            }
                                        }
                                        iB = uVar.b(i24);
                                    }
                                    uVar.f26335e++;
                                    int i47 = uVar.f26336f;
                                    long[] jArr8 = uVar.f26331a;
                                    int i48 = iB >> 3;
                                    long j27 = jArr8[i48];
                                    int i49 = (iB & 7) << 3;
                                    uVar.f26336f = i47 - (((j27 >> i49) & 255) != 128 ? 0 : 1);
                                    int i50 = uVar.f26334d;
                                    long j28 = ((~(255 << i49)) & j27) | (j20 << i49);
                                    jArr8[i48] = j28;
                                    jArr8[(((iB - 7) & i50) + (i50 & 7)) >> 3] = j28;
                                    i12 = ~iB;
                                    break;
                                }
                                i28 += 8;
                                i27 = (i27 + i28) & i26;
                                fArr5 = fArr2;
                                j16 = j13;
                                jArr5 = jArr2;
                            }
                            if (i12 < 0) {
                                i12 = ~i12;
                            }
                            uVar.f26332b[i12] = obj5;
                            uVar.f26333c[i12] = f10;
                            i11 = 8;
                        } else {
                            fArr2 = fArr5;
                            jArr2 = jArr5;
                            i11 = i18;
                            j13 = j16;
                            j14 = j15;
                        }
                        j16 = j13 >> i11;
                        i21++;
                        i18 = i11;
                        objArr4 = objArr4;
                        j15 = j14;
                        fArr5 = fArr2;
                        jArr5 = jArr2;
                    }
                    objArr = objArr4;
                    fArr = fArr5;
                    jArr = jArr5;
                    j10 = j15;
                    obj = null;
                    if (i20 != i18) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                    fArr = fArr5;
                    jArr = jArr5;
                    j10 = j15;
                    obj = null;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                objArr4 = objArr;
                j15 = j10;
                fArr5 = fArr;
                jArr5 = jArr;
                i18 = 8;
            }
        } else {
            j10 = -9187201950435737472L;
            i10 = 0;
            j11 = 128;
            j12 = 255;
            obj = null;
        }
        uVar2.a();
        G0.A a10 = w0().f3595i;
        if (a10 != null && (snapshotObserver = a10.getSnapshotObserver()) != null) {
            snapshotObserver.a(t0Var, C0387e.f3738c, new A9.p(4, t0Var, this));
        }
        Object[] objArr6 = uVar2.f26332b;
        long[] jArr9 = uVar2.f26331a;
        int length2 = jArr9.length - 2;
        if (length2 >= 0) {
            int i51 = i10;
            while (true) {
                long j29 = jArr9[i51];
                if ((((~j29) << 7) & j29 & j10) != j10) {
                    int i52 = 8 - ((~(i51 - length2)) >>> 31);
                    int i53 = i10;
                    while (i53 < i52) {
                        if ((j29 & j12) >= j11) {
                            obj3 = obj;
                        } else {
                            if (objArr6[(i51 << 3) + i53] != null) {
                                throw new ClassCastException();
                            }
                            obj3 = obj;
                            if (uVar.c(obj3) < 0 && (vY0 = y0()) != null) {
                                do {
                                    p199t.u uVar3 = vY0.f3705j;
                                    if (uVar3 != null && uVar3.c(obj3) >= 0) {
                                        break;
                                    } else {
                                        vY0 = vY0.y0();
                                    }
                                } while (vY0 != null);
                            }
                        }
                        j29 >>= 8;
                        i53++;
                        obj = obj3;
                    }
                    obj2 = obj;
                    if (i52 != 8) {
                        break;
                    }
                } else {
                    obj2 = obj;
                }
                if (i51 == length2) {
                    break;
                }
                i51++;
                obj = obj2;
            }
        }
        uVar.a();
    }

    public abstract V t0();

    @Override // D0.O
    public final D0.N u(int i10, int i11, Map map, Z8.c cVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new T(i10, i11, map, cVar, this);
        }
        p206t6.b.g0("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    public abstract InterfaceC0195v u0();

    public abstract boolean v0();

    public abstract H w0();

    public abstract D0.N x0();

    public abstract V y0();

    public abstract long z0();
}
