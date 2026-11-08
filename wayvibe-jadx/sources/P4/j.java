package P4;

import B2.t;
import D7.p1;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f9671h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f9672i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f9673j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f9674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f9675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f9676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f9677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f9678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f9679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f9680g;

    public j(int i10, int i11) {
        Paint paint = new Paint();
        this.f9674a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f9675b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f9676c = new Canvas();
        this.f9677d = new c(719, 575, 0, 719, 0, 575);
        this.f9678e = new b(0, new int[]{0, -1, -16777216, -8421505}, f(), g());
        this.f9679f = new i(i10, i11, 0);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x0208 A[LOOP:3: B:86:0x016a->B:120:0x0208, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x014c A[LOOP:2: B:36:0x00a2->B:73:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0170  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0192  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    public static void b(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z10;
        int iK;
        int iK2;
        char c3;
        int iK3;
        int iK4;
        int iK5;
        int i13;
        int iK6;
        int iK7;
        int i14;
        boolean z11;
        int iK8;
        t tVar = new t(bArr, bArr.length, 2, (byte) 0);
        int i15 = i11;
        int i16 = i12;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        while (tVar.a() != 0) {
            int iK9 = tVar.k(8);
            if (iK9 != 240) {
                int i17 = 3;
                int i18 = 4;
                switch (iK9) {
                    case 16:
                        if (i10 == 3) {
                            bArr3 = bArrC == null ? f9672i : bArrC;
                        } else {
                            if (i10 == 2) {
                                bArr3 = bArrC2 == null ? f9671h : bArrC2;
                            } else {
                                bArr2 = null;
                            }
                            z10 = false;
                            while (true) {
                                iK = tVar.k(2);
                                if (iK != 0) {
                                    iK3 = iK;
                                } else {
                                    if (tVar.q()) {
                                        iK5 = tVar.k(3) + 3;
                                        iK3 = tVar.k(2);
                                    } else {
                                        if (tVar.q()) {
                                            iK3 = 0;
                                        } else {
                                            iK2 = tVar.k(2);
                                            if (iK2 != 0) {
                                                c3 = 4;
                                                iK3 = 0;
                                                iK4 = 0;
                                                z10 = true;
                                            } else if (iK2 != 1) {
                                                c3 = 4;
                                                z10 = z10;
                                                iK4 = 2;
                                                iK3 = 0;
                                            } else if (iK2 != 2) {
                                                if (iK2 != 3) {
                                                    z10 = z10;
                                                    iK3 = 0;
                                                    iK4 = 0;
                                                } else {
                                                    iK5 = tVar.k(8) + 29;
                                                    iK3 = tVar.k(2);
                                                }
                                                c3 = 4;
                                            } else {
                                                c3 = 4;
                                                z10 = z10;
                                                iK4 = tVar.k(4) + 12;
                                                iK3 = tVar.k(2);
                                            }
                                        }
                                        if (iK4 == 0 && paint != null) {
                                            if (bArr2 != 0) {
                                                iK3 = bArr2[iK3];
                                            }
                                            paint.setColor(iArr[iK3]);
                                            canvas.drawRect(i15, i16, i15 + iK4, i16 + 1, paint);
                                        }
                                        i15 += iK4;
                                        if (z10) {
                                            paint = paint;
                                            z10 = z10;
                                        } else if (tVar.f625d == 0) {
                                            tVar.f625d = 0;
                                            tVar.f624c++;
                                            tVar.s();
                                        }
                                    }
                                    z10 = z10;
                                    iK4 = iK5;
                                    c3 = 4;
                                    if (iK4 == 0) {
                                    }
                                    i15 += iK4;
                                    if (z10) {
                                        paint = paint;
                                        z10 = z10;
                                    } else if (tVar.f625d == 0) {
                                        tVar.f625d = 0;
                                        tVar.f624c++;
                                        tVar.s();
                                    }
                                }
                                iK4 = 1;
                                c3 = 4;
                                if (iK4 == 0) {
                                }
                                i15 += iK4;
                                if (z10) {
                                    paint = paint;
                                    z10 = z10;
                                } else if (tVar.f625d == 0) {
                                    tVar.f625d = 0;
                                    tVar.f624c++;
                                    tVar.s();
                                }
                            }
                        }
                        bArr2 = bArr3;
                        z10 = false;
                        while (true) {
                            iK = tVar.k(2);
                            if (iK != 0) {
                                iK3 = iK;
                            } else {
                                if (tVar.q()) {
                                    iK5 = tVar.k(3) + 3;
                                    iK3 = tVar.k(2);
                                } else {
                                    if (tVar.q()) {
                                        iK3 = 0;
                                    } else {
                                        iK2 = tVar.k(2);
                                        if (iK2 != 0) {
                                            c3 = 4;
                                            iK3 = 0;
                                            iK4 = 0;
                                            z10 = true;
                                        } else if (iK2 != 1) {
                                            c3 = 4;
                                            z10 = z10;
                                            iK4 = 2;
                                            iK3 = 0;
                                        } else if (iK2 != 2) {
                                            if (iK2 != 3) {
                                                z10 = z10;
                                                iK3 = 0;
                                                iK4 = 0;
                                            } else {
                                                iK5 = tVar.k(8) + 29;
                                                iK3 = tVar.k(2);
                                            }
                                            c3 = 4;
                                        } else {
                                            c3 = 4;
                                            z10 = z10;
                                            iK4 = tVar.k(4) + 12;
                                            iK3 = tVar.k(2);
                                        }
                                    }
                                    if (iK4 == 0) {
                                    }
                                    i15 += iK4;
                                    if (z10) {
                                        paint = paint;
                                        z10 = z10;
                                    } else if (tVar.f625d == 0) {
                                        tVar.f625d = 0;
                                        tVar.f624c++;
                                        tVar.s();
                                    }
                                }
                                z10 = z10;
                                iK4 = iK5;
                                c3 = 4;
                                if (iK4 == 0) {
                                }
                                i15 += iK4;
                                if (z10) {
                                    paint = paint;
                                    z10 = z10;
                                } else if (tVar.f625d == 0) {
                                    tVar.f625d = 0;
                                    tVar.f624c++;
                                    tVar.s();
                                }
                            }
                            iK4 = 1;
                            c3 = 4;
                            if (iK4 == 0) {
                            }
                            i15 += iK4;
                            if (z10) {
                                paint = paint;
                                z10 = z10;
                            } else if (tVar.f625d == 0) {
                                tVar.f625d = 0;
                                tVar.f624c++;
                                tVar.s();
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i10 == 3 ? f9673j : null;
                        boolean z12 = false;
                        while (true) {
                            int iK10 = tVar.k(i18);
                            if (iK10 == 0) {
                                if (tVar.q()) {
                                    if (tVar.q()) {
                                        int iK11 = tVar.k(2);
                                        if (iK11 == 0) {
                                            iK10 = 0;
                                        } else if (iK11 == 1) {
                                            i13 = 2;
                                            iK10 = 0;
                                        } else if (iK11 == 2) {
                                            iK6 = tVar.k(i18) + 9;
                                            iK7 = tVar.k(i18);
                                        } else if (iK11 != i17) {
                                            z12 = z12;
                                            iK10 = 0;
                                            i13 = 0;
                                        } else {
                                            iK6 = tVar.k(8) + 25;
                                            iK7 = tVar.k(i18);
                                        }
                                    } else {
                                        iK6 = tVar.k(2) + i18;
                                        iK7 = tVar.k(i18);
                                    }
                                    i13 = iK6;
                                    iK10 = iK7;
                                    z12 = z12;
                                } else {
                                    int iK12 = tVar.k(i17);
                                    if (iK12 != 0) {
                                        i13 = iK12 + 2;
                                        iK10 = 0;
                                    } else {
                                        iK10 = 0;
                                        i13 = 0;
                                        z12 = true;
                                    }
                                }
                                if (i13 != 0 || paint == 0) {
                                    i14 = i17;
                                } else {
                                    if (bArr4 != 0) {
                                        iK10 = bArr4[iK10];
                                    }
                                    paint.setColor(iArr[iK10]);
                                    i14 = i17;
                                    canvas.drawRect(i15, i16, i15 + i13, i16 + 1, paint);
                                }
                                i15 += i13;
                                if (z12) {
                                    i17 = i14;
                                    z12 = z12;
                                    i18 = 4;
                                } else if (tVar.f625d == 0) {
                                    tVar.f625d = 0;
                                    tVar.f624c++;
                                    tVar.s();
                                }
                                break;
                            }
                            i13 = 1;
                            if (i13 != 0) {
                                i14 = i17;
                            } else {
                                i14 = i17;
                            }
                            i15 += i13;
                            if (z12) {
                                i17 = i14;
                                z12 = z12;
                                i18 = 4;
                            } else if (tVar.f625d == 0) {
                                tVar.f625d = 0;
                                tVar.f624c++;
                                tVar.s();
                            }
                            break;
                        }
                        break;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        int i19 = i15;
                        boolean z13 = false;
                        while (true) {
                            int iK13 = tVar.k(8);
                            if (iK13 != 0) {
                                z11 = z13;
                                iK8 = 1;
                            } else if (tVar.q()) {
                                z11 = z13;
                                iK8 = tVar.k(7);
                                iK13 = tVar.k(8);
                            } else {
                                int iK14 = tVar.k(7);
                                if (iK14 != 0) {
                                    z11 = z13;
                                    iK8 = iK14;
                                    iK13 = 0;
                                } else {
                                    iK13 = 0;
                                    iK8 = 0;
                                    z11 = true;
                                }
                            }
                            if (iK8 != 0 && paint != 0) {
                                paint.setColor(iArr[iK13]);
                                canvas.drawRect(i19, i16, i19 + iK8, i16 + 1, paint);
                            }
                            i19 += iK8;
                            if (z11) {
                                i15 = i19;
                            } else {
                                z13 = z11;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iK9) {
                            case com.amazon.c.a.a.c.f16581h /* 32 */:
                                bArrC2 = c(4, 4, tVar);
                                break;
                            case 33:
                                bArrC = c(4, 8, tVar);
                                break;
                            case 34:
                                bArrC = c(16, 8, tVar);
                                break;
                        }
                        break;
                }
            } else {
                i16 += 2;
                i15 = i11;
            }
        }
    }

    public static byte[] c(int i10, int i11, t tVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) tVar.k(i11);
        }
        return bArr;
    }

    public static d d(t tVar) {
        byte[] bArr;
        int iK = tVar.k(16);
        tVar.f(4);
        int iK2 = tVar.k(2);
        boolean zQ = tVar.q();
        tVar.f(1);
        byte[] bArr2 = null;
        if (iK2 != 1) {
            if (iK2 == 0) {
                int iK3 = tVar.k(16);
                int iK4 = tVar.k(16);
                if (iK3 > 0) {
                    bArr2 = new byte[iK3];
                    X4.a.q(tVar.f625d == 0);
                    System.arraycopy(tVar.f623b, tVar.f624c, bArr2, 0, iK3);
                    tVar.f624c += iK3;
                    tVar.s();
                }
                if (iK4 > 0) {
                    bArr = new byte[iK4];
                    X4.a.q(tVar.f625d == 0);
                    System.arraycopy(tVar.f623b, tVar.f624c, bArr, 0, iK4);
                    tVar.f624c += iK4;
                    tVar.s();
                }
            }
            return new d(iK, zQ, bArr2, bArr);
        }
        tVar.f(tVar.k(8) * 16);
        bArr = bArr2;
        return new d(iK, zQ, bArr2, bArr);
    }

    public static b e(t tVar, int i10) {
        int[] iArr;
        int iK;
        int i11;
        int iK2;
        int iK3;
        int iK4;
        int i12 = 8;
        int iK5 = tVar.k(8);
        tVar.f(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int i15 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrF = f();
        int[] iArrG = g();
        while (i14 > 0) {
            int iK6 = tVar.k(i12);
            int iK7 = tVar.k(i12);
            if ((iK7 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iK7 & 64) != 0 ? iArrF : iArrG;
            }
            if ((iK7 & 1) != 0) {
                iK3 = tVar.k(i12);
                iK4 = tVar.k(i12);
                iK = tVar.k(i12);
                iK2 = tVar.k(i12);
                i11 = i14 - 6;
            } else {
                int iK8 = tVar.k(6) << i13;
                int iK9 = tVar.k(4) << 4;
                iK = tVar.k(4) << 4;
                i11 = i14 - 4;
                iK2 = tVar.k(i13) << 6;
                iK3 = iK8;
                iK4 = iK9;
            }
            if (iK3 == 0) {
                iK4 = i15;
                iK = iK4;
                iK2 = 255;
            }
            double d10 = iK3;
            double d11 = iK4 - 128;
            double d12 = iK - 128;
            iArr[iK6] = a((byte) (255 - (iK2 & ColorExtractionConstants.COLOR_COMPONENT_MASK)), X4.j.b((int) ((1.402d * d11) + d10), 0, ColorExtractionConstants.COLOR_COMPONENT_MASK), X4.j.b((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, ColorExtractionConstants.COLOR_COMPONENT_MASK), X4.j.b((int) ((d12 * 1.772d) + d10), 0, ColorExtractionConstants.COLOR_COMPONENT_MASK));
            i14 = i11;
            i15 = 0;
            iK5 = iK5;
            iArrG = iArrG;
            i12 = 8;
            i13 = 2;
        }
        return new b(iK5, iArr2, iArrF, iArrG);
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(ColorExtractionConstants.COLOR_COMPONENT_MASK, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(ColorExtractionConstants.COLOR_COMPONENT_MASK, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = ColorExtractionConstants.COLOR_COMPONENT_MASK;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = a(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                if (i14 == 0) {
                    iArr[i10] = a(ColorExtractionConstants.COLOR_COMPONENT_MASK, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i10] = a(ColorExtractionConstants.COLOR_COMPONENT_MASK, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = a(ColorExtractionConstants.COLOR_COMPONENT_MASK, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }
}
