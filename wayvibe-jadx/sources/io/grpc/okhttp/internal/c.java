package io.grpc.okhttp.internal;

import V0.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21162e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f21164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f21165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21166d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        b bVar = new b(true);
        bVar.a(aVarArr);
        m mVar = m.TLS_1_3;
        m mVar2 = m.TLS_1_2;
        bVar.b(mVar, mVar2);
        if (!bVar.f21158a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        bVar.f21161d = true;
        c cVar = new c(bVar);
        f21162e = cVar;
        b bVar2 = new b(cVar);
        bVar2.b(mVar, mVar2, m.TLS_1_1, m.TLS_1_0);
        if (!bVar2.f21158a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        bVar2.f21161d = true;
        new c(bVar2);
        new c(new b(false));
    }

    public c(b bVar) {
        this.f21163a = bVar.f21158a;
        this.f21164b = bVar.f21159b;
        this.f21165c = bVar.f21160c;
        this.f21166d = bVar.f21161d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        boolean z10 = cVar.f21163a;
        boolean z11 = this.f21163a;
        if (z11 != z10) {
            return false;
        }
        if (z11) {
            return Arrays.equals(this.f21164b, cVar.f21164b) && Arrays.equals(this.f21165c, cVar.f21165c) && this.f21166d == cVar.f21166d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f21163a) {
            return ((((527 + Arrays.hashCode(this.f21164b)) * 31) + Arrays.hashCode(this.f21165c)) * 31) + (!this.f21166d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        m mVar;
        if (!this.f21163a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f21164b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            a[] aVarArr = new a[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                aVarArr[i10] = str.startsWith("SSL_") ? a.valueOf("TLS_" + str.substring(4)) : a.valueOf(str);
            }
            String[] strArr2 = n.f21192a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
        }
        StringBuilder sbU = p.u("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f21165c;
        m[] mVarArr = new m[strArr3.length];
        for (int i11 = 0; i11 < strArr3.length; i11++) {
            String str2 = strArr3[i11];
            if ("TLSv1.3".equals(str2)) {
                mVar = m.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                mVar = m.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                mVar = m.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                mVar = m.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(p134m1.b.k("Unexpected TLS version: ", str2));
                }
                mVar = m.SSL_3_0;
            }
            mVarArr[i11] = mVar;
        }
        String[] strArr4 = n.f21192a;
        sbU.append(Collections.unmodifiableList(Arrays.asList((Object[]) mVarArr.clone())));
        sbU.append(", supportsTlsExtensions=");
        sbU.append(this.f21166d);
        sbU.append(")");
        return sbU.toString();
    }
}
