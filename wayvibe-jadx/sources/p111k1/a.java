package p111k1;

import B2.AbstractC0112b;
import V0.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21566d;

    public static String a(int i10) {
        String str = "00000000" + Integer.toHexString(i10);
        return "#" + str.substring(str.length() - 8);
    }

    public final String toString() {
        String strJ = AbstractC0112b.j(new StringBuilder(), this.f21563a, ':');
        switch (this.f21564b) {
            case 900:
                StringBuilder sbO = AbstractC0112b.o(strJ);
                sbO.append(this.f21565c);
                return sbO.toString();
            case 901:
                StringBuilder sbO2 = AbstractC0112b.o(strJ);
                sbO2.append(this.f21566d);
                return sbO2.toString();
            case 902:
                StringBuilder sbO3 = AbstractC0112b.o(strJ);
                sbO3.append(a(this.f21565c));
                return sbO3.toString();
            case 903:
                return p.n(strJ, null);
            default:
                return p.n(strJ, "????");
        }
    }
}
