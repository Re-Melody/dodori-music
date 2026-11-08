package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPResponseOriginalSourceKt {
    public static final HTTPResponseOriginalSource getOriginalDataSource(HTTPResult hTTPResult) {
        m.f(hTTPResult, "<this>");
        if (hTTPResult.isLoadShedderResponse() && hTTPResult.isFallbackURL()) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Request to fallback URL was handled by load shedder, which should never happen. Defaulting to fallback source.", null);
        }
        if (hTTPResult.isFallbackURL()) {
            return HTTPResponseOriginalSource.FALLBACK;
        }
        return hTTPResult.isLoadShedderResponse() ? HTTPResponseOriginalSource.LOAD_SHEDDER : HTTPResponseOriginalSource.MAIN;
    }

    public static /* synthetic */ void getOriginalDataSource$annotations(HTTPResult hTTPResult) {
    }
}
