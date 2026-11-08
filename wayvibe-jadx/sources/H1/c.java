package H1;

import B2.AbstractC0112b;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5741h;

    public c(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f5734a = str;
        str2.getClass();
        this.f5735b = str2;
        this.f5736c = str3;
        list.getClass();
        this.f5737d = list;
        this.f5738e = 0;
        this.f5739f = str4;
        this.f5740g = str5;
        this.f5741h = a(str, str2, str3, str4, str5);
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        return AbstractC0112b.l(sb, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5734a + ", mProviderPackage: " + this.f5735b + ", mQuery: " + this.f5736c + ", mSystemFont: " + this.f5739f + ", mVariationSettings: " + this.f5740g + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f5737d;
            if (i10 >= list.size()) {
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f5738e);
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i10++;
        }
    }

    public c(int i10, String str, String str2, String str3) {
        str.getClass();
        this.f5734a = str;
        str2.getClass();
        this.f5735b = str2;
        str3.getClass();
        this.f5736c = str3;
        this.f5737d = null;
        if (i10 != 0) {
            this.f5738e = i10;
            this.f5739f = null;
            this.f5740g = null;
            this.f5741h = a(str, str2, str3, null, null);
            return;
        }
        throw new IllegalArgumentException();
    }
}
