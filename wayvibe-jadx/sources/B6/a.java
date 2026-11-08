package B6;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f711h;

    public a(String str, char[] cArr) {
        byte[] bArr = new byte[ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD];
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        while (true) {
            if (i10 >= cArr.length) {
                this.f704a = str;
                this.f705b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    int iA = Q5.b.A(length);
                    this.f707d = iA;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iA);
                    int i11 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f708e = i11;
                    this.f709f = iA >> iNumberOfTrailingZeros;
                    this.f706c = cArr.length - 1;
                    this.f710g = bArr;
                    boolean[] zArr = new boolean[i11];
                    for (int i12 = 0; i12 < this.f709f; i12++) {
                        int i13 = this.f707d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[Q5.b.s(i12 * 8, i13)] = true;
                    }
                    this.f711h = zArr;
                    return;
                } catch (ArithmeticException e2) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
                }
            }
            char c3 = cArr[i10];
            if (!(c3 < 128)) {
                throw new IllegalArgumentException(p234w3.c.c("Non-ASCII character: %s", Character.valueOf(c3)));
            }
            if (!(bArr[c3] == -1)) {
                throw new IllegalArgumentException(p234w3.c.c("Duplicate character: %s", Character.valueOf(c3)));
            }
            bArr[c3] = (byte) i10;
            i10++;
        }
    }

    public final int a(char c3) throws d {
        if (c3 > 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c3));
        }
        byte b10 = this.f710g[c3];
        if (b10 != -1) {
            return b10;
        }
        if (c3 <= ' ' || c3 == 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c3));
        }
        throw new d("Unrecognized character: " + c3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Arrays.equals(this.f705b, aVar.f705b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f705b) + 1237;
    }

    public final String toString() {
        return this.f704a;
    }
}
