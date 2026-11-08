package p170p7;

import B2.AbstractC0112b;
import V0.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f25267b = new k(Collections.singletonList("__name__"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f25268c = new k(Collections.EMPTY_LIST);

    public static k l(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\') {
                i10++;
                if (i10 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i10));
            } else if (cCharAt == '.') {
                if (z10) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException(p.o("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z10 = !z10;
            } else {
                sb.append(cCharAt);
            }
            i10++;
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            throw new IllegalArgumentException(p.o("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(string2);
        return new k(arrayList);
    }

    @Override // p170p7.e
    public final String c() {
        char cCharAt;
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            List list = this.f25258a;
            if (i10 >= list.size()) {
                return sb.toString();
            }
            if (i10 > 0) {
                sb.append(".");
            }
            String strReplace = ((String) list.get(i10)).replace("\\", "\\\\").replace("`", "\\`");
            if (strReplace.isEmpty() || ((cCharAt = strReplace.charAt(0)) != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')))) {
                strReplace = AbstractC0112b.c('`', "`", strReplace);
                break;
                break;
            }
            for (int i11 = 1; i11 < strReplace.length(); i11++) {
                char cCharAt2 = strReplace.charAt(i11);
                if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                    strReplace = AbstractC0112b.c('`', "`", strReplace);
                    break;
                }
            }
            sb.append(strReplace);
            i10++;
        }
    }

    @Override // p170p7.e
    public final e e(List list) {
        return new k(list);
    }
}
