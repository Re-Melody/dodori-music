package okhttp3;

import V0.p;
import com.google.android.gms.common.api.f;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilCommonKt;
import org.slf4j.helpers.i;
import p097i9.k;
import p108j9.a;
import p108j9.b;
import p108j9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheControl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Companion f23940n = new Companion(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CacheControl f23941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final CacheControl f23942p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f23952j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f23953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f23954m;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23957c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23958d;

        public final CacheControl a() {
            return new CacheControl(this.f23955a, this.f23956b, -1, -1, false, false, false, this.f23957c, -1, this.f23958d, false, false, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0066 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x006c A[EDGE_INSN: B:109:0x006c->B:22:0x006c BREAK  A[LOOP:2: B:16:0x004e->B:20:0x005f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0049  */
        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:2: B:16:0x004e->B:20:0x005f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:51:0x010b  */
        /* JADX WARN: Code duplicated, block: B:54:0x0117  */
        /* JADX WARN: Code duplicated, block: B:56:0x011f  */
        /* JADX WARN: Code duplicated, block: B:58:0x0127  */
        /* JADX WARN: Code duplicated, block: B:59:0x012c  */
        /* JADX WARN: Code duplicated, block: B:61:0x0134  */
        /* JADX WARN: Code duplicated, block: B:63:0x013c  */
        /* JADX WARN: Code duplicated, block: B:65:0x0145  */
        /* JADX WARN: Code duplicated, block: B:66:0x014a  */
        /* JADX WARN: Code duplicated, block: B:68:0x0152  */
        /* JADX WARN: Code duplicated, block: B:69:0x0157  */
        /* JADX WARN: Code duplicated, block: B:71:0x015f  */
        /* JADX WARN: Code duplicated, block: B:72:0x0164  */
        /* JADX WARN: Code duplicated, block: B:74:0x016c  */
        /* JADX WARN: Code duplicated, block: B:75:0x0171  */
        /* JADX WARN: Code duplicated, block: B:77:0x0179  */
        /* JADX WARN: Code duplicated, block: B:78:0x0181  */
        /* JADX WARN: Code duplicated, block: B:80:0x0189  */
        /* JADX WARN: Code duplicated, block: B:81:0x018f  */
        /* JADX WARN: Code duplicated, block: B:83:0x0198  */
        /* JADX WARN: Code duplicated, block: B:84:0x019e  */
        /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:87:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
        public static CacheControl a(Headers headers) {
            int i10;
            int length;
            int length2;
            int i11;
            String string;
            String string2;
            int length3;
            Headers headers2 = headers;
            m.f(headers2, "headers");
            int size = headers2.size();
            int i12 = 0;
            boolean z10 = true;
            String str = null;
            boolean z11 = false;
            boolean z12 = false;
            int iM = -1;
            int iM2 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            int iM3 = -1;
            int iM4 = -1;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            while (i12 < size) {
                String strC = headers2.c(i12);
                String strH = headers2.h(i12);
                if (strC.equalsIgnoreCase("Cache-Control")) {
                    if (str == null) {
                        str = strH;
                    }
                    i10 = 0;
                    while (i10 < strH.length()) {
                        length = strH.length();
                        length2 = i10;
                        while (true) {
                            if (length2 < length) {
                                i11 = size;
                                length2 = strH.length();
                                break;
                            }
                            i11 = size;
                            if (k.m0("=,;", strH.charAt(length2))) {
                                break;
                            }
                            length2++;
                            size = i11;
                        }
                        String strSubstring = strH.substring(i10, length2);
                        m.e(strSubstring, "substring(...)");
                        string = k.S0(strSubstring).toString();
                        if (length2 != strH.length() || strH.charAt(length2) == ',' || strH.charAt(length2) == ';') {
                            i10 = length2 + 1;
                            string2 = null;
                        } else {
                            int length4 = length2 + 1;
                            byte[] bArr = _UtilCommonKt.f24159a;
                            int length5 = strH.length();
                            while (true) {
                                if (length4 >= length5) {
                                    length4 = strH.length();
                                    break;
                                }
                                char cCharAt = strH.charAt(length4);
                                int i13 = length5;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length4++;
                                length5 = i13;
                            }
                            if (length4 >= strH.length() || strH.charAt(length4) != '\"') {
                                int length6 = strH.length();
                                int i14 = length4;
                                while (true) {
                                    if (i14 >= length6) {
                                        length3 = strH.length();
                                        break;
                                    }
                                    int i15 = length6;
                                    int i16 = i14;
                                    if (k.m0(",;", strH.charAt(i14))) {
                                        length3 = i16;
                                        break;
                                    }
                                    i14 = i16 + 1;
                                    length6 = i15;
                                }
                                String strSubstring2 = strH.substring(length4, length3);
                                m.e(strSubstring2, "substring(...)");
                                string2 = k.S0(strSubstring2).toString();
                                i10 = length3;
                            } else {
                                int i17 = length4 + 1;
                                int iU0 = k.u0(strH, '\"', i17, 4);
                                string2 = strH.substring(i17, iU0);
                                m.e(string2, "substring(...)");
                                i10 = iU0 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z11 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z12 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iM = _UtilCommonKt.m(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iM2 = _UtilCommonKt.m(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z13 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z14 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z15 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iM3 = _UtilCommonKt.m(f.API_PRIORITY_OTHER, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iM4 = _UtilCommonKt.m(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z16 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z17 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z18 = true;
                        }
                        size = i11;
                    }
                    i12++;
                    headers2 = headers;
                    size = size;
                } else {
                    if (strC.equalsIgnoreCase("Pragma")) {
                    }
                    i12++;
                    headers2 = headers;
                    size = size;
                }
                z10 = false;
                i10 = 0;
                while (i10 < strH.length()) {
                    length = strH.length();
                    length2 = i10;
                    while (true) {
                        if (length2 < length) {
                            i11 = size;
                            length2 = strH.length();
                            break;
                        }
                        i11 = size;
                        if (k.m0("=,;", strH.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        size = i11;
                    }
                    String strSubstring3 = strH.substring(i10, length2);
                    m.e(strSubstring3, "substring(...)");
                    string = k.S0(strSubstring3).toString();
                    if (length2 != strH.length()) {
                        i10 = length2 + 1;
                        string2 = null;
                    } else {
                        i10 = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z11 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z12 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iM = _UtilCommonKt.m(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iM2 = _UtilCommonKt.m(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z13 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z14 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z15 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iM3 = _UtilCommonKt.m(f.API_PRIORITY_OTHER, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iM4 = _UtilCommonKt.m(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z16 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z17 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z18 = true;
                    }
                    size = i11;
                }
                i12++;
                headers2 = headers;
                size = size;
            }
            return new CacheControl(z11, z12, iM, iM2, z13, z14, z15, iM3, iM4, z16, z17, z18, !z10 ? null : str);
        }

        private Companion() {
        }
    }

    static {
        Builder builder = new Builder();
        builder.f23955a = true;
        f23941o = builder.a();
        Builder builder2 = new Builder();
        builder2.f23958d = true;
        a aVar = b.f21529b;
        d dVar = d.SECONDS;
        int i10 = f.API_PRIORITY_OTHER;
        long jH = b.h(i.J(f.API_PRIORITY_OTHER, dVar), dVar);
        if (jH < 0) {
            throw new IllegalArgumentException(p.j(jH, "maxStale < 0: ").toString());
        }
        if (jH <= 2147483647L) {
            i10 = (int) jH;
        }
        builder2.f23957c = i10;
        f23942p = builder2.a();
    }

    public CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f23943a = z10;
        this.f23944b = z11;
        this.f23945c = i10;
        this.f23946d = i11;
        this.f23947e = z12;
        this.f23948f = z13;
        this.f23949g = z14;
        this.f23950h = i12;
        this.f23951i = i13;
        this.f23952j = z15;
        this.k = z16;
        this.f23953l = z17;
        this.f23954m = str;
    }

    public final String toString() {
        String str = this.f23954m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23943a) {
            sb.append("no-cache, ");
        }
        if (this.f23944b) {
            sb.append("no-store, ");
        }
        int i10 = this.f23945c;
        if (i10 != -1) {
            sb.append("max-age=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.f23946d;
        if (i11 != -1) {
            sb.append("s-maxage=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f23947e) {
            sb.append("private, ");
        }
        if (this.f23948f) {
            sb.append("public, ");
        }
        if (this.f23949g) {
            sb.append("must-revalidate, ");
        }
        int i12 = this.f23950h;
        if (i12 != -1) {
            sb.append("max-stale=");
            sb.append(i12);
            sb.append(", ");
        }
        int i13 = this.f23951i;
        if (i13 != -1) {
            sb.append("min-fresh=");
            sb.append(i13);
            sb.append(", ");
        }
        if (this.f23952j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.f23953l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        m.e(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String string = sb.toString();
        this.f23954m = string;
        return string;
    }
}
