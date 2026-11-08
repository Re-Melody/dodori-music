package com.google.crypto.tink.shaded.protobuf;

import A9.AbstractC0106f;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1189j extends AbstractC0106f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18451i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C1189j(byte[] bArr, int i10, int i11, boolean z10) {
        this.f18445c = bArr;
        this.f18446d = i11 + i10;
        this.f18448f = i10;
        this.f18449g = i10;
    }

    @Override // A9.AbstractC0106f
    public final String A() throws G {
        int iJ = J();
        if (iJ > 0) {
            int i10 = this.f18446d;
            int i11 = this.f18448f;
            if (iJ <= i10 - i11) {
                String str = new String(this.f18445c, i11, iJ, E.f18377a);
                this.f18448f += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw G.m();
        }
        throw G.o();
    }

    @Override // A9.AbstractC0106f
    public final String B() throws G {
        int iJ = J();
        if (iJ > 0) {
            int i10 = this.f18446d;
            int i11 = this.f18448f;
            if (iJ <= i10 - i11) {
                String strW = q0.f18482a.w(this.f18445c, i11, iJ);
                this.f18448f += iJ;
                return strW;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw G.m();
        }
        throw G.o();
    }

    @Override // A9.AbstractC0106f
    public final int C() throws G {
        if (g()) {
            this.f18450h = 0;
            return 0;
        }
        int iJ = J();
        this.f18450h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw G.f();
    }

    @Override // A9.AbstractC0106f
    public final int D() {
        return J();
    }

    @Override // A9.AbstractC0106f
    public final long E() {
        return K();
    }

    public final int H() throws G {
        int i10 = this.f18448f;
        if (this.f18446d - i10 < 4) {
            throw G.o();
        }
        this.f18448f = i10 + 4;
        byte[] bArr = this.f18445c;
        return ((bArr[i10 + 3] & ForkServer.ERROR) << 24) | (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16);
    }

    public final long I() throws G {
        int i10 = this.f18448f;
        if (this.f18446d - i10 < 8) {
            throw G.o();
        }
        this.f18448f = i10 + 8;
        byte[] bArr = this.f18445c;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int J() {
        int i10;
        int i11 = this.f18448f;
        int i12 = this.f18446d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f18445c;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f18448f = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f18448f = i14;
                return i10;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f18448f;
        int i11 = this.f18446d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f18445c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f18448f = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i17]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.f18448f = i13;
                return j10;
            }
        }
        return L();
    }

    public final long L() throws G {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f18448f;
            if (i11 == this.f18446d) {
                throw G.o();
            }
            this.f18448f = i11 + 1;
            byte b10 = this.f18445c[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw G.l();
    }

    public final void M() {
        int i10 = this.f18446d + this.f18447e;
        this.f18446d = i10;
        int i11 = i10 - this.f18449g;
        int i12 = this.f18451i;
        if (i11 <= i12) {
            this.f18447e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f18447e = i13;
        this.f18446d = i10 - i13;
    }

    @Override // A9.AbstractC0106f
    public final void b(int i10) throws G {
        if (this.f18450h != i10) {
            throw new G("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // A9.AbstractC0106f
    public final int f() {
        return this.f18448f - this.f18449g;
    }

    @Override // A9.AbstractC0106f
    public final boolean g() {
        return this.f18448f == this.f18446d;
    }

    @Override // A9.AbstractC0106f
    public final void j(int i10) {
        this.f18451i = i10;
        M();
    }

    @Override // A9.AbstractC0106f
    public final int l(int i10) throws G {
        if (i10 < 0) {
            throw G.m();
        }
        int iF = f() + i10;
        if (iF < 0) {
            throw new G("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f18451i;
        if (iF > i11) {
            throw G.o();
        }
        this.f18451i = iF;
        M();
        return i11;
    }

    @Override // A9.AbstractC0106f
    public final boolean m() {
        return K() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // A9.AbstractC0106f
    public final C1187h o() throws G {
        byte[] bArrCopyOfRange;
        int iJ = J();
        byte[] bArr = this.f18445c;
        if (iJ > 0) {
            int i10 = this.f18446d;
            int i11 = this.f18448f;
            if (iJ <= i10 - i11) {
                C1187h c1187hI = AbstractC1188i.i(bArr, i11, iJ);
                this.f18448f += iJ;
                return c1187hI;
            }
        }
        if (iJ == 0) {
            return AbstractC1188i.f18442b;
        }
        if (iJ > 0) {
            int i12 = this.f18446d;
            int i13 = this.f18448f;
            if (iJ <= i12 - i13) {
                int i14 = iJ + i13;
                this.f18448f = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iJ <= 0) {
                    throw G.o();
                }
                if (iJ == 0) {
                    throw G.m();
                }
                bArrCopyOfRange = E.f18378b;
            }
        } else {
            if (iJ <= 0) {
                throw G.o();
            }
            if (iJ == 0) {
                throw G.m();
            }
            bArrCopyOfRange = E.f18378b;
        }
        C1187h c1187h = AbstractC1188i.f18442b;
        return new C1187h(bArrCopyOfRange);
    }

    @Override // A9.AbstractC0106f
    public final double p() {
        return Double.longBitsToDouble(I());
    }

    @Override // A9.AbstractC0106f
    public final int q() {
        return J();
    }

    @Override // A9.AbstractC0106f
    public final int r() {
        return H();
    }

    @Override // A9.AbstractC0106f
    public final long s() {
        return I();
    }

    @Override // A9.AbstractC0106f
    public final float t() {
        return Float.intBitsToFloat(H());
    }

    @Override // A9.AbstractC0106f
    public final int u() {
        return J();
    }

    @Override // A9.AbstractC0106f
    public final long v() {
        return K();
    }

    @Override // A9.AbstractC0106f
    public final int w() {
        return H();
    }

    @Override // A9.AbstractC0106f
    public final long x() {
        return I();
    }

    @Override // A9.AbstractC0106f
    public final int y() {
        return AbstractC0106f.d(J());
    }

    @Override // A9.AbstractC0106f
    public final long z() {
        return AbstractC0106f.e(K());
    }
}
