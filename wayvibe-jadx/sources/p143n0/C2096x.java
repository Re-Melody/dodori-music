package p143n0;

import B2.AbstractC0112b;
import R3.a;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import p153o0.c;
import p153o0.d;
import p153o0.g;
import p153o0.h;
import p153o0.j;
import p199t.q;

/* JADX INFO: renamed from: n0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2096x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f22792b = W.e(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f22793c = W.e(4282664004L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f22794d = W.e(4287137928L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f22795e = W.e(4291611852L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f22796f = W.e(4294967295L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f22797g = W.e(4294901760L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f22798h = W.e(4278255360L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f22799i = W.e(4278190335L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f22800j = W.e(4294967040L);
    public static final long k = W.e(4278255615L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f22801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f22802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f22803n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22804a;

    static {
        W.e(4294902015L);
        f22801l = W.c(0);
        f22802m = W.b(0.0f, 0.0f, 0.0f, 0.0f, d.f23522s);
    }

    public /* synthetic */ C2096x(long j10) {
        this.f22804a = j10;
    }

    public static final long a(long j10, c cVar) {
        g gVarE;
        c cVarF = f(j10);
        int i10 = cVarF.f23505c;
        int i11 = cVar.f23505c;
        if ((i10 | i11) < 0) {
            gVarE = j.e(cVarF, cVar);
        } else {
            q qVar = h.f23532a;
            int i12 = i10 | (i11 << 6);
            Object objF = qVar.f(i12);
            if (objF == null) {
                objF = j.e(cVarF, cVar);
                qVar.i(i12, objF);
            }
            gVarE = (g) objF;
        }
        return gVarE.a(j10);
    }

    public static long b(float f10, long j10) {
        return W.b(h(j10), g(j10), e(j10), f10, f(j10));
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        float fI0;
        float f10;
        if ((63 & j10) == 0) {
            fI0 = (float) a.i0((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fI0 = (float) a.i0((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fI0 / f10;
    }

    public static final float e(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) a.i0((j10 >>> 32) & 255)) / 255.0f;
        }
        short s8 = (short) ((j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & s8;
        int i14 = ((65535 & s8) >>> 10) & 31;
        int i15 = s8 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = ColorExtractionConstants.COLOR_COMPONENT_MASK;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - G.f22708a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final c f(long j10) {
        float[] fArr = d.f23506a;
        return d.f23524u[(int) (j10 & 63)];
    }

    public static final float g(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) a.i0((j10 >>> 40) & 255)) / 255.0f;
        }
        short s8 = (short) ((j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & s8;
        int i14 = ((65535 & s8) >>> 10) & 31;
        int i15 = s8 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = ColorExtractionConstants.COLOR_COMPONENT_MASK;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - G.f22708a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) a.i0((j10 >>> 48) & 255)) / 255.0f;
        }
        short s8 = (short) ((j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & s8;
        int i14 = ((65535 & s8) >>> 10) & 31;
        int i15 = s8 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = ColorExtractionConstants.COLOR_COMPONENT_MASK;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - G.f22708a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j10) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j10));
        sb.append(", ");
        sb.append(g(j10));
        sb.append(", ");
        sb.append(e(j10));
        sb.append(", ");
        sb.append(d(j10));
        sb.append(", ");
        return AbstractC0112b.j(sb, f(j10).f23503a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2096x) {
            return this.f22804a == ((C2096x) obj).f22804a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22804a);
    }

    public final String toString() {
        return i(this.f22804a);
    }
}
