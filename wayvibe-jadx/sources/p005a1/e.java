package p005a1;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14086b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14087a;

    public static String a(int i10) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i11 = i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        String str3 = "Invalid";
        if (i11 == 1) {
            str = "Strategy.Simple";
        } else if (i11 == 2) {
            str = "Strategy.HighQuality";
        } else if (i11 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i11 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", strictness=");
        int i12 = (i10 >> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        if (i12 == 1) {
            str2 = "Strictness.None";
        } else if (i12 == 2) {
            str2 = "Strictness.Loose";
        } else if (i12 == 3) {
            str2 = "Strictness.Normal";
        } else if (i12 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i12 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(", wordBreak=");
        int i13 = (i10 >> 16) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        if (i13 == 1) {
            str3 = "WordBreak.None";
        } else if (i13 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i13 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb.append((Object) str3);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f14087a == ((e) obj).f14087a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14087a);
    }

    public final String toString() {
        return a(this.f14087a);
    }
}
