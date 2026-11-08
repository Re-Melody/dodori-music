package p255y2;

import B2.C;
import java.util.Arrays;
import p134m1.b;

/* JADX INFO: renamed from: y2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2332h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2332h f28879h = new C2332h(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f28883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28886g;

    static {
        b.y(0, 1, 2, 3, 4);
        C.D(5);
    }

    public C2332h(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f28880a = i10;
        this.f28881b = i11;
        this.f28882c = i12;
        this.f28883d = bArr;
        this.f28884e = i13;
        this.f28885f = i14;
    }

    public static String a(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? b.j(i10, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? b.j(i10, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 != 6) {
            return i10 != 7 ? b.j(i10, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean e(C2332h c2332h) {
        if (c2332h == null) {
            return true;
        }
        int i10 = c2332h.f28880a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c2332h.f28881b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c2332h.f28882c;
        if ((i12 != -1 && i12 != 3) || c2332h.f28883d != null) {
            return false;
        }
        int i13 = c2332h.f28885f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c2332h.f28884e;
        return i14 == -1 || i14 == 8;
    }

    public static int f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f28880a == -1 || this.f28881b == -1 || this.f28882c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2332h.class == obj.getClass()) {
            C2332h c2332h = (C2332h) obj;
            if (this.f28880a == c2332h.f28880a && this.f28881b == c2332h.f28881b && this.f28882c == c2332h.f28882c && Arrays.equals(this.f28883d, c2332h.f28883d) && this.f28884e == c2332h.f28884e && this.f28885f == c2332h.f28885f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f28886g == 0) {
            this.f28886g = ((((Arrays.hashCode(this.f28883d) + ((((((527 + this.f28880a) * 31) + this.f28881b) * 31) + this.f28882c) * 31)) * 31) + this.f28884e) * 31) + this.f28885f;
        }
        return this.f28886g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f28880a));
        sb.append(", ");
        sb.append(a(this.f28881b));
        sb.append(", ");
        sb.append(c(this.f28882c));
        sb.append(", ");
        sb.append(this.f28883d != null);
        sb.append(", ");
        String str2 = "NA";
        int i10 = this.f28884e;
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i11 = this.f28885f;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        return b.m(sb, str2, ")");
    }
}
