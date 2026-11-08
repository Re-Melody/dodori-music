package p177q4;

import okhttp3.Headers;
import org.apache.tika.metadata.HttpHeaders;
import p097i9.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static Headers a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strC = headers.c(i10);
            String strH = headers.h(i10);
            if ((!"Warning".equalsIgnoreCase(strC) || !r.j0(strH, "1", false)) && (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strC) || HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strC) || HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strC) || !b(strC) || headers2.a(strC) == null)) {
                builder.a(strC, strH);
            }
        }
        int size2 = headers2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String strC2 = headers2.c(i11);
            if (!HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strC2) && !HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strC2) && !HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strC2) && b(strC2)) {
                builder.a(strC2, headers2.h(i11));
            }
        }
        return builder.b();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
