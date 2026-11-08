package com.revenuecat.purchases.paywalls;

import Z8.c;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes2.dex */
public final class FontLoader$getCachedFontFamilyOrStartDownload$4$1 extends n implements c {
    final /* synthetic */ y $cachedFontFamily;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontLoader$getCachedFontFamilyOrStartDownload$4$1(y yVar) {
        super(1);
        this.$cachedFontFamily = yVar;
    }

    @Override // Z8.c
    public final Boolean invoke(Map.Entry<DownloadableFontInfo, String> it) {
        m.f(it, "it");
        return Boolean.valueOf(m.b(it.getValue(), ((DownloadedFontFamily) this.$cachedFontFamily.f21873a).getFamily()));
    }
}
