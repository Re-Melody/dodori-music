package com.revenuecat.purchases.paywalls.fonts;

import B2.AbstractC0112b;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadableFontInfo {
    private final String expectedMd5;
    private final String family;
    private final FontStyle style;
    private final String url;
    private final int weight;

    public DownloadableFontInfo(String url, String expectedMd5, String family, int i10, FontStyle style) {
        m.f(url, "url");
        m.f(expectedMd5, "expectedMd5");
        m.f(family, "family");
        m.f(style, "style");
        this.url = url;
        this.expectedMd5 = expectedMd5;
        this.family = family;
        this.weight = i10;
        this.style = style;
    }

    public static /* synthetic */ DownloadableFontInfo copy$default(DownloadableFontInfo downloadableFontInfo, String str, String str2, String str3, int i10, FontStyle fontStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = downloadableFontInfo.url;
        }
        if ((i11 & 2) != 0) {
            str2 = downloadableFontInfo.expectedMd5;
        }
        if ((i11 & 4) != 0) {
            str3 = downloadableFontInfo.family;
        }
        if ((i11 & 8) != 0) {
            i10 = downloadableFontInfo.weight;
        }
        if ((i11 & 16) != 0) {
            fontStyle = downloadableFontInfo.style;
        }
        FontStyle fontStyle2 = fontStyle;
        String str4 = str3;
        return downloadableFontInfo.copy(str, str2, str4, i10, fontStyle2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.expectedMd5;
    }

    public final String component3() {
        return this.family;
    }

    public final int component4() {
        return this.weight;
    }

    public final FontStyle component5() {
        return this.style;
    }

    public final DownloadableFontInfo copy(String url, String expectedMd5, String family, int i10, FontStyle style) {
        m.f(url, "url");
        m.f(expectedMd5, "expectedMd5");
        m.f(family, "family");
        m.f(style, "style");
        return new DownloadableFontInfo(url, expectedMd5, family, i10, style);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableFontInfo)) {
            return false;
        }
        DownloadableFontInfo downloadableFontInfo = (DownloadableFontInfo) obj;
        return m.b(this.url, downloadableFontInfo.url) && m.b(this.expectedMd5, downloadableFontInfo.expectedMd5) && m.b(this.family, downloadableFontInfo.family) && this.weight == downloadableFontInfo.weight && this.style == downloadableFontInfo.style;
    }

    public final /* synthetic */ String getExpectedMd5() {
        return this.expectedMd5;
    }

    public final /* synthetic */ String getFamily() {
        return this.family;
    }

    public final /* synthetic */ FontStyle getStyle() {
        return this.style;
    }

    public final /* synthetic */ String getUrl() {
        return this.url;
    }

    public final /* synthetic */ int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.style.hashCode() + b.c(this.weight, AbstractC0112b.a(AbstractC0112b.a(this.url.hashCode() * 31, 31, this.expectedMd5), 31, this.family), 31);
    }

    public String toString() {
        return "DownloadableFontInfo(url=" + this.url + ", expectedMd5=" + this.expectedMd5 + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
    }
}
