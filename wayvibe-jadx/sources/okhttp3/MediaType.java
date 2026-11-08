package okhttp3;

import B2.AbstractC0112b;
import Z.l;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.m;
import p097i9.e;
import p097i9.g;
import p097i9.h;
import p097i9.j;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f24050b = new Companion(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f24051c = new j("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f24052d = new j(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24053a;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static MediaType a(String str) {
            m.f(str, "<this>");
            h hVarD = MediaType.f24051c.d(0, str);
            if (hVarD == null) {
                throw new IllegalArgumentException(AbstractC0112b.c('\"', "No subtype found for: \"", str));
            }
            String str2 = (String) ((g) hVarD.a()).get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) ((g) hVarD.a()).get(2)).toLowerCase(locale);
            m.e(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int i10 = hVarD.b().f19893b;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                h hVarD2 = MediaType.f24052d.d(i11, str);
                if (hVarD2 == null) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i11);
                    m.e(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(AbstractC0112b.j(sb, str, '\"').toString());
                }
                l lVar = hVarD2.f20584c;
                e eVarN = lVar.n(1);
                String str3 = eVarN != null ? eVarN.f20579a : null;
                if (str3 == null) {
                    i10 = hVarD2.b().f19893b;
                } else {
                    e eVarN2 = lVar.n(2);
                    String strSubstring2 = eVarN2 != null ? eVarN2.f20579a : null;
                    if (strSubstring2 == null) {
                        e eVarN3 = lVar.n(3);
                        m.c(eVarN3);
                        strSubstring2 = eVarN3.f20579a;
                    } else if (k.K0(strSubstring2, '\'') && k.r0(strSubstring2, '\'') && strSubstring2.length() > 2) {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                        m.e(strSubstring2, "substring(...)");
                    }
                    arrayList.add(str3);
                    arrayList.add(strSubstring2);
                    i10 = hVarD2.b().f19893b;
                }
            }
        }

        private Companion() {
        }
    }

    public MediaType(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        m.f(mediaType, "mediaType");
        m.f(parameterNamesAndValues, "parameterNamesAndValues");
        this.f24053a = mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && m.b(((MediaType) obj).f24053a, this.f24053a);
    }

    public final int hashCode() {
        return this.f24053a.hashCode();
    }

    public final String toString() {
        return this.f24053a;
    }
}
