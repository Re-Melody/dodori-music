package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes2.dex */
public interface UrlConnectionFactory {

    public static final class DefaultImpls {
    }

    static /* synthetic */ UrlConnection createConnection$default(UrlConnectionFactory urlConnectionFactory, String str, int i10, int i11, String str2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConnection");
        }
        if ((i12 & 8) != 0) {
            str2 = "GET";
        }
        return urlConnectionFactory.createConnection(str, i10, i11, str2);
    }

    UrlConnection createConnection(String str, int i10, int i11, String str2);
}
