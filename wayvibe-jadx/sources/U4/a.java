package U4;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f12178c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X4.f f12179a = new X4.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f12180b = new StringBuilder();

    public static String a(X4.f fVar, StringBuilder sb) {
        b(fVar);
        if (fVar.a() == 0) {
            return null;
        }
        String strC = c(fVar, sb);
        if (!"".equals(strC)) {
            return strC;
        }
        return "" + ((char) fVar.i());
    }

    public static void b(X4.f fVar) {
        while (true) {
            for (boolean z10 = true; fVar.a() > 0 && z10; z10 = false) {
                int i10 = fVar.f13221b;
                byte[] bArr = fVar.f13220a;
                byte b10 = bArr[i10];
                char c3 = (char) b10;
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    fVar.g(1);
                } else {
                    int i11 = fVar.f13222c;
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
                            fVar.g(i11 - fVar.f13221b);
                        }
                    }
                }
            }
            return;
        }
    }

    public static String c(X4.f fVar, StringBuilder sb) {
        boolean z10 = false;
        sb.setLength(0);
        int i10 = fVar.f13221b;
        int i11 = fVar.f13222c;
        while (i10 < i11 && !z10) {
            char c3 = (char) fVar.f13220a[i10];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb.append(c3);
            }
        }
        fVar.g(i10 - fVar.f13221b);
        return sb.toString();
    }
}
