package F8;

import E9.C0351l;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0351l f4590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b[] f4591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f4592c;

    static {
        C0351l c0351l = C0351l.f3388d;
        f4590a = p217u7.d.l(":");
        b bVar = new b(b.f4573h, "");
        C0351l c0351l2 = b.f4570e;
        b bVar2 = new b(c0351l2, "GET");
        b bVar3 = new b(c0351l2, "POST");
        C0351l c0351l3 = b.f4571f;
        b bVar4 = new b(c0351l3, "/");
        b bVar5 = new b(c0351l3, "/index.html");
        C0351l c0351l4 = b.f4572g;
        b bVar6 = new b(c0351l4, "http");
        b bVar7 = new b(c0351l4, "https");
        C0351l c0351l5 = b.f4569d;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(c0351l5, "200"), new b(c0351l5, "204"), new b(c0351l5, "206"), new b(c0351l5, "304"), new b(c0351l5, "400"), new b(c0351l5, "404"), new b(c0351l5, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b(DiagnosticsTracker.HOST_KEY, ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f4591b = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(bVarArr[i10].f4574a)) {
                linkedHashMap.put(bVarArr[i10].f4574a, Integer.valueOf(i10));
            }
        }
        f4592c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(C0351l c0351l) throws IOException {
        int iK = c0351l.k();
        for (int i10 = 0; i10 < iK; i10++) {
            byte bP = c0351l.p(i10);
            if (bP >= 65 && bP <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0351l.A()));
            }
        }
    }
}
