package p143n0;

import android.graphics.ColorFilter;
import p134m1.b;

/* JADX INFO: renamed from: n0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2087n extends AbstractC2097y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22783c;

    public C2087n(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f22782b = j10;
        this.f22783c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2087n)) {
            return false;
        }
        C2087n c2087n = (C2087n) obj;
        if (C2096x.c(this.f22782b, c2087n.f22782b)) {
            return this.f22783c == c2087n.f22783c;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Integer.hashCode(this.f22783c) + (Long.hashCode(this.f22782b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        b.u(this.f22782b, ", blendMode=", sb);
        int i10 = this.f22783c;
        if (i10 == 0) {
            str = "Clear";
        } else if (i10 == 1) {
            str = "Src";
        } else if (i10 == 2) {
            str = "Dst";
        } else if (i10 == 3) {
            str = "SrcOver";
        } else if (i10 == 4) {
            str = "DstOver";
        } else if (i10 == 5) {
            str = "SrcIn";
        } else if (i10 == 6) {
            str = "DstIn";
        } else if (i10 == 7) {
            str = "SrcOut";
        } else if (i10 == 8) {
            str = "DstOut";
        } else if (i10 == 9) {
            str = "SrcAtop";
        } else if (i10 == 10) {
            str = "DstAtop";
        } else if (i10 == 11) {
            str = "Xor";
        } else if (i10 == 12) {
            str = "Plus";
        } else if (i10 == 13) {
            str = "Modulate";
        } else if (i10 == 14) {
            str = "Screen";
        } else if (i10 == 15) {
            str = "Overlay";
        } else if (i10 == 16) {
            str = "Darken";
        } else if (i10 == 17) {
            str = "Lighten";
        } else if (i10 == 18) {
            str = "ColorDodge";
        } else if (i10 == 19) {
            str = "ColorBurn";
        } else if (i10 == 20) {
            str = "HardLight";
        } else if (i10 == 21) {
            str = "Softlight";
        } else if (i10 == 22) {
            str = "Difference";
        } else if (i10 == 23) {
            str = "Exclusion";
        } else if (i10 == 24) {
            str = "Multiply";
        } else if (i10 == 25) {
            str = "Hue";
        } else if (i10 == 26) {
            str = "Saturation";
        } else if (i10 == 27) {
            str = "Color";
        } else {
            str = i10 == 28 ? "Luminosity" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
