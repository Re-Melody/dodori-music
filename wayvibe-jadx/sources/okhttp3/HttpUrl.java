package okhttp3;

import D7.W;
import N8.o;
import R3.a;
import V0.p;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import p064f9.e;
import p097i9.k;
import p097i9.r;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpUrl {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Companion f24033i = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24041h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24042a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f24045d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f24048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f24049h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24043b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f24044c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24046e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f24047f = W.V("");

        public static ArrayList c(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iU0 = k.u0(str, '&', i10, 4);
                if (iU0 == -1) {
                    iU0 = str.length();
                }
                int iU1 = k.u0(str, '=', i10, 4);
                if (iU1 == -1 || iU1 > iU0) {
                    String strSubstring = str.substring(i10, iU0);
                    m.e(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iU1);
                    m.e(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iU1 + 1, iU0);
                    m.e(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iU0 + 1;
            }
            return arrayList;
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.f24042a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strC = _UrlKt.c(0, 0, 7, this.f24043b);
            String strC2 = _UrlKt.c(0, 0, 7, this.f24044c);
            String str2 = this.f24045d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = this.f24046e;
            if (iB == -1) {
                Companion companion = HttpUrl.f24033i;
                String str3 = this.f24042a;
                m.c(str3);
                companion.getClass();
                iB = Companion.b(str3);
            }
            ArrayList arrayList2 = this.f24047f;
            int i10 = iB;
            ArrayList arrayList3 = new ArrayList(o.o0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(_UrlKt.c(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = this.f24048g;
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(o.o0(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList5.add(str4 != null ? _UrlKt.c(0, 0, 3, str4) : null);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str5 = this.f24049h;
            return new HttpUrl(str, strC, strC2, str2, i10, arrayList3, arrayList, str5 != null ? _UrlKt.c(0, 0, 7, str5) : null, toString());
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:103:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:106:0x01c6 A[LOOP:4: B:106:0x01c6->B:221:?, LOOP_START, PHI: r1
  0x01c6: PHI (r1v21 int) = (r1v10 int), (r1v22 int) binds: [B:104:0x01c3, B:221:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:108:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:114:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:121:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:125:0x0201  */
        /* JADX WARN: Code duplicated, block: B:127:0x0223  */
        /* JADX WARN: Code duplicated, block: B:130:0x0241  */
        /* JADX WARN: Code duplicated, block: B:184:0x033e  */
        /* JADX WARN: Code duplicated, block: B:216:0x01d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:217:0x01d6 A[EDGE_INSN: B:217:0x01d6->B:112:0x01d6 BREAK  A[LOOP:3: B:100:0x01b7->B:110:0x01d2], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:218:0x01d2 A[EDGE_INSN: B:218:0x01d2->B:110:0x01d2 BREAK  A[LOOP:4: B:106:0x01c6->B:221:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:220:0x01d2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x013c  */
        /* JADX WARN: Code duplicated, block: B:76:0x0147  */
        /* JADX WARN: Code duplicated, block: B:77:0x014c  */
        public final void b(HttpUrl httpUrl, String input) {
            int i10;
            int i11;
            byte b10;
            int i12;
            int i13;
            int iC;
            byte bCharAt;
            int i14;
            int i15;
            int i16;
            char cCharAt;
            char cCharAt2;
            int i17 = 1;
            m.f(input, "input");
            byte[] bArr = _UtilCommonKt.f24159a;
            int iF = _UtilCommonKt.f(0, input.length(), input);
            int iG = _UtilCommonKt.g(iF, input.length(), input);
            byte b11 = -1;
            if (iG - iF >= 2) {
                char cCharAt3 = input.charAt(iF);
                char c3 = 'a';
                i10 = 6;
                if ((m.g(cCharAt3, 97) >= 0 && m.g(cCharAt3, 122) <= 0) || (m.g(cCharAt3, 65) >= 0 && m.g(cCharAt3, 90) <= 0)) {
                    i11 = iF + 1;
                    while (true) {
                        if (i11 < iG) {
                            char cCharAt4 = input.charAt(i11);
                            if ((c3 > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                                if (cCharAt4 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                i11++;
                                c3 = 'a';
                            }
                        }
                        i11 = -1;
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            } else {
                i11 = -1;
                i10 = 6;
            }
            if (i11 != -1) {
                if (r.i0(input, iF, "https:", true)) {
                    this.f24042a = "https";
                    iF += 6;
                } else {
                    if (!r.i0(input, iF, "http:", true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i11);
                        m.e(strSubstring, "substring(...)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f24042a = "http";
                    iF += 5;
                }
            } else {
                if (httpUrl == null) {
                    int i18 = i10;
                    throw new IllegalArgumentException(b.k("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > i18 ? k.R0(i18, input).concat("...") : input));
                }
                this.f24042a = httpUrl.f24034a;
            }
            int i19 = iF;
            int i20 = 0;
            while (true) {
                b10 = 47;
                i12 = i17;
                if (i19 >= iG || !((cCharAt2 = input.charAt(i19)) == '/' || cCharAt2 == '\\')) {
                    break;
                }
                i20++;
                i19++;
                i17 = i12;
            }
            ArrayList arrayList = this.f24047f;
            byte b12 = 35;
            if (i20 >= 2 || httpUrl == null) {
                i13 = iF + i20;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    iC = _UtilCommonKt.c(input, i13, iG, "@/\\?#");
                    if (iC != iG) {
                        bCharAt = input.charAt(iC);
                    } else {
                        bCharAt = b11;
                    }
                    if (bCharAt == b11 || bCharAt == b12 || bCharAt == b10 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (i21 == 0) {
                            int iB = _UtilCommonKt.b(input, ':', i13, iC);
                            String strA = _UrlKt.a(input, i13, iB, " \"':;<=>@[]^`{}|/\\?#", 112);
                            if (i22 != 0) {
                                strA = p.r(new StringBuilder(), this.f24043b, "%40", strA);
                            }
                            this.f24043b = strA;
                            if (iB != iC) {
                                this.f24044c = _UrlKt.a(input, iB + 1, iC, " \"':;<=>@[]^`{}|/\\?#", 112);
                                i21 = i12;
                            }
                            i22 = i12;
                        } else {
                            this.f24044c += "%40" + _UrlKt.a(input, i13, iC, " \"':;<=>@[]^`{}|/\\?#", 112);
                        }
                        i13 = iC + 1;
                        b10 = 47;
                        b12 = 35;
                        b11 = -1;
                    }
                }
                i14 = i13;
                while (true) {
                    if (i14 >= iC) {
                        cCharAt = input.charAt(i14);
                        if (cCharAt != ':') {
                            break;
                        }
                        if (cCharAt != '[') {
                            do {
                                i14++;
                                if (i14 < iC) {
                                    break;
                                }
                            } while (input.charAt(i14) != ']');
                        }
                        i14++;
                    } else {
                        i14 = iC;
                        break;
                    }
                }
                i15 = i14 + 1;
                if (i15 < iC) {
                    this.f24045d = _HostnamesCommonKt.b(_UrlKt.c(i13, i14, 4, input));
                    try {
                        i16 = Integer.parseInt(_UrlKt.a(input, i15, iC, "", 120));
                        if (i12 <= i16 || i16 >= 65536) {
                            i16 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f24046e = i16;
                    if (i16 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i15, iC);
                        m.e(strSubstring2, "substring(...)");
                        sb2.append(strSubstring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                } else {
                    this.f24045d = _HostnamesCommonKt.b(_UrlKt.c(i13, i14, 4, input));
                    Companion companion = HttpUrl.f24033i;
                    String str = this.f24042a;
                    m.c(str);
                    companion.getClass();
                    this.f24046e = Companion.b(str);
                }
                if (this.f24045d != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i13, i14);
                    m.e(strSubstring3, "substring(...)");
                    sb3.append(strSubstring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                iF = iC;
            } else if (m.b(httpUrl.f24034a, this.f24042a)) {
                this.f24043b = httpUrl.e();
                this.f24044c = httpUrl.a();
                this.f24045d = httpUrl.f24037d;
                this.f24046e = httpUrl.f24038e;
                arrayList.clear();
                arrayList.addAll(httpUrl.c());
                if (iF == iG || input.charAt(iF) == '#') {
                    String strD = httpUrl.d();
                    this.f24048g = strD != null ? c(_UrlKt.a(strD, 0, 0, " \"'<>#", 83)) : null;
                }
            } else {
                i13 = iF + i20;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    iC = _UtilCommonKt.c(input, i13, iG, "@/\\?#");
                    if (iC != iG) {
                        bCharAt = input.charAt(iC);
                    } else {
                        bCharAt = b11;
                    }
                    if (bCharAt == b11) {
                        break;
                    } else {
                        break;
                    }
                }
                i14 = i13;
                while (true) {
                    if (i14 >= iC) {
                        cCharAt = input.charAt(i14);
                        if (cCharAt != ':') {
                            break;
                            break;
                        }
                        if (cCharAt != '[') {
                            do {
                                i14++;
                                if (i14 < iC) {
                                    break;
                                    break;
                                }
                            } while (input.charAt(i14) != ']');
                        }
                        i14++;
                    } else {
                        i14 = iC;
                        break;
                    }
                }
                i15 = i14 + 1;
                if (i15 < iC) {
                    this.f24045d = _HostnamesCommonKt.b(_UrlKt.c(i13, i14, 4, input));
                    i16 = Integer.parseInt(_UrlKt.a(input, i15, iC, "", 120));
                    if (i12 <= i16) {
                        i16 = -1;
                    } else {
                        i16 = -1;
                    }
                    this.f24046e = i16;
                    if (i16 == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring4 = input.substring(i15, iC);
                        m.e(strSubstring4, "substring(...)");
                        sb4.append(strSubstring4);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.f24045d = _HostnamesCommonKt.b(_UrlKt.c(i13, i14, 4, input));
                    Companion companion2 = HttpUrl.f24033i;
                    String str2 = this.f24042a;
                    m.c(str2);
                    companion2.getClass();
                    this.f24046e = Companion.b(str2);
                }
                if (this.f24045d != null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring5 = input.substring(i13, i14);
                    m.e(strSubstring5, "substring(...)");
                    sb5.append(strSubstring5);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iF = iC;
            }
            int iC2 = _UtilCommonKt.c(input, iF, iG, "?#");
            if (iF != iC2) {
                char cCharAt5 = input.charAt(iF);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList.clear();
                    arrayList.add("");
                    iF++;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
                while (iF < iC2) {
                    int iC3 = _UtilCommonKt.c(input, iF, iC2, "/\\");
                    boolean z10 = iC3 < iC2;
                    String strA2 = _UrlKt.a(input, iF, iC3, " \"<>^`{}|/\\?#", 112);
                    if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                        if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                            if (((CharSequence) b.i(1, arrayList)).length() == 0) {
                                arrayList.set(arrayList.size() - 1, strA2);
                            } else {
                                arrayList.add(strA2);
                            }
                            if (z10) {
                                arrayList.add("");
                            }
                        } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                            arrayList.add("");
                        } else {
                            arrayList.set(arrayList.size() - 1, "");
                        }
                    }
                    iF = z10 ? iC3 + 1 : iC3;
                }
            }
            if (iC2 < iG && input.charAt(iC2) == '?') {
                int iB2 = _UtilCommonKt.b(input, '#', iC2, iG);
                this.f24048g = c(_UrlKt.a(input, iC2 + 1, iB2, " \"'<>#", 80));
                iC2 = iB2;
            }
            if (iC2 >= iG || input.charAt(iC2) != '#') {
                return;
            }
            this.f24049h = _UrlKt.a(input, iC2 + 1, iG, "", 48);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x008c  */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f24042a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f24043b.length() > 0 || this.f24044c.length() > 0) {
                sb.append(this.f24043b);
                if (this.f24044c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f24044c);
                }
                sb.append('@');
            }
            String str2 = this.f24045d;
            if (str2 != null) {
                if (k.m0(str2, ':')) {
                    sb.append('[');
                    sb.append(this.f24045d);
                    sb.append(']');
                } else {
                    sb.append(this.f24045d);
                }
            }
            int iB = this.f24046e;
            if (iB != -1 || this.f24042a != null) {
                if (iB == -1) {
                    Companion companion = HttpUrl.f24033i;
                    String str3 = this.f24042a;
                    m.c(str3);
                    companion.getClass();
                    iB = Companion.b(str3);
                }
                String str4 = this.f24042a;
                if (str4 != null) {
                    HttpUrl.f24033i.getClass();
                    if (iB != Companion.b(str4)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                } else {
                    sb.append(':');
                    sb.append(iB);
                }
            }
            ArrayList arrayList = this.f24047f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append('/');
                sb.append((String) arrayList.get(i10));
            }
            if (this.f24048g != null) {
                sb.append('?');
                Companion companion2 = HttpUrl.f24033i;
                ArrayList arrayList2 = this.f24048g;
                m.c(arrayList2);
                Companion.a(companion2, arrayList2, sb);
            }
            if (this.f24049h != null) {
                sb.append('#');
                sb.append(this.f24049h);
            }
            return sb.toString();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static final void a(Companion companion, ArrayList arrayList, StringBuilder sb) {
            companion.getClass();
            e eVarE0 = a.e0(2, a.j0(0, arrayList.size()));
            int i10 = eVarE0.f19892a;
            int i11 = eVarE0.f19893b;
            int i12 = eVarE0.f19894c;
            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                return;
            }
            while (true) {
                String str = (String) arrayList.get(i10);
                String str2 = (String) arrayList.get(i10 + 1);
                if (i10 > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i10 == i11) {
                    return;
                } else {
                    i10 += i12;
                }
            }
        }

        public static int b(String scheme) {
            m.f(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals("https") ? 443 : -1;
        }

        private Companion() {
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f24034a = str;
        this.f24035b = str2;
        this.f24036c = str3;
        this.f24037d = str4;
        this.f24038e = i10;
        this.f24039f = arrayList2;
        this.f24040g = str5;
        this.f24041h = str6;
    }

    public final String a() {
        if (this.f24036c.length() == 0) {
            return "";
        }
        int length = this.f24034a.length() + 3;
        String str = this.f24041h;
        String strSubstring = str.substring(k.u0(str, ':', length, 4) + 1, k.u0(str, '@', 0, 6));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f24034a.length() + 3;
        String str = this.f24041h;
        int iU0 = k.u0(str, '/', length, 4);
        String strSubstring = str.substring(iU0, _UtilCommonKt.c(str, iU0, str.length(), "?#"));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f24034a.length() + 3;
        String str = this.f24041h;
        int iU0 = k.u0(str, '/', length, 4);
        int iC = _UtilCommonKt.c(str, iU0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iU0 < iC) {
            int i10 = iU0 + 1;
            int iB = _UtilCommonKt.b(str, '/', i10, iC);
            String strSubstring = str.substring(i10, iB);
            m.e(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iU0 = iB;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f24039f == null) {
            return null;
        }
        String str = this.f24041h;
        int iU0 = k.u0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iU0, _UtilCommonKt.b(str, '#', iU0, str.length()));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f24035b.length() == 0) {
            return "";
        }
        int length = this.f24034a.length() + 3;
        String str = this.f24041h;
        String strSubstring = str.substring(length, _UtilCommonKt.c(str, length, str.length(), ":@"));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && m.b(((HttpUrl) obj).f24041h, this.f24041h);
    }

    public final boolean f() {
        return m.b(this.f24034a, "https");
    }

    public final String g() {
        Builder builder;
        try {
            builder = new Builder();
            builder.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        m.c(builder);
        builder.f24043b = _UrlKt.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        builder.f24044c = _UrlKt.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return builder.a().f24041h;
    }

    public final URI h() {
        String strSubstring;
        String strReplaceAll;
        Builder builder = new Builder();
        String str = this.f24034a;
        builder.f24042a = str;
        builder.f24043b = e();
        builder.f24044c = a();
        builder.f24045d = this.f24037d;
        f24033i.getClass();
        int iB = Companion.b(str);
        int i10 = this.f24038e;
        if (i10 == iB) {
            i10 = -1;
        }
        builder.f24046e = i10;
        ArrayList arrayList = builder.f24047f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        builder.f24048g = strD != null ? Builder.c(_UrlKt.a(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.f24040g == null) {
            strSubstring = null;
        } else {
            String str2 = this.f24041h;
            strSubstring = str2.substring(k.u0(str2, '#', 0, 6) + 1);
            m.e(strSubstring, "substring(...)");
        }
        builder.f24049h = strSubstring;
        String str3 = builder.f24045d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            m.e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            m.e(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        builder.f24045d = strReplaceAll;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, _UrlKt.a((String) arrayList.get(i11), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = builder.f24048g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str4 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str4 != null ? _UrlKt.a(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = builder.f24049h;
        builder.f24049h = str5 != null ? _UrlKt.a(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String input = builder.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e2) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                m.e(patternCompile2, "compile(...)");
                m.f(input, "input");
                String strReplaceAll2 = patternCompile2.matcher(input).replaceAll("");
                m.e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                m.c(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f24041h.hashCode();
    }

    public final String toString() {
        return this.f24041h;
    }
}
