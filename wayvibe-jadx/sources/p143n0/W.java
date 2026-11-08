package p143n0;

import B2.s;
import B8.V;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p028c1.i;
import p133m0.a;
import p133m0.d;
import p153o0.b;
import p153o0.c;
import p153o0.l;
import p153o0.m;
import p153o0.q;
import p163p0.e;
import p163p0.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f22719a = new V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f22720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f22721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f22722d;

    public static final Rect A(i iVar) {
        return new Rect(iVar.f15854a, iVar.f15855b, iVar.f15856c, iVar.f15857d);
    }

    public static final Rect B(d dVar) {
        return new Rect((int) dVar.f22184a, (int) dVar.f22185b, (int) dVar.f22186c, (int) dVar.f22187d);
    }

    public static final RectF C(d dVar) {
        return new RectF(dVar.f22184a, dVar.f22185b, dVar.f22186c, dVar.f22187d);
    }

    public static final Shader.TileMode D(int i10) {
        if (i10 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i10 == 3) {
            return Build.VERSION.SDK_INT >= 31 ? f0.f22764a.b() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int E(long j10) {
        float[] fArr = p153o0.d.f23506a;
        return (int) (C2096x.a(j10, p153o0.d.f23508c) >>> 32);
    }

    public static final Bitmap.Config F(int i10) {
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26 || i10 != 3) {
            return (i11 < 26 || i10 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final d G(Rect rect) {
        return new d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final d H(RectF rectF) {
        return new d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode I(int i10) {
        if (i10 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i10 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i10 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i10 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i10 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i10 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i10 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i10 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i10 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i10 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i10 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i10 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i10 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String J(int i10) {
        if (i10 == 0) {
            return "Clamp";
        }
        if (i10 == 1) {
            return "Repeated";
        }
        if (i10 == 2) {
            return "Mirror";
        }
        return i10 == 3 ? "Decal" : "Unknown";
    }

    public static final void K(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d A[PHI: r0
  0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public static final int L(float f10, float[] fArr, int i10) {
        float f11 = 0.0f;
        if (f10 >= 0.0f) {
            f11 = 1.0f;
            if (f10 > 1.0f) {
                if (f10 <= 1.0000008f) {
                    f10 = f11;
                } else {
                    f10 = Float.NaN;
                }
            }
        } else if (f10 >= -8.34465E-7f) {
            f10 = f11;
        } else {
            f10 = Float.NaN;
        }
        fArr[i10] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    public static final C2077d a(C2081h c2081h) {
        Canvas canvas = AbstractC2078e.f22762a;
        C2077d c2077d = new C2077d();
        c2077d.f22749a = new Canvas(n(c2081h));
        return c2077d;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:115:0x0168  */
    /* JADX WARN: Code duplicated, block: B:116:0x016a A[PHI: r2
  0x016a: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v0 int) binds: [B:123:0x017f, B:115:0x0168, B:111:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:128:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    public static final long b(float f10, float f11, float f12, float f13, c cVar) {
        int i10;
        int i11;
        int i12;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f14;
        int i28 = 31;
        if (cVar.c()) {
            float f15 = f13 < 0.0f ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i29 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i30 = i29 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < 0.0f ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i31 = i30 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            f14 = f12 >= 0.0f ? f12 : 0.0f;
            long j10 = ((long) (i31 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i32 = C2096x.f22803n;
            return j10;
        }
        int i33 = b.f23502e;
        if (((int) (cVar.f23504b >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i34 = cVar.f23505c;
        if (i34 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f10 >= fB3) {
            fB3 = f10;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i35 = iFloatToRawIntBits3 >>> 31;
        int i36 = (iFloatToRawIntBits3 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        int i37 = iFloatToRawIntBits3 & 8388607;
        if (i36 == 255) {
            i11 = i37 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i36 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i38 = i37 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i38) + 1) | (i35 << 15);
                    } else {
                        i11 = i38;
                    }
                    short s8 = (short) i12;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f11 >= fB) {
                        fB = f11;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s10 = (short) i19;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f12 >= fB2) {
                                    fB2 = f12;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    if (i23 != 0) {
                                        i25 = 512;
                                    } else {
                                        i25 = 0;
                                    }
                                    i26 = (i21 << 15) | (i28 << 10) | i25;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i28 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i25 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                            } else {
                                                i28 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            i27 = (i23 | 8388608) >> (1 - i24);
                                            if ((i27 & 4096) != 0) {
                                                i27 += 8192;
                                            }
                                            i25 = i27 >> 13;
                                            i28 = 0;
                                        } else {
                                            i28 = 0;
                                        }
                                        i26 = (i21 << 15) | (i28 << 10) | i25;
                                    }
                                    i25 = 0;
                                    i26 = (i21 << 15) | (i28 << 10) | i25;
                                }
                                short s11 = (short) i26;
                                f14 = f13 >= 0.0f ? f13 : 0.0f;
                                long j11 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s8) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) s11) & 65535) << 16) | (((long) i34) & 63);
                                int i39 = C2096x.f22803n;
                                return j11;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                            i16 = 0;
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s12 = (short) i19;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        if (i23 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i28 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i28 = i24;
                                }
                            } else if (i24 >= -10) {
                                i27 = (i23 | 8388608) >> (1 - i24);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                                i28 = 0;
                            } else {
                                i28 = 0;
                            }
                            i26 = (i21 << 15) | (i28 << 10) | i25;
                        }
                        i25 = 0;
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    }
                    short s13 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j12 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) s13) & 65535) << 16) | (((long) i34) & 63);
                    int i310 = C2096x.f22803n;
                    return j12;
                }
                if (i10 >= -10) {
                    int i40 = (i37 | 8388608) >> (1 - i10);
                    if ((i40 & 4096) != 0) {
                        i40 += 8192;
                    }
                    i11 = i40 >> 13;
                } else {
                    i11 = 0;
                }
                i10 = 0;
            }
        }
        i12 = i11 | (i35 << 15) | (i10 << 10);
        short s14 = (short) i12;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f11 >= fB) {
            fB = f11;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s15 = (short) i19;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        if (i23 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i28 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i28 = i24;
                                }
                            } else if (i24 >= -10) {
                                i27 = (i23 | 8388608) >> (1 - i24);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                                i28 = 0;
                            } else {
                                i28 = 0;
                            }
                            i26 = (i21 << 15) | (i28 << 10) | i25;
                        }
                        i25 = 0;
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    }
                    short s16 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j13 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s14) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) s16) & 65535) << 16) | (((long) i34) & 63);
                    int i311 = C2096x.f22803n;
                    return j13;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
                i16 = 0;
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s17 = (short) i19;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f12 >= fB2) {
            fB2 = f12;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            if (i23 != 0) {
                i25 = 512;
            } else {
                i25 = 0;
            }
            i26 = (i21 << 15) | (i28 << 10) | i25;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i28 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                    } else {
                        i28 = i24;
                    }
                } else if (i24 >= -10) {
                    i27 = (i23 | 8388608) >> (1 - i24);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i25 = i27 >> 13;
                    i28 = 0;
                } else {
                    i28 = 0;
                }
                i26 = (i21 << 15) | (i28 << 10) | i25;
            }
            i25 = 0;
            i26 = (i21 << 15) | (i28 << 10) | i25;
        }
        short s18 = (short) i26;
        if (f13 >= 0.0f) {
        }
        long j14 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s14) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((((long) s18) & 65535) << 16) | (((long) i34) & 63);
        int i312 = C2096x.f22803n;
        return j14;
    }

    public static final long c(int i10) {
        long j10 = ((long) i10) << 32;
        int i11 = C2096x.f22803n;
        return j10;
    }

    public static final long d(int i10, int i11, int i12) {
        return c(((i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK) << 16) | (-16777216) | ((i11 & ColorExtractionConstants.COLOR_COMPONENT_MASK) << 8) | (i12 & ColorExtractionConstants.COLOR_COMPONENT_MASK));
    }

    public static final long e(long j10) {
        long j11 = j10 << 32;
        int i10 = C2096x.f22803n;
        return j11;
    }

    public static C2081h f(int i10, int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        q qVar = p153o0.d.f23508c;
        Bitmap.Config configF = F(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = AbstractC2086m.b(i10, i11, i12, true, qVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configF);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C2081h(bitmapCreateBitmap);
    }

    public static final LinearGradient g(long j10, long j11, List list, List list2, int i10) {
        K(list, list2);
        int iP = p(list);
        return new LinearGradient(p133m0.c.d(j10), p133m0.c.e(j10), p133m0.c.d(j11), p133m0.c.e(j11), v(iP, list), w(iP, list2, list), D(i10));
    }

    public static final s h() {
        return new s(new Paint(7));
    }

    public static final C2083j i() {
        return new C2083j(new Path());
    }

    public static final long j(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = g0.f22770c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    public static final long k(float f10, float f11, float f12, float f13, c cVar) {
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 31;
        if (cVar.c()) {
            long j10 = ((long) ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32;
            int i28 = C2096x.f22803n;
            return j10;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
        int i29 = iFloatToRawIntBits3 >>> 31;
        int i30 = (iFloatToRawIntBits3 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        int i31 = iFloatToRawIntBits3 & 8388607;
        int i32 = 0;
        if (i30 == 255) {
            i11 = i31 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i30 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i33 = i31 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i33) + 1) | (i29 << 15);
                    } else {
                        i11 = i33;
                    }
                    short s8 = (short) i12;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s10 = (short) i19;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i32 = i23 == 0 ? 0 : 512;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i27 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i32 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                            } else {
                                                i27 = i24;
                                            }
                                            long jMax = ((((long) s8) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
                                            int i34 = C2096x.f22803n;
                                            return jMax;
                                        }
                                        if (i24 >= -10) {
                                            i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += 8192;
                                            }
                                            i32 = i26 >> 13;
                                            i27 = 0;
                                        } else {
                                            i27 = 0;
                                        }
                                    }
                                }
                                i25 = (i27 << 10) | (i21 << 15) | i32;
                                long jMax2 = ((((long) s8) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
                                int i35 = C2096x.f22803n;
                                return jMax2;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s11 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i32 = i23 == 0 ? 0 : 512;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i27 = 49;
                        } else {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i27 = i24;
                                }
                                long jMax3 = ((((long) s8) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
                                int i36 = C2096x.f22803n;
                                return jMax3;
                            }
                            if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i32 = i26 >> 13;
                                i27 = 0;
                            } else {
                                i27 = 0;
                            }
                        }
                    }
                    i25 = (i27 << 10) | (i21 << 15) | i32;
                    long jMax4 = ((((long) s8) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
                    int i37 = C2096x.f22803n;
                    return jMax4;
                }
                if (i10 >= -10) {
                    int i38 = (i31 | 8388608) >> (1 - i10);
                    if ((i38 & 4096) != 0) {
                        i38 += 8192;
                    }
                    i11 = i38 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i29 << 15) | (i10 << 10);
        short s12 = (short) i12;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s13 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i32 = i23 == 0 ? 0 : 512;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i27 = 49;
                        } else {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i27 = i24;
                                }
                                long jMax5 = ((((long) s12) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
                                int i39 = C2096x.f22803n;
                                return jMax5;
                            }
                            if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i32 = i26 >> 13;
                                i27 = 0;
                            } else {
                                i27 = 0;
                            }
                        }
                    }
                    i25 = (i27 << 10) | (i21 << 15) | i32;
                    long jMax6 = ((((long) s12) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
                    int i310 = C2096x.f22803n;
                    return jMax6;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s14 = (short) i19;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i32 = i23 == 0 ? 0 : 512;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i27 = 49;
            } else {
                if (i24 <= 0) {
                    i32 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                    } else {
                        i27 = i24;
                    }
                    long jMax7 = ((((long) s12) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
                    int i311 = C2096x.f22803n;
                    return jMax7;
                }
                if (i24 >= -10) {
                    i26 = (i23 | 8388608) >> (1 - i24);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i32 = i26 >> 13;
                    i27 = 0;
                } else {
                    i27 = 0;
                }
            }
        }
        i25 = (i27 << 10) | (i21 << 15) | i32;
        long jMax8 = ((((long) s12) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f23505c) & 63);
        int i312 = C2096x.f22803n;
        return jMax8;
    }

    public static final float l(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final Path.Direction m(T t10) {
        int i10 = AbstractC2085l.f22781a[t10.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new V();
    }

    public static final Bitmap n(C2081h c2081h) {
        if (c2081h instanceof C2081h) {
            return c2081h.f22772a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long o(long j10, long j11) {
        float f10;
        float f11;
        long jA = C2096x.a(j10, C2096x.f(j11));
        float fD = C2096x.d(j11);
        float fD2 = C2096x.d(jA);
        float f12 = 1.0f - fD2;
        float f13 = (fD * f12) + fD2;
        float fH = C2096x.h(jA);
        float fH2 = C2096x.h(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fH2 * fD) * f12) + (fH * fD2)) / f13;
        }
        float fG = C2096x.g(jA);
        float fG2 = C2096x.g(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fG2 * fD) * f12) + (fG * fD2)) / f13;
        }
        float fE = C2096x.e(jA);
        float fE2 = C2096x.e(j11);
        if (f13 != 0.0f) {
            f14 = (((fE2 * fD) * f12) + (fE * fD2)) / f13;
        }
        return k(f10, f11, f14, f13, C2096x.f(j11));
    }

    public static final int p(List list) {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iG = D7.W.G(list);
        for (int i11 = 1; i11 < iG; i11++) {
            if (C2096x.d(((C2096x) list.get(i11)).f22804a) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static void q(e eVar, Q q5, AbstractC2091s abstractC2091s, float f10, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        h hVar = h.f25151a;
        if (q5 instanceof O) {
            d dVar = ((O) q5).f22716a;
            eVar.X(abstractC2091s, D7.W.c(dVar.f22184a, dVar.f22185b), S5.d.i(dVar.d(), dVar.c()), f11, hVar);
        } else {
            if (!(q5 instanceof P)) {
                if (!(q5 instanceof N)) {
                    throw new V();
                }
                eVar.r(((N) q5).f22715a, abstractC2091s, f11, hVar, 3);
                return;
            }
            P p10 = (P) q5;
            C2083j c2083j = p10.f22718b;
            if (c2083j != null) {
                eVar.r(c2083j, abstractC2091s, f11, hVar, 3);
                return;
            }
            p133m0.e eVar2 = p10.f22717a;
            float fB = a.b(eVar2.f22195h);
            eVar.I(abstractC2091s, D7.W.c(eVar2.f22188a, eVar2.f22189b), S5.d.i(eVar2.b(), eVar2.a()), p206t6.b.a(fB, fB), f11, hVar);
        }
    }

    public static void r(e eVar, Q q5, long j10) {
        h hVar = h.f25151a;
        if (q5 instanceof O) {
            d dVar = ((O) q5).f22716a;
            eVar.V(j10, D7.W.c(dVar.f22184a, dVar.f22185b), S5.d.i(dVar.d(), dVar.c()), 3);
        } else {
            if (!(q5 instanceof P)) {
                if (!(q5 instanceof N)) {
                    throw new V();
                }
                eVar.f0(((N) q5).f22715a, j10, hVar);
                return;
            }
            P p10 = (P) q5;
            C2083j c2083j = p10.f22718b;
            if (c2083j != null) {
                eVar.f0(c2083j, j10, hVar);
                return;
            }
            p133m0.e eVar2 = p10.f22717a;
            float fB = a.b(eVar2.f22195h);
            eVar.N(j10, D7.W.c(eVar2.f22188a, eVar2.f22189b), S5.d.i(eVar2.b(), eVar2.a()), p206t6.b.a(fB, fB));
        }
    }

    public static void s(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C2095w.f22791a.a(canvas, z10);
            return;
        }
        if (!f22722d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f22720b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f22721c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f22720b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f22721c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f22720b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f22721c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f22722d = true;
        }
        if (z10) {
            try {
                Method method4 = f22720b;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f22721c) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static final long t(long j10, long j11, float f10) {
        l lVar = p153o0.d.f23523t;
        long jA = C2096x.a(j10, lVar);
        long jA2 = C2096x.a(j11, lVar);
        float fD = C2096x.d(jA);
        float fH = C2096x.h(jA);
        float fG = C2096x.g(jA);
        float fE = C2096x.e(jA);
        float fD2 = C2096x.d(jA2);
        float fH2 = C2096x.h(jA2);
        float fG2 = C2096x.g(jA2);
        float fE2 = C2096x.e(jA2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return C2096x.a(k(p046da.b.P(fH, fH2, f10), p046da.b.P(fG, fG2, f10), p046da.b.P(fE, fE2, f10), p046da.b.P(fD, fD2, f10), lVar), C2096x.f(j11));
    }

    public static final float u(long j10) {
        c cVarF = C2096x.f(j10);
        if (!b.a(cVarF.f23504b, b.f23498a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) b.b(cVarF.f23504b)));
        }
        double dH = C2096x.h(j10);
        m mVar = ((q) cVarF).f23562p;
        double dC = mVar.c(dH);
        float fC = (float) ((mVar.c(C2096x.e(j10)) * 0.0722d) + (mVar.c(C2096x.g(j10)) * 0.7152d) + (dC * 0.2126d));
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > 1.0f) {
            return 1.0f;
        }
        return fC;
    }

    public static final int[] v(int i10, List list) {
        int i11;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = E(((C2096x) list.get(i12)).f22804a);
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iG = D7.W.G(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long j10 = ((C2096x) list.get(i12)).f22804a;
            if (C2096x.d(j10) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = E(C2096x.b(0.0f, ((C2096x) list.get(1)).f22804a));
                } else if (i12 == iG) {
                    i11 = i13 + 1;
                    iArr2[i13] = E(C2096x.b(0.0f, ((C2096x) list.get(i12 - 1)).f22804a));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = E(C2096x.b(0.0f, ((C2096x) list.get(i12 - 1)).f22804a));
                    i13 += 2;
                    iArr2[i14] = E(C2096x.b(0.0f, ((C2096x) list.get(i12 + 1)).f22804a));
                }
                i13 = i11;
            } else {
                iArr2[i13] = E(j10);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    public static final float[] w(int i10, List list, List list2) {
        int i11 = 0;
        if (i10 == 0) {
            if (list == null) {
                return null;
            }
            float[] fArr = new float[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fArr[i11] = ((Number) it.next()).floatValue();
                i11++;
            }
            return fArr;
        }
        float[] fArr2 = new float[list2.size() + i10];
        fArr2[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iG = D7.W.G(list2);
        int i12 = 1;
        for (int i13 = 1; i13 < iG; i13++) {
            long j10 = ((C2096x) list2.get(i13)).f22804a;
            float fFloatValue = list != null ? ((Number) list.get(i13)).floatValue() : i13 / D7.W.G(list2);
            int i14 = i12 + 1;
            fArr2[i12] = fFloatValue;
            if (C2096x.d(j10) == 0.0f) {
                i12 += 2;
                fArr2[i14] = fFloatValue;
            } else {
                i12 = i14;
            }
        }
        fArr2[i12] = list != null ? ((Number) list.get(D7.W.G(list2))).floatValue() : 1.0f;
        return fArr2;
    }

    public static final void x(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final BlendMode z(int i10) {
        if (i10 == 0) {
            return BlendMode.CLEAR;
        }
        if (i10 == 1) {
            return BlendMode.SRC;
        }
        if (i10 == 2) {
            return BlendMode.DST;
        }
        if (i10 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i10 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i10 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i10 == 6) {
            return BlendMode.DST_IN;
        }
        if (i10 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i10 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i10 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i10 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i10 == 11) {
            return BlendMode.XOR;
        }
        if (i10 == 12) {
            return BlendMode.PLUS;
        }
        if (i10 == 13) {
            return BlendMode.MODULATE;
        }
        if (i10 == 14) {
            return BlendMode.SCREEN;
        }
        if (i10 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i10 == 16) {
            return BlendMode.DARKEN;
        }
        if (i10 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i10 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i10 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i10 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i10 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i10 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i10 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i10 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i10 == 25) {
            return BlendMode.HUE;
        }
        if (i10 == 26) {
            return BlendMode.SATURATION;
        }
        if (i10 == 27) {
            return BlendMode.COLOR;
        }
        return i10 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }
}
