package io.grpc.okhttp.internal;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f21174a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f21175b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z10;
        String str2;
        char[] cArr;
        char c3;
        int i10;
        char c9;
        boolean z11 = true;
        boolean z12 = false;
        if (f21175b.matcher(str).matches()) {
            List listA = a(x509Certificate, 7);
            int size = listA.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (str.equalsIgnoreCase((String) listA.get(i11))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c10 = 2;
        List listA2 = a(x509Certificate, 2);
        int size2 = listA2.size();
        int i12 = 0;
        boolean z13 = false;
        while (i12 < size2) {
            if (c(lowerCase, (String) listA2.get(i12))) {
                return true;
            }
            i12++;
            z13 = true;
        }
        if (!z13) {
            d dVar = new d(x509Certificate.getSubjectX500Principal());
            dVar.f21169c = 0;
            dVar.f21170d = 0;
            dVar.f21171e = 0;
            dVar.f21172f = 0;
            String str3 = dVar.f21167a;
            dVar.f21173g = str3.toCharArray();
            String strC = dVar.c();
            String str4 = null;
            if (strC == null) {
                z10 = z12;
            } else {
                while (true) {
                    int i13 = dVar.f21169c;
                    int i14 = dVar.f21168b;
                    if (i13 == i14) {
                        break;
                    }
                    char c11 = dVar.f21173g[i13];
                    char c12 = c10;
                    boolean z14 = z11;
                    if (c11 == '\"') {
                        z10 = z12;
                        int i15 = i13 + 1;
                        dVar.f21169c = i15;
                        dVar.f21170d = i15;
                        dVar.f21171e = i15;
                        while (true) {
                            int i16 = dVar.f21169c;
                            if (i16 == i14) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = dVar.f21173g;
                            char c13 = cArr2[i16];
                            if (c13 == '\"') {
                                dVar.f21169c = i16 + 1;
                                while (true) {
                                    int i17 = dVar.f21169c;
                                    if (i17 >= i14 || dVar.f21173g[i17] != ' ') {
                                        break;
                                    }
                                    dVar.f21169c = i17 + 1;
                                }
                                char[] cArr3 = dVar.f21173g;
                                int i18 = dVar.f21170d;
                                str2 = new String(cArr3, i18, dVar.f21171e - i18);
                                break;
                            }
                            if (c13 == '\\') {
                                cArr2[dVar.f21171e] = dVar.b();
                            } else {
                                cArr2[dVar.f21171e] = c13;
                            }
                            dVar.f21169c++;
                            dVar.f21171e++;
                        }
                    } else if (c11 == '#') {
                        z10 = z12;
                        if (i13 + 4 >= i14) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        dVar.f21170d = i13;
                        dVar.f21169c = i13 + 1;
                        while (true) {
                            int i19 = dVar.f21169c;
                            if (i19 == i14 || (c3 = (cArr = dVar.f21173g)[i19]) == '+' || c3 == ',' || c3 == ';') {
                                dVar.f21171e = i19;
                                break;
                            }
                            if (c3 == ' ') {
                                dVar.f21171e = i19;
                                dVar.f21169c = i19 + 1;
                                while (true) {
                                    int i20 = dVar.f21169c;
                                    if (i20 >= i14 || dVar.f21173g[i20] != ' ') {
                                        break;
                                    }
                                    dVar.f21169c = i20 + 1;
                                }
                            } else {
                                if (c3 >= 'A' && c3 <= 'F') {
                                    cArr[i19] = (char) (c3 + ' ');
                                }
                                dVar.f21169c = i19 + 1;
                            }
                        }
                        int i21 = dVar.f21171e;
                        int i22 = dVar.f21170d;
                        int i23 = i21 - i22;
                        if (i23 < 5 || (i23 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        int i24 = i23 / 2;
                        byte[] bArr = new byte[i24];
                        int i25 = i22 + 1;
                        for (?? r12 = z10; r12 < i24; r12++) {
                            bArr[r12] = (byte) dVar.a(i25);
                            i25 += 2;
                        }
                        str2 = new String(dVar.f21173g, dVar.f21170d, i23);
                    } else if (c11 == '+' || c11 == ',' || c11 == ';') {
                        z10 = z12;
                        str2 = "";
                    } else {
                        dVar.f21170d = i13;
                        dVar.f21171e = i13;
                        while (true) {
                            int i26 = dVar.f21169c;
                            if (i26 >= i14) {
                                char[] cArr4 = dVar.f21173g;
                                int i27 = dVar.f21170d;
                                str2 = new String(cArr4, i27, dVar.f21171e - i27);
                                z10 = z12;
                            } else {
                                char[] cArr5 = dVar.f21173g;
                                char c14 = cArr5[i26];
                                if (c14 != ' ') {
                                    if (c14 != ';') {
                                        if (c14 == '\\') {
                                            z10 = z12;
                                            int i28 = dVar.f21171e;
                                            dVar.f21171e = i28 + 1;
                                            cArr5[i28] = dVar.b();
                                            dVar.f21169c++;
                                        } else if (c14 != '+' && c14 != ',') {
                                            int i29 = dVar.f21171e;
                                            z10 = z12;
                                            dVar.f21171e = i29 + 1;
                                            cArr5[i29] = c14;
                                            dVar.f21169c = i26 + 1;
                                        }
                                        z12 = z10;
                                    }
                                    z10 = z12;
                                    int i30 = dVar.f21170d;
                                    str2 = new String(cArr5, i30, dVar.f21171e - i30);
                                } else {
                                    z10 = z12;
                                    int i31 = dVar.f21171e;
                                    dVar.f21172f = i31;
                                    dVar.f21169c = i26 + 1;
                                    dVar.f21171e = i31 + 1;
                                    cArr5[i31] = ' ';
                                    while (true) {
                                        i10 = dVar.f21169c;
                                        if (i10 >= i14) {
                                            break;
                                        }
                                        char[] cArr6 = dVar.f21173g;
                                        if (cArr6[i10] != ' ') {
                                            break;
                                        }
                                        int i32 = dVar.f21171e;
                                        dVar.f21171e = i32 + 1;
                                        cArr6[i32] = ' ';
                                        dVar.f21169c = i10 + 1;
                                    }
                                    if (i10 == i14 || (c9 = dVar.f21173g[i10]) == ',' || c9 == '+' || c9 == ';') {
                                        char[] cArr7 = dVar.f21173g;
                                        int i33 = dVar.f21170d;
                                        str2 = new String(cArr7, i33, dVar.f21172f - i33);
                                    } else {
                                        z12 = z10;
                                    }
                                }
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(strC)) {
                        str4 = str2;
                    } else {
                        int i34 = dVar.f21169c;
                        if (i34 < i14) {
                            char c15 = dVar.f21173g[i34];
                            if (c15 != ',' && c15 != ';' && c15 != '+') {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            dVar.f21169c = i34 + 1;
                            strC = dVar.c();
                            if (strC == null) {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            c10 = c12;
                            z11 = z14;
                            z12 = z10;
                        }
                    }
                }
                z10 = z12;
            }
            return str4 != null ? c(lowerCase, str4) : z10;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
