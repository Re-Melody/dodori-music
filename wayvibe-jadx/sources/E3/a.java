package E3;

import B2.u;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f3039c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f3040d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f3041a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f3042b = new StringBuilder();

    public static String a(u uVar, StringBuilder sb) {
        boolean z10 = false;
        sb.setLength(0);
        int i10 = uVar.f631b;
        int i11 = uVar.f632c;
        while (i10 < i11 && !z10) {
            char c3 = (char) uVar.f630a[i10];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb.append(c3);
            }
        }
        uVar.G(i10 - uVar.f631b);
        return sb.toString();
    }

    public static String b(u uVar, StringBuilder sb) {
        c(uVar);
        if (uVar.a() == 0) {
            return null;
        }
        String strA = a(uVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) uVar.t());
    }

    public static void c(u uVar) {
        while (true) {
            for (boolean z10 = true; uVar.a() > 0 && z10; z10 = false) {
                int i10 = uVar.f631b;
                byte[] bArr = uVar.f630a;
                byte b10 = bArr[i10];
                char c3 = (char) b10;
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    uVar.G(1);
                } else {
                    int i11 = uVar.f632c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            uVar.G(i11 - uVar.f631b);
                        }
                    }
                }
            }
            return;
        }
    }
}
