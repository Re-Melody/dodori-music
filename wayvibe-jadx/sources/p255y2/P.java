package p255y2;

import B2.AbstractC0111a;
import B2.AbstractC0112b;
import B2.C;
import java.util.Arrays;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2339o[] f28805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28806e;

    static {
        C.D(0);
        C.D(1);
    }

    public P(String str, C2339o... c2339oArr) {
        AbstractC0111a.d(c2339oArr.length > 0);
        this.f28803b = str;
        this.f28805d = c2339oArr;
        this.f28802a = c2339oArr.length;
        int iG = C.g(c2339oArr[0].f28954m);
        this.f28804c = iG == -1 ? C.g(c2339oArr[0].f28953l) : iG;
        String str2 = c2339oArr[0].f28946d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = c2339oArr[0].f28948f | 16384;
        for (int i11 = 1; i11 < c2339oArr.length; i11++) {
            String str3 = c2339oArr[i11].f28946d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i11, "languages", c2339oArr[0].f28946d, c2339oArr[i11].f28946d);
                return;
            } else {
                if (i10 != (c2339oArr[i11].f28948f | 16384)) {
                    b(i11, "role flags", Integer.toBinaryString(c2339oArr[0].f28948f), Integer.toBinaryString(c2339oArr[i11].f28948f));
                    return;
                }
            }
        }
    }

    public static void b(int i10, String str, String str2, String str3) {
        StringBuilder sbQ = b.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbQ.append(str3);
        sbQ.append("' (track ");
        sbQ.append(i10);
        sbQ.append(")");
        AbstractC0111a.m("TrackGroup", "", new IllegalStateException(sbQ.toString()));
    }

    public final int a(C2339o c2339o) {
        int i10 = 0;
        while (true) {
            C2339o[] c2339oArr = this.f28805d;
            if (i10 >= c2339oArr.length) {
                return -1;
            }
            if (c2339o == c2339oArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class == obj.getClass()) {
            P p10 = (P) obj;
            if (this.f28803b.equals(p10.f28803b) && Arrays.equals(this.f28805d, p10.f28805d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f28806e == 0) {
            this.f28806e = Arrays.hashCode(this.f28805d) + AbstractC0112b.a(527, 31, this.f28803b);
        }
        return this.f28806e;
    }
}
