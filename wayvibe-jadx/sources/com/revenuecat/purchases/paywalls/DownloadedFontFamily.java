package com.revenuecat.purchases.paywalls;

import B2.AbstractC0112b;
import N8.s;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class DownloadedFontFamily {
    private final String family;
    private final List<DownloadedFont> fonts;

    public DownloadedFontFamily(String family, List<DownloadedFont> fonts) {
        m.f(family, "family");
        m.f(fonts, "fonts");
        this.family = family;
        this.fonts = fonts;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadedFontFamily)) {
            return false;
        }
        DownloadedFontFamily downloadedFontFamily = (DownloadedFontFamily) obj;
        return m.b(this.family, downloadedFontFamily.family) && m.b(this.fonts, downloadedFontFamily.fonts);
    }

    public final /* synthetic */ String getFamily() {
        return this.family;
    }

    public final /* synthetic */ List getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        return this.fonts.hashCode() + (this.family.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadedFontFamily(family=");
        sb.append(this.family);
        sb.append(", fonts=");
        return AbstractC0112b.m(sb, this.fonts, ')');
    }

    public /* synthetic */ DownloadedFontFamily(String str, List list, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? s.f8650a : list);
    }
}
