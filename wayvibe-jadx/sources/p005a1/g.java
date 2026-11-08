package p005a1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f14091c = new g(f.f14089b, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14093b;

    public g(float f10, int i10) {
        this.f14092a = f10;
        this.f14093b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f10 = gVar.f14092a;
        float f11 = f.f14088a;
        return Float.compare(this.f14092a, f10) == 0 && this.f14093b == gVar.f14093b;
    }

    public final int hashCode() {
        float f10 = f.f14088a;
        return Integer.hashCode(this.f14093b) + (Float.hashCode(this.f14092a) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f10 = this.f14092a;
        if (f10 == 0.0f) {
            float f11 = f.f14088a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f10 == f.f14088a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f10 == f.f14089b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f10 == f.f14090c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i10 = this.f14093b;
        if (i10 == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i10 == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i10 == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else {
            str2 = i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
